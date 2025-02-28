package com.spring.rubrica.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rubrica.dao.DAORubrica;
import com.spring.rubrica.dto.ContattoDTO;
import com.spring.rubrica.dto.ContattoNoIdDTO;
import com.spring.rubrica.entity.Contatto;
import com.spring.rubrica.entity.Rubrica;
import com.spring.rubrica.utility.Conversioni;

@Service
public class ContattoServiceImpl implements ContattoService {

	@Autowired
	DAORubrica dao;

	public boolean inserisciContatto(int idRubrica, ContattoDTO dto) {
		Rubrica rubrica = dao.selectById(idRubrica);
		Contatto contatto = Conversioni.daContattoDTOAContatto(dto);
		if (rubrica.getContatti().containsKey(contatto.getId())) {
			return false;
		}
		rubrica.getContatti().put(contatto.getId(), contatto);
		return true;
	}

	public ContattoDTO visualizzaContatto(int idRubrica, int id) {
		Rubrica rubrica = dao.selectById(idRubrica);
		if (rubrica != null) {
			Contatto contatto = rubrica.getContatti().get(id);
			if (contatto != null) {
				ContattoDTO dto = Conversioni.daContattoAContattoDTO(contatto);
				return dto;
			} else {
				return null;

			}
		} else {
			return null;
		}

	}

	public ContattoDTO modifica(int idRubrica, int id, ContattoNoIdDTO dto) {
		Rubrica rubrica = dao.selectById(idRubrica);
		if (rubrica != null) {
			Contatto contatto = rubrica.getContatti().get(id);
			if (contatto != null) {
				contatto.setNome(dto.getNome());
				contatto.setCognome(dto.getCognome());
				contatto.setNumero(dto.getNumero());
				contatto.setGruppo_appartenenza(dto.getGruppo_appartenenza());
				contatto.setData_nascita(dto.getData_nascita());
				contatto.setPreferito(dto.isPreferito());

				rubrica.getContatti().put(id, contatto);
				ContattoDTO dtoo = Conversioni.daContattoAContattoDTO(contatto);
				return dtoo;
			} else {
				return null;
			}
		} else {
			return null;
		}

	}

	public ContattoDTO cancella(int idRubrica, int id) {
		Rubrica rubrica = dao.selectById(idRubrica);
		if (rubrica != null) {
			Contatto contatto = rubrica.getContatti().get(id);
			if (contatto != null) {
				rubrica.getContatti().remove(id, contatto);
				ContattoDTO dto = Conversioni.daContattoAContattoDTO(contatto);
				return dto;
			} else {
				return null;

			}
		} else {
			return null;
		}

	}

	public List<ContattoDTO> listaContatti(int idRubrica) {
		Rubrica rubrica = dao.selectById(idRubrica);
		if (rubrica != null) {
			ArrayList<Contatto> contatti = new ArrayList<>(rubrica.getContatti().values());
			ArrayList<ContattoDTO> contattiDto = new ArrayList<>();
			for (Contatto contatto : contatti) {
				ContattoDTO dto = Conversioni.daContattoAContattoDTO(contatto);
				contattiDto.add(dto);
			}
			return contattiDto;
		} else {
			return null;
		}
	}

	public Integer NumeroContatti(int idRubrica) {
		Rubrica rubrica = dao.selectById(idRubrica);
		if (rubrica != null) {
			return rubrica.getContatti().size();
		} else {
			return null;
		}

	}
	
	public ContattoDTO VisualizzaConNumero(int idRubrica, int numero) {
		Rubrica rubrica = dao.selectById(idRubrica);
		if (rubrica != null) {
			Contatto contatto = rubrica.getContatti().get(numero);
			ContattoDTO dto = Conversioni.daContattoAContattoDTO(contatto);
			return dto;
		} else {
			return null;
		}
		
	}
	
	

}