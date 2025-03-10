package com.spring.rubrica.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.spring.rubrica.entity.Rubrica;

@Repository
public class DAORubricaImpl implements DAORubrica {

	private Map<Integer, Rubrica> mappa = new HashMap<>();

	public void Connessione() {
		// PUNTO 1 : Carico i driver in memoria
		String driver = "org.postgresql.Driver";
		try {
			Class.forName(driver);
			// PUNTO 2 : Creo url di connessione
			String url = "jdbc:postgresql://localhost:5432/rubrica?user=postgres&password=POSTGRES&ssl=false";

			// PUNTO 3 : Connetto al database
			Connection conn = DriverManager.getConnection(url);
		} catch (ClassNotFoundException | SQLException ex) {
			System.out.println("Errore della connessione");
		}

	}

	public boolean insert(Rubrica rubrica) {
		if (mappa.containsKey(rubrica.getId()))
			throw new RuntimeException("Id rubrica già esistente");

		mappa.put(rubrica.getId(), rubrica);
		return true;

	}

	public List<Rubrica> selectAll() {
		return new ArrayList<>(mappa.values());
	}

	public Rubrica selectById(Integer idRubrica) {
		Rubrica rubrica = mappa.get(idRubrica);
		if (rubrica != null) {
			return rubrica;
		} else {
			throw new RuntimeException("Id rubrica non trovato");
		}
	}

	public boolean delete(Integer idRubrica) {
		Rubrica rubrica = mappa.remove(idRubrica);
		if (rubrica != null) {
			return true;
		} else {
			throw new RuntimeException("ELiminazione non terminata. Id non trovato");
		}

	}

}