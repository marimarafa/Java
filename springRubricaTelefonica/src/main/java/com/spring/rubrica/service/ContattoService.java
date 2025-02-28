package com.spring.rubrica.service;

import java.util.List;

import com.spring.rubrica.dto.ContattoDTO;
import com.spring.rubrica.dto.ContattoNoIdDTO;

public interface ContattoService {
	public boolean inserisciContatto(int id,ContattoDTO dto);
	public ContattoDTO visualizzaContatto(int idRubrica,int id);
	public ContattoDTO modifica(int idRubrica,int id,ContattoNoIdDTO dto);
	public ContattoDTO cancella(int idRubrica,int id);
	public List<ContattoDTO> listaContatti(int idRubrica);
	public Integer NumeroContatti(int idRubrica);
	public ContattoDTO VisualizzaConNumero(int idRubrica, int numero);
	
	
	
	
}
