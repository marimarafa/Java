package com.spring.impiegati.utility;

import com.spring.impiegati.dto.ImpiegatoDTO;
import com.spring.impiegati.entity.Impiegato;

public class Conversioni {
	public static Impiegato daImpiegatoDtoAImpiegato(ImpiegatoDTO dto) {
		return new Impiegato(dto.getMatricola(), dto.getNome(), dto.getCognome(), dto.getSalario());
		
	}
	
	public static ImpiegatoDTO daImpiegatoAImpiegatoDto(Impiegato imp) {
		return new ImpiegatoDTO(imp.getMatricola(), imp.getNome(), imp.getCognome(), imp.getSalario());
		
	}
	

}
