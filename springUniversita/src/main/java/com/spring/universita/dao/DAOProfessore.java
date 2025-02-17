package com.spring.universita.dao;

import java.util.*;

import com.spring.universita.entity.Professore;

public class DAOProfessore {

	private Map<Integer, Professore> mappa = new HashMap<>();

	public boolean insert(Professore prof) {
		if (mappa.containsKey(prof.getId()))
			return false;

		mappa.put(prof.getId(), prof);
		return true;

	}

	public List<Professore> selectAll() {
		return new ArrayList<>(mappa.values());
	}

	public Professore selectById(Integer idProfessore) {
		return mappa.get(idProfessore);
	}

	public boolean delete(Integer idProfessore) {
		Professore prof = mappa.remove(idProfessore);
		return prof != null;
	}

}
