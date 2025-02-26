package com.spring.rubrica.service;

import java.util.List;

import com.spring.rubrica.dto.RubricaDTO;
import com.spring.rubrica.dto.RubricaListaPropietariDTO;
import com.spring.rubrica.dto.RubricaPropietario_AnnoCreazioneDTO;

public interface RubricaService {
	public boolean inserisciRubrica(RubricaDTO dto);
	public RubricaDTO visualizzaPerId(int id);
	public List<RubricaDTO> VisualizzaRubriche();
	public RubricaDTO cancellaRubrica(int id);
	public RubricaPropietario_AnnoCreazioneDTO visualizzaRubrica(int id);
	public RubricaDTO ModificaPropietario(int id, String nuovoPropietario);
	public RubricaDTO ModificaAnnoCreazione(int id, int anno);
	public RubricaListaPropietariDTO VisualizzaPropietari();
	public RubricaPropietario_AnnoCreazioneDTO RubricaPiuVecchia();
	public List<Integer> ListaAnniCreazione();

}
