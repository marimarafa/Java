package com.spring.rubrica.utility;

import java.util.HashMap;
import java.util.Map;

import com.spring.rubrica.dto.ContattoDTO;
import com.spring.rubrica.dto.RubricaDTO;
import com.spring.rubrica.entity.Contatto;
import com.spring.rubrica.entity.Rubrica;

public class Conversioni {
	
	//Conversioni per Rubrica
	public static Rubrica daRubricaDTOARubrica(RubricaDTO dto) {
		Map<Integer, Contatto> contatti = new HashMap<>();
		for(ContattoDTO contattodto : dto.getContatti().values())
			contatti.put(contattodto.getId(), daContattoDTOAContatto(contattodto));
		
		return new Rubrica(dto.getId(), dto.getProprietario(), dto.getAnno_creazione(), contatti);
	}

	public static RubricaDTO daRubricaARubricaDTO(Rubrica rubrica) {
		Map<Integer, ContattoDTO> contatti = new HashMap<>();
		for(Contatto contatto : rubrica.getContatti().values())
			contatti.put(contatto.getId(), daContattoAContattoDTO(contatto));
		
		return new RubricaDTO(rubrica.getId(), rubrica.getProprietario(), rubrica.getAnno_creazione() , contatti);
	}
	
	//Conversioni per Contatto
	public static Contatto daContattoDTOAContatto(ContattoDTO dto) {
		return new Contatto(dto.getId(), dto.getNome(), dto.getCognome(), dto.getNumero(), dto.getGruppo_appartenenza(),
				dto.getData_nascita(), dto.isPreferito());
	}

	public static ContattoDTO daContattoAContattoDTO(Contatto contatto) {
		return new ContattoDTO(contatto.getId(),contatto.getNome(), contatto.getCognome(), contatto.getNumero(), contatto.getGruppo_appartenenza(), contatto.getData_nascita(), contatto.isPreferito());
		
	}

}
