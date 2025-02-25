package com.spring.prodotti.service;

import java.util.*;

import com.spring.prodotti.dao.DAOProdottiMappa;
import com.spring.prodotti.dto.ProdottiDTO;
import com.spring.prodotti.dto.ProdottiNoIdDTO;
import com.spring.prodotti.dto.ReportDTO;
import com.spring.prodotti.entity.Prodotti;
import com.spring.prodotti.utility.Conversioni;

public class ProdottiService {

	private DAOProdottiMappa dao = new DAOProdottiMappa();

	public boolean caricamentoProdotto(ProdottiDTO dto) {
		Prodotti p = com.spring.prodotti.utility.Conversioni.daProdottoDTOAProdotto(dto);
		return dao.insert(p);
	}

	public List<ProdottiNoIdDTO> visualizzaProdotti() {
		ArrayList<ProdottiNoIdDTO> prodottiNoIdDTO = new ArrayList<>();
		ArrayList<Prodotti> prodotti = new ArrayList<>(dao.selectAll());
		for (Prodotti p : prodotti) {
			ProdottiNoIdDTO dto = Conversioni.daProdottoAProdottoNoIdDTO(p);
			prodottiNoIdDTO.add(dto);
		}
		return prodottiNoIdDTO;
	}

	public ProdottiDTO cercaPerId(int id) {
		Prodotti p = dao.selectById(id);
		if (p != null) {

			ProdottiDTO dto = Conversioni.daProdottoAProdottoDTO(p);
			return dto;
		}
		return null;
	}

	public ReportDTO VisualizzaReport() {
		List<Prodotti> prodotti = dao.selectAll();

		ArrayList<String> descrizioneProdotti = new ArrayList<>();
		ArrayList<String> nomiProdottiNonDisponibili = new ArrayList<>();
		Map<String, List<Integer>> idProdottiPerCategoria = new HashMap<>();
		int totalePezzi = 0;
		int prodottiNonDisponibili = 0;
		double prezzoTotale = 0.0;

		for (Prodotti prodotto : prodotti) {
			if(idProdottiPerCategoria.containsKey(prodotto.getCategoria())) {
				idProdottiPerCategoria.get(prodotto.getCategoria()).add(prodotto.getId());
			} else {
				
				idProdottiPerCategoria.put(prodotto.getCategoria(),new ArrayList<Integer>()  );
				idProdottiPerCategoria.get(prodotto.getCategoria()).add(prodotto.getId());
			}
			descrizioneProdotti.add(prodotto.getDescrizione());
			totalePezzi += prodotto.getQuantita();
			prezzoTotale += prodotto.getPrezzoMassimo();
			if (prodotto.getQuantita() == 0) {
				prodottiNonDisponibili++;
				nomiProdottiNonDisponibili.add(prodotto.getMarca());
			}
		}
		double mediaPrezzi = prezzoTotale / prodotti.size();
		return new ReportDTO(descrizioneProdotti, totalePezzi, prodottiNonDisponibili, mediaPrezzi, nomiProdottiNonDisponibili, idProdottiPerCategoria);
	}
}