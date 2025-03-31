package com.spring.rubrica.service;

import java.util.List;

import com.spring.rubrica.dto.NumeroContattiDiRubricaDTO;
import com.spring.rubrica.dto.RubricaDTO;
import com.spring.rubrica.dto.RubricaListaProprietariDTO;
import com.spring.rubrica.dto.RubricaProprietario_AnnoCreazioneDTO;

public interface RubricaService {
	public boolean inserisciRubrica(RubricaDTO dto);
	public RubricaDTO visualizzaPerId(int id);
	public List<RubricaDTO> VisualizzaRubriche();
	public RubricaDTO cancellaRubrica(int id);
	public RubricaProprietario_AnnoCreazioneDTO visualizzaRubrica(int id);
	public RubricaDTO ModificaProprietario(int id, String nuovoPropietario);
	public RubricaDTO ModificaAnnoCreazione(int id, int anno);
	public RubricaListaProprietariDTO VisualizzaProprietari();
	public RubricaProprietario_AnnoCreazioneDTO RubricaPiuVecchia();
	public List<Integer> ListaAnniCreazione();
	public NumeroContattiDiRubricaDTO NumeroContattiInRubrica(int id);

}
