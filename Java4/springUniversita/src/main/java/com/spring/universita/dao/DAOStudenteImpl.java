package com.spring.universita.dao;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.spring.universita.entity.Studente;
@Repository
public class DAOStudenteImpl implements DAOStudente {

	private Map<Integer, Studente> mappa = new HashMap<>();

	public boolean insert(Studente stud) {
		if (mappa.containsKey(stud.getMatricola()))
			return false;

		mappa.put(stud.getMatricola(),stud);
		return true;

	}

	public List<Studente> selectAll() {
		return new ArrayList<>(mappa.values());
	}

	public Studente selectById(Integer MatricolaStud) {
		return mappa.get(MatricolaStud);
	}

	public boolean delete(Integer MatricolaStud) {
		Studente stud = mappa.remove(MatricolaStud);
		return stud != null;
	}

}
