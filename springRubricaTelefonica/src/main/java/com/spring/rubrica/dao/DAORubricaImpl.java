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

	private Map<Integer, Rubrica> mappa = new HashMap<>();

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

	public boolean insert(Rubrica rubrica) {
		Connection conn = connessione();
		String miaquery = "INSERT INTO rubrica (id,proprietario, anno_creazione) VALUES(?,?,?;)";
		PreparedStatement prep;
		try {
			prep = conn.prepareStatement(miaquery);
			prep.setInt(1, rubrica.getId());
			prep.setString(2, rubrica.getProprietario());
			prep.setInt(3, rubrica.getAnno_creazione());
			// PUNTO 5 : eseguire la QUERY
			prep.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	public List<Rubrica> selectAll() {
		Connection conn = connessione();
		String miaquery = "select * from rubrica";
		String miaquery2 = "select * from contatti where rubrica_id = ? ";
		ArrayList<Rubrica> rubriche = new ArrayList<>();
		PreparedStatement prep;
		try {
			prep = conn.prepareStatement(miaquery);
			ResultSet risultato = prep.executeQuery(); 
			while(risultato.next()) {
				Integer id = risultato.getInt("id");
				String proprietario =  risultato.getString("proprietario");
				Integer anno = risultato.getInt("anno_creazione");
				
				Map<Integer, Contatto> contatti = new HashMap<>();
				prep = conn.prepareStatement(miaquery2);
				prep.setInt(1, id);
				ResultSet ris = prep.executeQuery(); 
				while(ris.next()) {
					int id_c = ris.getInt("id");
					String nome = ris.getString("nome");
					String cognome = ris.getString("cognome");
					int numero = ris.getInt("numero");
					String gruppo = ris.getString("gruppo_appartenenza");
					Date data = ris.getDate("data_nascita");
					boolean preferito = ris.getBoolean("preferito");
					contatti.put(id_c , new Contatto(id_c, nome, cognome, numero, gruppo, data, preferito));
				}
				rubriche.add(new Rubrica(id, proprietario, anno, contatti));
				
			}
		} catch (SQLException e){
			e.printStackTrace();
		}
		return rubriche;
	}
	
	public Rubrica selectById(Integer idRubrica) {
		Rubrica rubrica = new Rubrica();
		Connection conn = connessione();
		String miaquery = "select * from rubrica where id = ?";
		String miaquery2 = "select * from contatti where rubrica_id = ? ";
		PreparedStatement prep;
		try {
			prep = conn.prepareStatement(miaquery);
			prep.setInt(1, idRubrica);
			ResultSet risultato = prep.executeQuery(); 
			if(risultato.next()) {
				Integer id = risultato.getInt("id");
				String proprietario =  risultato.getString("proprietario");
				Integer anno = risultato.getInt("anno_creazione");
				
				Map<Integer, Contatto> contatti = new HashMap<>();
				prep = conn.prepareStatement(miaquery2);
				prep.setInt(1, id);
				ResultSet ris = prep.executeQuery(); 
				while(ris.next()) {
					int id_c = ris.getInt("id");
					String nome = ris.getString("nome");
					String cognome = ris.getString("cognome");
					int numero = ris.getInt("numero");
					String gruppo = ris.getString("gruppo_appartenenza");
					Date data = ris.getDate("data_nascita");
					boolean preferito = ris.getBoolean("preferito");
					contatti.put(id_c , new Contatto(id_c, nome, cognome, numero, gruppo, data, preferito));
				}
				rubrica.setId(id);
				rubrica.setProprietario(proprietario);
				rubrica.setAnno_creazione(anno);
				rubrica.setContatti(contatti);
			}
		} catch (SQLException e){
			e.printStackTrace();
		}
		return rubrica;
	}

	public void delete(Integer idRubrica) {
		Connection conn = connessione();
		String miaquery = "delete from rubrica where id = ?";
		PreparedStatement prep;
		try {
			prep = conn.prepareStatement(miaquery);
			prep.setInt(1, idRubrica);
			prep.executeUpdate(); 
		} catch (SQLException e){
			e.printStackTrace();
		}
	}

}