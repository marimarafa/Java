package com.spring.rubrica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rubrica.dto.ContattoDTO;
import com.spring.rubrica.dto.ContattoNoIdDTO;
import com.spring.rubrica.dto.ContattoNomeCognomeDTO;
import com.spring.rubrica.dto.NumeroContattiDiRubricaDTO;
import com.spring.rubrica.dto.RubricaDTO;
import com.spring.rubrica.dto.RubricaListaProprietariDTO;
import com.spring.rubrica.dto.RubricaProprietario_AnnoCreazioneDTO;
import com.spring.rubrica.service.ContattoService;
import com.spring.rubrica.service.RubricaService;
import com.spring.rubrica.dto.ErroreDTO;

@RestController
@RequestMapping(path = "/rubriche")
public class RubricaController {
	
	@Autowired
	RubricaService service;
	
	@Autowired
	ContattoService service2;
	
//											RUBRICA CONTROLLER

	@PostMapping(path ="",consumes = "application/json")
	public boolean inserisci(@RequestBody RubricaDTO dto){
		return service.inserisciRubrica(dto);
	}
	
	@GetMapping(path ="/{id}" , produces = "application/json")
	public RubricaDTO visualizzaPerId(@PathVariable int id) {
		return service.visualizzaPerId(id);
	}
	
	
	@GetMapping(path ="" , produces = "application/json")
	public List<RubricaDTO> visualizzaRubriche(){
		return service.VisualizzaRubriche();
	}
	
	@DeleteMapping(path ="/{id}" , produces = "application/json")
	public RubricaDTO elimina(@PathVariable int id) {
		return service.cancellaRubrica(id);
	}
	
	@GetMapping(path ="/{id}/proprietarioAnnoCreazione" , produces = "application/json")
	public RubricaProprietario_AnnoCreazioneDTO visualizzaRubrica(@PathVariable int id) {
		return service.visualizzaRubrica(id);
	}
	
	@PutMapping(path ="/{id}" , produces = "application/json")
	public RubricaDTO modificaPropietario(@PathVariable int id, @RequestParam String proprietario) {
		return service.ModificaProprietario(id, proprietario);
		
	}
	
	@PutMapping(path ="/{id}/annoCreazione" , produces = "application/json")
	public RubricaDTO modificaCreazione(@PathVariable int id, @RequestParam int anno_creazione) {
		return service.ModificaAnnoCreazione(id, anno_creazione);
	
	}
	
	@GetMapping(path ="/proprietari" , produces = "application/json")
	public RubricaListaProprietariDTO visualizzaProprietari() {
		return service.VisualizzaProprietari();
	}
	
	@GetMapping(path ="/rubricaVecchia" , produces = "application/json")
	public RubricaProprietario_AnnoCreazioneDTO RubricaPiuVecchia() {
		return service.RubricaPiuVecchia();
		
	}
	
	@GetMapping(path ="/anniCreazione" , produces = "application/json")
	public List<Integer>  AnniCreazione() {
		return service.ListaAnniCreazione();
		
	}
	
	@GetMapping(path ="/{id}/numeroContatti" , produces = "application/json")
	public NumeroContattiDiRubricaDTO  NumeroContattiRubrica(@PathVariable int id) {
		return service.NumeroContattiInRubrica(id);
		
	}
	
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
// 													 CONTATTO CONTROLLER
	
	@PostMapping(path ="/{idRubrica}/contatti" , consumes = "application/json")
	public boolean  AggiungiContatto(@PathVariable int idRubrica, @RequestBody ContattoDTO dto) {
		return service2.inserisciContatto(idRubrica, dto);
		
	}
	
	@GetMapping(path ="/{idRubrica}/contatti/{id}" , produces = "application/json")
	public ContattoDTO  VisualizzaContatto(@PathVariable Integer idRubrica, @PathVariable Integer id ) {
		return service2.visualizzaContatto(idRubrica, id);
		
	}
	
	@PutMapping(path ="/{idRubrica}/contatti/{id}" , produces = "application/json")
	public ContattoDTO  ModificaContatto(@PathVariable int idRubrica, @PathVariable Integer id,@RequestBody ContattoNoIdDTO dto) {
		return service2.modifica(idRubrica, id , dto);
		
	}
	
	@DeleteMapping(path ="{idRubrica}/contatti/{id}" , produces = "application/json")
	public ContattoDTO  CancellaContatto(@PathVariable Integer idRubrica,@PathVariable Integer id) {
		return service2.cancella(idRubrica, id);
		
	} 
	
	@GetMapping(path ="{idRubrica}/contatti" , produces = "application/json")
	public List<ContattoDTO>  ListaContatti(@PathVariable Integer idRubrica) {
		return service2.listaContatti(idRubrica);
		
	}
	

	@GetMapping(path ="/{idRubrica}/contatti/numeroContatti" , produces = "application/json")
	public Integer  NumeroContatti(@PathVariable Integer idRubrica) {
		return service2.NumeroContatti(idRubrica);
		
	}
	
	
	@GetMapping(path ="/{idRubrica}/contatti/{numero}" , produces = "application/json")
	public ContattoDTO  VisualizzaConNumero(@PathVariable Integer idRubrica, @PathVariable Integer numero) {
		return service2.VisualizzaConNumero(idRubrica, numero);
		
	}
	
	@GetMapping(path ="/{idRubrica}/contatti/{gruppo}" , produces = "application/json")
	public List<ContattoNomeCognomeDTO>  visualizzaConGruppo(@PathVariable Integer idRubrica, @PathVariable String gruppo) {
		return service2.VisualizzaConGruppo(idRubrica, gruppo);
		
	}
	
	@GetMapping(path ="/{idRubrica}/contatti/{gruppo}/numeroContatti" , produces = "application/json")
	public Integer  NumeroContattiGruppo(@PathVariable Integer idRubrica, @PathVariable String gruppo) {
		return service2.NumeroContattiGruppo(idRubrica, gruppo);
		
	}
	
	@DeleteMapping(path ="/{idRubrica}/contatti/{gruppo}" , produces = "application/json")
	public List<ContattoDTO>  CancellaGruppoContatti(@PathVariable Integer idRubrica, @PathVariable String gruppo) {
		return service2.CancellaGruppoContatti(idRubrica, gruppo);
		
	}
	
	@PatchMapping(path ="/{idRubrica}/contatti/{id}/preferito" , produces = "application/json")
	public ContattoDTO  modificaStatoPreferito(@PathVariable Integer idRubrica, @PathVariable Integer id) {
		return service2.modificaStatoPreferito(idRubrica, id);
		
	}

	@GetMapping(path ="{idRubrica}/contatti/contattiPreferiti" , produces = "application/json")
	public List<ContattoDTO>  ContattiPreferiti(@PathVariable Integer idRubrica) {
		return service2.ContattiPreferiti(idRubrica);
		
	}
	
	@ExceptionHandler
	public ResponseEntity<ErroreDTO> gestore(RuntimeException exc){
		ErroreDTO errore = new ErroreDTO(exc.getMessage());
		ResponseEntity<ErroreDTO> response = new ResponseEntity<ErroreDTO>(errore,HttpStatus.NOT_FOUND);
		return response;
	}
	
	
}
