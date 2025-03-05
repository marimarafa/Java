package com.spring.utente.utility;

import com.spring.utente.dto.UtenteDto;
import com.spring.utente.entity.Utente;

public class Conversioni {
	public static Utente daUtenteDTOAUtente(UtenteDto dto) {
		return new Utente(dto.getId(), dto.getNome(), dto.getCognome(), dto.getUsername(), dto.getPassword());
		
	}
	
	public static UtenteDto daUtenteAUtenteDTO(Utente utente) {
		return new UtenteDto(utente.getId(), utente.getNome(), utente.getCognome(), utente.getUsername(), utente.getPassword());
		
	}
	
	

}
