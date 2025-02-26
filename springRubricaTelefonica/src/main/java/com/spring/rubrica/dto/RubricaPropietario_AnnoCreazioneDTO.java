package com.spring.rubrica.dto;

import java.util.HashMap;
import java.util.Map;

import com.spring.rubrica.entity.Contatto;

public class RubricaPropietario_AnnoCreazioneDTO {
	private String propietario;
	private int anno_creazione;
	private Map<Integer, Contatto> contatti = new HashMap<>();

	public  RubricaPropietario_AnnoCreazioneDTO() {
		super();
	}

	public RubricaPropietario_AnnoCreazioneDTO(String propietario, int anno_iscrizione) {
		super();
		this.propietario = propietario;
		this.anno_creazione = anno_iscrizione;
	}

	public Map<Integer, Contatto> getContatti() {
		return contatti;
	}

	public void setContatti(Map<Integer, Contatto> contatti) {
		this.contatti = contatti;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public int getAnno_creazione() {
		return anno_creazione;
	}

	public void setAnno_creazione(int anno_iscrizione) {
		this.anno_creazione = anno_iscrizione;
	}


}
