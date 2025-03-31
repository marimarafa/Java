package com.spring.impiegati.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.impiegati.dto.ImpiegatoDTO;
import com.spring.impiegati.dto.ImpiegatoNomeCognomeDTO;
import com.spring.impiegati.service.ServiceImpiegato;

@RestController
@RequestMapping(path="/impiegati")
public class ControllerImpiegato {
	
	@Autowired
	private ServiceImpiegato service;
	
	@PostMapping(consumes = "application/json")
	public boolean assumi(@RequestBody ImpiegatoDTO dto) {
		return service.assumi(dto);
	}
	
	@GetMapping(path = "/{matricola}" , produces = "application/json")
	public ImpiegatoDTO cercaPerMatricola(@PathVariable  int matricola) {
		return service.cercaPerMatricola(matricola);
	}
	
	@GetMapping(produces = "application/json")
	public List<ImpiegatoDTO> visualizzaTutti(){
		return service.visualizzaTutti();
	}
	
	@DeleteMapping(path = "/{matricola}" , produces = "application/json")
	public boolean cancella(@PathVariable int matricola) {
		return service.cancella(matricola);
	}
	
	@PatchMapping(path = "/{matricola}" ,produces = "application/json" )
	public ImpiegatoDTO modificaSalario(@PathVariable int matricola , int salario) {
		return service.modificaSalario(matricola, salario);
	}
	
	@DeleteMapping(path = "/{matricola}/nome_cognome" , produces = "application/json")
	public ImpiegatoNomeCognomeDTO cancellaImpiegato(@PathVariable int matricola) {
		return service.cancellaImpiegato(matricola);
	}
	
	@GetMapping(path= "/nome_cognome" , produces = "application/json")
	public List<ImpiegatoNomeCognomeDTO> NomiCognomiImpiegati(){
		return service.NomiCognomiImpiegati();
	}
	
	@GetMapping(path= "/salarioMaggiore" , produces = "application/json" )
	public List<ImpiegatoDTO> SalarioMaggiore(int salario){
		return service.salarioMaggiore(salario);
	}
	
	@GetMapping(path= "/cognomiOrdinati" , produces = "application/json" )
	public List<ImpiegatoDTO> impiegatiOrdinatiPerCognome(){
		return service.impiegatiOrdinatiPerCognome();
	}
	
	@GetMapping(path= "/SalariOrdinati" , produces = "application/json" )
	public List<ImpiegatoDTO> impiegatiOrdinatiPerSalario(){
		return service.impiegatiOrdinatiPerSalario();
	}
	
	
	
}
