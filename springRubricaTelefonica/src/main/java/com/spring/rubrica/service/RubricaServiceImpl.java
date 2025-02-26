package com.spring.rubrica.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rubrica.dao.DAORubrica;
import com.spring.rubrica.dto.RubricaDTO;
import com.spring.rubrica.dto.RubricaListaPropietariDTO;
import com.spring.rubrica.dto.RubricaPropietario_AnnoCreazioneDTO;
import com.spring.rubrica.entity.Rubrica;
import com.spring.rubrica.utility.Conversioni;

@Service
public class RubricaServiceImpl implements RubricaService {

	@Autowired
	DAORubrica dao;

	public boolean inserisciRubrica(RubricaDTO dto) {
		Rubrica rubrica = Conversioni.daRubricaDTOARubrica(dto);
		return dao.insert(rubrica);
	}

	public RubricaDTO visualizzaPerId(int id) {
		Rubrica rubrica = dao.selectById(id);
		if (rubrica != null) {
			RubricaDTO dto = Conversioni.daRubricaARubricaDTO(rubrica);
			return dto;
		}
		return null;
	}

	public List<RubricaDTO> VisualizzaRubriche() {
		ArrayList<RubricaDTO> rubricheDTO = new ArrayList<RubricaDTO>();
		ArrayList<Rubrica> rubriche = new ArrayList<Rubrica>(dao.selectAll());
		for (Rubrica rubrica : rubriche) {
			RubricaDTO dto = Conversioni.daRubricaARubricaDTO(rubrica);
			rubricheDTO.add(dto);
		}
		return rubricheDTO;
	}

	public RubricaDTO cancellaRubrica(int id) {
		Rubrica rubrica = dao.selectById(id);
		dao.delete(id);
		RubricaDTO dto = Conversioni.daRubricaARubricaDTO(rubrica);
		return dto;
	}

	public RubricaPropietario_AnnoCreazioneDTO visualizzaRubrica(int id) {
		Rubrica rubrica = dao.selectById(id);
		if (rubrica != null) {
			RubricaDTO dto = Conversioni.daRubricaARubricaDTO(rubrica);
			return new RubricaPropietario_AnnoCreazioneDTO(dto.getPropietario(), dto.getAnno_creazione());
		}
		return null;
	}

	public RubricaDTO ModificaPropietario(int id, String nuovoPropietario) {
		Rubrica rubrica = dao.selectById(id);
		RubricaDTO dto = Conversioni.daRubricaARubricaDTO(rubrica);
		dto.setPropietario(nuovoPropietario);
		return dto;
	}

	public RubricaDTO ModificaAnnoCreazione(int id, int anno) {
		Rubrica rubrica = dao.selectById(id);
		RubricaDTO dto = Conversioni.daRubricaARubricaDTO(rubrica);
		dto.setAnno_creazione(anno);

		return dto;
	}

	public RubricaListaPropietariDTO VisualizzaPropietari() {
		ArrayList<String> propietariDTO = new ArrayList<String>();
		ArrayList<Rubrica> rubriche = new ArrayList<Rubrica>(dao.selectAll());
		int numero_totale = 0;
		for (Rubrica rubrica : rubriche) {
			RubricaDTO dto = Conversioni.daRubricaARubricaDTO(rubrica);
			propietariDTO.add(dto.getPropietario());
			numero_totale++;
		}
		return new RubricaListaPropietariDTO(propietariDTO, numero_totale);
	}

	public RubricaPropietario_AnnoCreazioneDTO RubricaPiuVecchia() {
		ArrayList<Rubrica> rubriche = new ArrayList<>(dao.selectAll());
		ArrayList<Integer> anni_creazioni = new ArrayList<Integer>();

		for (Rubrica rubrica : rubriche) {
			anni_creazioni.add(rubrica.getAnno_creazione());
			int max = Collections.max(anni_creazioni);

			return new RubricaPropietario_AnnoCreazioneDTO(rubrica.getPropietario(), max);
		}
		return null;

	}
	
	public List<Integer> ListaAnniCreazione(){
		ArrayList<Integer> annicreazione = new ArrayList<Integer>();
		ArrayList<Rubrica> rubriche = new ArrayList<>(dao.selectAll());
		for(Rubrica rubrica: rubriche) {
			annicreazione.add(rubrica.getAnno_creazione());
		}
		Collections.sort(annicreazione);
		return  annicreazione;
	}
	

}
