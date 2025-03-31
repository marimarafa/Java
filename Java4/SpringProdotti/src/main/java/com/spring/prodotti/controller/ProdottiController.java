package com.spring.prodotti.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.prodotti.dto.ProdottiDTO;
import com.spring.prodotti.dto.ProdottiNoIdDTO;
import com.spring.prodotti.dto.ReportDTO;
import com.spring.prodotti.service.ProdottiService;

@RestController
@RequestMapping(path = "/prodotti")
public class ProdottiController {

		private ProdottiService service = new ProdottiService();

		@GetMapping(path = "/caricaProdotto", consumes = "application/json")
		public boolean CaricaProdotto(@RequestBody ProdottiDTO dto) {
			return service.caricamentoProdotto(dto);
		}

		@GetMapping(path = "/cerca/{id}", produces = "application/json")
		public ProdottiDTO cercaPerId(@PathVariable int id) {
			return service.cercaPerId(id);
		}

		@GetMapping(path = "/visualizzaProdotti", produces = "application/json")
		public List<ProdottiNoIdDTO> VisualizzaProdotti() {
			return service.visualizzaProdotti();

		}
		
		@GetMapping(path = "/visualizzaReport", produces = "application/json")
		public ReportDTO VisualizzaReport() {
			return service.VisualizzaReport();
		}

	}
 