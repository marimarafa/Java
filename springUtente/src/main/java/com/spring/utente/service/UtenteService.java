package com.spring.utente.service;

import java.util.List;

import com.spring.utente.dto.NomeCognomeDTO;
import com.spring.utente.dto.UtenteDto;

public interface UtenteService {
	public boolean registra(UtenteDto dto);
	public UtenteDto cercaPerId(int id);
	public List<UtenteDto> mostraTutti();
	public UtenteDto elimina(int id);
	public NomeCognomeDTO getNomeCognome(int id);

}
