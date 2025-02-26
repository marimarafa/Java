package com.spring.rubrica.dto;

import java.util.HashMap;
import java.util.Map;

import com.spring.rubrica.entity.Contatto;

public class RubricaDTO {
	private int id;
	private String propietario;
	private int anno_creazione;
	private Map<Integer, Contatto> contatti = new HashMap<>();

	public RubricaDTO() {
		super();
	}

	public RubricaDTO(int id,String propietario, int anno_iscrizione) {
		super();
		this.id = id;
		this.propietario = propietario;
		this.anno_creazione = anno_iscrizione;
	}
	public Map<Integer, Contatto> getContatti() {
		return contatti;
	}

	public void setContatti(Map<Integer, Contatto> contatti) {
		this.contatti = contatti;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
