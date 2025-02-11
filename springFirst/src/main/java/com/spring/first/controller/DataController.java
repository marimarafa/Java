package com.spring.first.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/data")
public class DataController {

	@GetMapping(path= "oggi")
	 public String data() {
		LocalDate today = LocalDate.now();
		 return "Data oggi : " + today;
	 }

}
