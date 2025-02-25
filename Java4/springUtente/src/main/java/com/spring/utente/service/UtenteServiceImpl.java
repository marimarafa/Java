package com.spring.utente.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.utente.dao.DAOUtente;
import com.spring.utente.dto.NomeCognomeDTO;
import com.spring.utente.dto.UtenteDto;
import com.spring.utente.entity.Utente;
import com.spring.utente.utility.Conversioni;

@Service
public class UtenteServiceImpl implements UtenteService{
	
	@Autowired
	private DAOUtente dao;

	public boolean registra(UtenteDto dto) {
		// trasformo il dto in entity
		Utente entity = Conversioni.daUtenteDTOAUtente(dto);
		// inserisco l'entity attraverso il dao
		return dao.insert(entity);
	}

	public UtenteDto cercaPerId(int id) {
		// chiamo il dao
		Utente utente = dao.selectById(id);

		if (utente != null) {
			// trasformo
			UtenteDto dto = Conversioni.daUtenteAUtenteDTO(utente);
			return dto;
		}
		return null;
	}

	public List<UtenteDto> mostraTutti() {
		ArrayList<UtenteDto> utentiDto = new ArrayList<>();
		ArrayList<Utente> utenti = new ArrayList<>(dao.selectAll());
		for (Utente utente : utenti) {
			UtenteDto dto = Conversioni.daUtenteAUtenteDTO(utente);
			utentiDto.add(dto);
		}
		return utentiDto;
	}

	public UtenteDto elimina(int id) {
		    Utente utente = dao.selectById(id);
		    dao.delete(id);
		    UtenteDto dto = Conversioni.daUtenteAUtenteDTO(utente);
		    return dto; 

	}
	
	public NomeCognomeDTO getNomeCognome(int id) {
		Utente utente = dao.selectById(id);
		if(utente != null) {
			return new NomeCognomeDTO(utente.getNome(),utente.getCognome());
		}
		return null;
	}

}
