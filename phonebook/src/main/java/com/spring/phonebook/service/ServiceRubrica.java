package com.spring.phonebook.service;

import java.util.List;

import com.spring.phonebook.dto.ContattoDTO;
import com.spring.phonebook.dto.NumeroContattiDiRubricaDTO;
import com.spring.phonebook.dto.RubricaDTO;
import com.spring.phonebook.dto.RubricaListaProprietariDTO;
import com.spring.phonebook.dto.RubricaPropietario_AnnoCreazioneDTO;

public interface ServiceRubrica {
	
//	_________________________________________________ service rubrica _____________________________________________________________________________________
	
	public boolean creaRubrica(RubricaDTO dto);
	public RubricaDTO cerca(int id);
	public List<RubricaDTO> visualizzaRubriche();
	public boolean cancellaRubrica(int id);
	public RubricaPropietario_AnnoCreazioneDTO visualizzaRubrica(int id);
	public RubricaDTO ModificaProprietario(int id, String nuovoProprietario);
	public RubricaDTO ModificaAnnoCreazione(int id, int anno);
	public RubricaListaProprietariDTO VisualizzaProprietari();
	public RubricaPropietario_AnnoCreazioneDTO RubricaPiuVecchia();
	public List<Integer> ListaAnniCreazione();
	public NumeroContattiDiRubricaDTO NumeroContattiInRubrica(int id);
	
//	 ____________________________________________________ service contatto ___________________________________________________________________________________________________
	
	public boolean aggiungiContatto(int idRubrica, ContattoDTO contatto);
	public ContattoDTO visualizzaContatto(int idRubrica,int id);
	public ContattoDTO modifica(int idRubrica,int id,ContattoDTO dto);
	public ContattoDTO cancella(int idRubrica,int id);
	public List<ContattoDTO> listaContatti(int idRubrica);
	public Integer NumeroContatti(int idRubrica);
	public ContattoDTO VisualizzaConNumero(int idRubrica, String numero);
	
}
