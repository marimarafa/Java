package com.spring.prodotti.dao;

import java.util.*;

import com.spring.prodotti.entity.Prodotti; 

public class DAOProdottiMappa {

	private Map<Integer, Prodotti> mappa = new HashMap<>();

	public boolean insert(Prodotti prodotto) {
		if(mappa.containsKey(prodotto.getId()))
			return false;
		
		mappa.put(prodotto.getId(), prodotto);
		return true;
		
	}
	public List<Prodotti> selectAll(){
		return new ArrayList<>(mappa.values());
	}

	public Prodotti selectById(Integer idProdotti) {
		return mappa.get(idProdotti);
	}
	
	public boolean delete(Integer idProdotti) {
		Prodotti prodotto = mappa.remove(idProdotti);
		return prodotto!=null;
	}

}
