package com.spring.universita.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.universita.dto.StudCognomeAnnoDTO;
import com.spring.universita.dto.StudCognomeAnnoIscrizioneDTO;
import com.spring.universita.dto.StudenteDTO;
import com.spring.universita.service.StudenteService;

@RestController
@RequestMapping(path = "/studente")
public class StudenteController {
	@Autowired
	private StudenteService service;

	@GetMapping(path = "/inserisci", consumes = "application/json")
	public boolean InserisciStudente(@RequestBody StudenteDTO dto) {
		return service.inserisciStudente(dto);
	}

	@GetMapping(path = "/cerca/{matricola}", produces = "application/json")
	public StudenteDTO CercaPerMatricola(@PathVariable int matricola) {
		return service.cercaPerMatricola(matricola);
	}

	@GetMapping(path = "/visualizzaStudenti", produces = "application/json")
	public List<StudenteDTO> VisualizzaStudenti() {
		return service.visualizzaStudenti();

	}

	@GetMapping(path = "/elimina/{matricola}", produces = "application/json")
	public StudenteDTO Elimina(@PathVariable int matricola) {
		return service.elimina(matricola);
	}

	@GetMapping(path = "/modifica/{matricola}", produces = "application/json")
	public StudenteDTO Modifica(@PathVariable int matricola, String indirizzo) {
		return service.modificaIndirizzo(matricola, indirizzo);
	}

	@GetMapping(path = "/nomiStudenti", produces = "application/json")
	public List<String> NomiStudenti() {
		return service.NomeStudenti();
	}
	
	@GetMapping(path = "/studenteGiovane", produces = "application/json")
	public StudCognomeAnnoDTO StudentePiuGiovane() {
		return service.StudentePiuGiovane();
	}

	@GetMapping(path = "/studenteIscritto", produces = "application/json")
	public StudCognomeAnnoIscrizioneDTO StudenteIscrittodapiuTempo() {
		return service.StudenteIscrittoDaPiuTempo();
	}

}
