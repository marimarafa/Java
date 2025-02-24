package com.spring.universita.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.universita.dto.ProfessoreDTO;
import com.spring.universita.service.ProfessoreService;

@RestController
@RequestMapping(path = "/professore")
public class ProfessoreController {
	@Autowired
	ProfessoreService service;

	@GetMapping(path = "/inserisci", consumes = "application/json")
	public boolean InserisciProfessore(@RequestBody ProfessoreDTO dto) {
		return service.inserisciProfessore(dto);
	}

	@GetMapping(path = "/cerca/{id}", produces = "application/json")
	public ProfessoreDTO cercaPerId(@PathVariable int id) {
		return service.cercaPerId(id);
	}

	@GetMapping(path = "/visualizzaProfessori", produces = "application/json")
	public List<ProfessoreDTO> VisualizzaProfessori() {
		return service.visualizzaProfessori();

	}

	@GetMapping(path = "/elimina/{id}", produces = "application/json")
	public ProfessoreDTO Elimina(@PathVariable int id) {
		return service.elimina(id);
	}

	@GetMapping(path = "/modifica/{id}", produces = "application/json")
	public ProfessoreDTO Modifica(@PathVariable int id, String materia) {
		return service.modificaMateria(id, materia);
	}
	
	@GetMapping(path = "/professoriDiMateria/{materia}", produces = "application/json")
	public List<ProfessoreDTO> professoriDiMateria(@PathVariable String materia) {
		return service.ProfessoriDiMateria( materia);
	}
	
	@GetMapping(path = "/ordinaPerCognome", produces = "application/json")
	public List<ProfessoreDTO> OrdinaPerCognome() {
		return service.OrdinaPerCognome();
	}
	
	@GetMapping(path = "/materie", produces = "application/json")
	public List<String> ListaMaterie() {
		return service.ListaMaterie();
	}
}
