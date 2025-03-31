package com.spring.rubrica.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.spring.rubrica.entity.Contatto;
import com.spring.rubrica.entity.Rubrica;

@Repository
public class DAORubricaImpl implements DAORubrica {

	public Connection connessione() {
		// PUNTO 1 : Carico i driver in memoria
		Connection conn = null;
		try {
			String driver = "org.postgresql.Driver";
			Class.forName(driver);
			// PUNTO 2 : Creo url di connessione
			String url = "jdbc:postgresql://localhost:5432/rubrica?user=postgres&password=postgres&ssl=false";

			// PUNTO 3 : Connetto al database
			conn = DriverManager.getConnection(url);
		} catch (ClassNotFoundException | SQLException ex) {
			System.out.println("Errore della connessione");
		}
		return conn;
	}

	public void ChiusuraConnessione(Connection conn, ResultSet result, PreparedStatement prep) {
		try {
			if (result != null) {
				result.close();
			}else {
				result = null;
			}
			conn.close();
			prep.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean insert(Rubrica rubrica) {
		Connection conn = connessione();
		String miaquery = "INSERT INTO rubrica (id,proprietario, anno_creazione) VALUES(?,?,?)";
		PreparedStatement prep = null; 
		try {
			prep = conn.prepareStatement(miaquery);
			prep.setInt(1, rubrica.getId());
			prep.setString(2, rubrica.getProprietario());
			prep.setInt(3, rubrica.getAnno_creazione());
			// PUNTO 5 : eseguire la QUERY
			prep.execute();

		} catch (SQLException e) {
			return false;

		} finally {
			ChiusuraConnessione(conn, null, prep);
		}
		return true;
	}

	public List<Rubrica> selectAll() {
		Connection conn = connessione();
		String miaquery = "select * from rubrica";
		String miaquery2 = "select * from contatti where rubrica_id = ? ";
		ArrayList<Rubrica> rubriche = new ArrayList<>();
		PreparedStatement prep = null;
		ResultSet ris = null;
		try {
			prep = conn.prepareStatement(miaquery);
			ris = prep.executeQuery();
			while (ris.next()) {
				Integer id = ris.getInt("id");
				String proprietario = ris.getString("proprietario");
				Integer anno = ris.getInt("anno_creazione");

				Map<Integer, Contatto> contatti = new HashMap<>();
				prep = conn.prepareStatement(miaquery2);
				prep.setInt(1, id);
				ResultSet risultato = prep.executeQuery();
				while (ris.next()) {
					int id_c = risultato.getInt("id");
					String nome = risultato.getString("nome");
					String cognome = risultato.getString("cognome");
					int numero = risultato.getInt("numero");
					String gruppo = risultato.getString("gruppo_appartenenza");
					Date data = risultato.getDate("data_nascita");
					boolean preferito = risultato.getBoolean("preferito");
					contatti.put(id_c, new Contatto(id_c, nome, cognome, numero, gruppo, data, preferito));
				}
				rubriche.add(new Rubrica(id, proprietario, anno, contatti));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ChiusuraConnessione(conn, ris, prep);
		}
		return rubriche;
	}

	public Rubrica selectById(Integer idRubrica) {
		Rubrica rubrica = new Rubrica();
		Connection conn = connessione();
		String miaquery = "select * from rubrica where id = ?";
		String miaquery2 = "select * from contatti where rubrica_id = ? ";
		PreparedStatement prep = null;
		ResultSet ris = null;
		try {
			prep = conn.prepareStatement(miaquery);
			prep.setInt(1, idRubrica);
			ResultSet risultato = prep.executeQuery();
			if (risultato.next()) {
				Integer id = risultato.getInt("id");
				String proprietario = risultato.getString("proprietario");
				Integer anno = risultato.getInt("anno_creazione");

				Map<Integer, Contatto> contatti = new HashMap<>();
				prep = conn.prepareStatement(miaquery2);
				prep.setInt(1, id);
				ris = prep.executeQuery();
				while (ris.next()) {
					int id_c = ris.getInt("id");
					String nome = ris.getString("nome");
					String cognome = ris.getString("cognome");
					int numero = ris.getInt("numero");
					String gruppo = ris.getString("gruppo_appartenenza");
					Date data = ris.getDate("data_nascita");
					boolean preferito = ris.getBoolean("preferito");
					contatti.put(id_c, new Contatto(id_c, nome, cognome, numero, gruppo, data, preferito));
				}
				rubrica.setId(id);
				rubrica.setProprietario(proprietario);
				rubrica.setAnno_creazione(anno);
				rubrica.setContatti(contatti);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ChiusuraConnessione(conn, ris, prep);
		}
		return rubrica;
	}

	public void delete(Integer idRubrica) {
		Connection conn = connessione();
		String miaquery = "delete from rubrica where id = ?";
		PreparedStatement prep = null;
		try {
			prep = conn.prepareStatement(miaquery);
			prep.setInt(1, idRubrica);
			prep.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			ChiusuraConnessione(conn, null, prep);
		}
	}

	public void update(Rubrica rubrica) {
		Connection conn = connessione();
		String miaquery = "UPDATE rubrica SET proprietario = ?, anno_creazione= ? WHERE id = ?";
		PreparedStatement prep = null;
		try {
			prep = conn.prepareStatement(miaquery);
			prep.setString(1, rubrica.getProprietario());
			prep.setInt(2, rubrica.getAnno_creazione());
			prep.setInt(3, rubrica.getId());
			prep.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ChiusuraConnessione(conn, null, prep);
		}
	}
	
// 	--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	

			//DAO CONTATTO
	
	public boolean insert(int idRubrica, Contatto contatto) {
	    Connection conn = connessione();
	    String miaquery = "INSERT INTO public.contatti(\n"
	            + "	id, nome, cognome, numero, gruppo_appartenenza, data_nascita, preferito, rubrica_id)\n"
	            + "	VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
	    PreparedStatement prep = null; 
	    try {
	        prep = conn.prepareStatement(miaquery);
	        prep.setInt(1, contatto.getId());
	        prep.setString(2, contatto.getNome());
	        prep.setString(3, contatto.getCognome());
	        prep.setInt(4, contatto.getNumero()); 
	        prep.setString(5, contatto.getGruppo_appartenenza());
	        prep.setDate(6, contatto.getData_nascita());
	        prep.setBoolean(7, contatto.isPreferito());
	        prep.setInt(8, idRubrica);
	        prep.execute();
	    } catch (SQLException e) {
	        e.printStackTrace();  // Stampiamo l'errore per debug
	        return false;
	    } finally {
	        ChiusuraConnessione(conn, null, prep);
	    }
	    return true;
	}
	
	public List<Contatto> selectAllContatti(int idRubrica) {
		Connection conn = connessione();
		String miaquery = "select * from contatti where rubrica_id = ? ";
		ArrayList<Contatto> contatti = new ArrayList<>();
		PreparedStatement prep = null;
		ResultSet ris = null;
		try {	
				prep = conn.prepareStatement(miaquery);
				prep.setInt(1, idRubrica);
				ris = prep.executeQuery();
				while (ris.next()) {
					int id = ris.getInt("id");
					String nome = ris.getString("nome");
					String cognome = ris.getString("cognome");
					int numero = ris.getInt("numero");
					String gruppo = ris.getString("gruppo_appartenenza");
					Date data = ris.getDate("data_nascita");
					boolean preferito = ris.getBoolean("preferito");
					contatti.add(new Contatto(id, nome, cognome, numero, gruppo, data, preferito));
				}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ChiusuraConnessione(conn, ris, prep);
		}
		return contatti ;
	}


	
	
	
}