package com.spring.first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //indica a spring che dovrà istanziare e gestire questa classe
@RequestMapping(path = "/calcolatrice")
public class CalcolatriceController {
	
	@GetMapping(path = "/sum")
	public int somma(int n1 , int n2) {
		return n1 + n2;
	}
	
	@GetMapping(path = "/multip")
	public int multiplicazione(int n1, int n2) {
		return n1 * n2;
	}
	
	@GetMapping(path = "/sott")
	public int sottrazione(int n1, int n2) {
		return n1 - n2;
	}
	
	@GetMapping(path = "/div")
	public double divisione(int n1, int n2) {
		return n1 / n2;
	}
	
}
