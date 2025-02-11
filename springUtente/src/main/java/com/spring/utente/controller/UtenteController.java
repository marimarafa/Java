package com.spring.utente.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.utente.entity.Utente;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping(path= "utenti")
public class UtenteController {
	
	@GetMapping(path= "/registra", consumes = "application/json")
	public boolean registra(@RequestBody Utente utente) {
		System.out.println("ho registrato l'utente" + utente);
		return true;
	}
	
	@GetMapping(path = "/cerca/{id}", produces = "application/json")
	public Utente cercaPerId(@PathVariable int id) {
		return new Utente(id, "mario", "rossi", "mario", "red");
	}

}
