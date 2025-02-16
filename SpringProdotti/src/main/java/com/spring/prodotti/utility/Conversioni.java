package com.spring.prodotti.utility;

import com.spring.prodotti.dto.ProdottiDTO;
import com.spring.prodotti.dto.ProdottiNoIdDTO;
import com.spring.prodotti.entity.Prodotti;

public class Conversioni {
	public static Prodotti daProdottoDTOAProdotto(ProdottiDTO dto) {
		return new Prodotti(dto.getId(), dto.getMarca(), dto.getModello(),dto.getDescrizione(),dto.getPrezzoConsigliato(), dto.getPrezzoMassimo(), dto.getQuantita(),dto.getCategoria());
		
	}
	
	public static ProdottiDTO daProdottoAProdottoDTO(Prodotti p) {
		return new ProdottiDTO(p.getId(),p.getMarca(), p.getModello(),p.getDescrizione(),p.getPrezzoConsigliato(), p.getPrezzoMassimo(), p.getQuantita(),p.getCategoria());
	
	}
	
	public static ProdottiNoIdDTO daProdottoAProdottoNoIdDTO(Prodotti p) {
		return new ProdottiNoIdDTO(p.getMarca(), p.getModello(),p.getDescrizione(),p.getPrezzoConsigliato(), p.getPrezzoMassimo(), p.getQuantita(),p.getCategoria());
	
	}

}
