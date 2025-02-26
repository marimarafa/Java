package com.spring.rubrica.utility;

import com.spring.rubrica.dto.ContattoDTO;
import com.spring.rubrica.dto.RubricaDTO;
import com.spring.rubrica.entity.Contatto;
import com.spring.rubrica.entity.Rubrica;

public class Conversioni {
	
	//Conversioni per Rubrica
	public static Rubrica daRubricaDTOARubrica(RubricaDTO dto) {
		return new Rubrica(dto.getId(), dto.getPropietario(), dto.getAnno_creazione());
	}

	public static RubricaDTO daRubricaARubricaDTO(Rubrica rubrica) {
		return new RubricaDTO(rubrica.getId(), rubrica.getPropietario(), rubrica.getAnno_creazione());
	}

	
	//Conversioni per Contatto
	public static Contatto daContattoDTOAContatto(ContattoDTO dto) {
		return new Contatto(dto.getId(), dto.getNome(), dto.getCognome(), dto.getNumero(), dto.getGruppo_appartenenza(),
				dto.getData_nascita(), dto.isPreferito());
	}

	public static ContattoDTO daContattoAContattoDTO(Contatto contatto) {
		return new ContattoDTO(contatto.getNome(), contatto.getCognome(), contatto.getNumero(), contatto.getGruppo_appartenenza(), contatto.getData_nascita(), contatto.isPreferito());
		
	}

}
