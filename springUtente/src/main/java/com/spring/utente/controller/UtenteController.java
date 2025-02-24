package com.spring.utente.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.utente.dto.NomeCognomeDTO;
import com.spring.utente.dto.UtenteDto;
import com.spring.utente.service.UtenteService;


@RestController
@RequestMapping(path= "utenti")
public class UtenteController {
	
	@Autowired
	private UtenteService service;
	
	@GetMapping(path= "/registra", consumes = "application/json")
	public boolean registra(@RequestBody UtenteDto dto) {
		return service.registra(dto);
	}
	
	@GetMapping(path = "/cerca/{id}", produces = "application/json")
	public UtenteDto cercaPerId(@PathVariable int id) {
		return service.cercaPerId(id);
	}
	
	@GetMapping(path="/mostraTutti" , produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UtenteDto> mostraTutti(){
		return service.mostraTutti();
			
	}
	
	@GetMapping(path="/elimina/{id}" ,  produces = MediaType.APPLICATION_JSON_VALUE)
	public UtenteDto elimina(@PathVariable int id){
		return service.elimina(id);
			
	}
	
	@GetMapping(path="/nomeCognome/{id}" ,  produces = MediaType.APPLICATION_JSON_VALUE)
	public NomeCognomeDTO getNomeCognome(@PathVariable  int id) {
		return service.getNomeCognome(id);
	}

}
