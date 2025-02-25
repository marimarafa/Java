package com.spring.first.controller;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/lista")
public class ListaController {
	
	@GetMapping(path = "/numeri")
	public ArrayList<Integer> listanum(){
		Random rn = new Random();
		ArrayList<Integer> lnum = new ArrayList<Integer>();
		for(int i = 1; i<= 5; i++) {
			int random = rn.nextInt(80) +1;
			lnum.add(random);
		}
		return lnum;
		
	}
}
