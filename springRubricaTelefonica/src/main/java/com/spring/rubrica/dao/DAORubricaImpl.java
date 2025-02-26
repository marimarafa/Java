package com.spring.rubrica.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.spring.rubrica.entity.Rubrica;

@Repository
public class DAORubricaImpl implements DAORubrica {

	private Map<Integer, Rubrica> mappa = new HashMap<>();

	public boolean insert(Rubrica rubrica) {
		if (mappa.containsKey(rubrica.getId()))
			return false;

		mappa.put(rubrica.getId(), rubrica);
		return true;

	}

	public List<Rubrica> selectAll() {
		return new ArrayList<>(mappa.values());
	}

	public Rubrica selectById(Integer idRubrica) {
		return mappa.get(idRubrica);
	}

	public boolean delete(Integer idRubrica) {
		Rubrica rubrica = mappa.remove(idRubrica);
		return rubrica != null;
	}

}
