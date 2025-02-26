package com.spring.rubrica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rubrica.dto.RubricaDTO;
import com.spring.rubrica.dto.RubricaListaPropietariDTO;
import com.spring.rubrica.dto.RubricaPropietario_AnnoCreazioneDTO;
import com.spring.rubrica.service.RubricaService;

@RestController
@RequestMapping(path = "/rubrica")
public class RubricaController {
	
	@Autowired
	RubricaService service;
	

	@GetMapping(path ="/inserisci",consumes = "application/json")
	public boolean inserisci(@RequestBody RubricaDTO dto){
		return service.inserisciRubrica(dto);
	}
	
	@GetMapping(path ="/visualizzaPerId/{id}" , produces = "application/json")
	public RubricaDTO visualizzaPerId(@PathVariable int id) {
		return service.visualizzaPerId(id);
	}
	
	
	@GetMapping(path ="/rubriche" , produces = "application/json")
	public List<RubricaDTO> visualizzaRubriche(){
		return service.VisualizzaRubriche();
	}
	
	@GetMapping(path ="/cancella/{id}" , produces = "application/json")
	public RubricaDTO elimina(@PathVariable int id) {
		return service.cancellaRubrica(id);
	}
	
	@GetMapping(path ="/visualizza/{id}" , produces = "application/json")
	public RubricaPropietario_AnnoCreazioneDTO visualizzaRubrica(@PathVariable int id) {
		return service.visualizzaRubrica(id);
	}
	
	@GetMapping(path ="/modificaPropietario/{id}" , produces = "application/json")
	public RubricaDTO modificaPropietario(@PathVariable int id, String propietario) {
		return service.ModificaPropietario(id, propietario);
		
	}
	
	@GetMapping(path ="/modificaCreazione/{id}" , produces = "application/json")
	public RubricaDTO modificaCreazione(@PathVariable int id, int anno_creazione) {
		return service.ModificaAnnoCreazione(id, anno_creazione);
	
	}
	
	@GetMapping(path ="/propietari" , produces = "application/json")
	public RubricaListaPropietariDTO visualizzaPropietari() {
		return service.VisualizzaPropietari();
	}
	
	@GetMapping(path ="/rubricaVecchia" , produces = "application/json")
	public RubricaPropietario_AnnoCreazioneDTO RubricaPiuVecchia() {
		return service.RubricaPiuVecchia();
		
	}
	
	@GetMapping(path ="/listaAnni" , produces = "application/json")
	public List<Integer>  AnniCreazione() {
		return service.ListaAnniCreazione();
		
	}

	

	
	
	
	
	
}
