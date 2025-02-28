package com.spring.rubrica.dto;

import java.util.List;

public class RubricaListaPropietariDTO {
	private List<String> propietari;
	private int numeroTotale;
	
	public RubricaListaPropietariDTO(List<String> propietari, int numeroTotale) {
		super();
		this.propietari = propietari;
		this.numeroTotale = numeroTotale;
	}

	public RubricaListaPropietariDTO() {
		super();
	}

	public List<String> getPropietari() {
		return propietari;
	}

	public void setPropietari(List<String> propietari) {
		this.propietari = propietari;
	}

	public int getNumeroTotale() {
		return numeroTotale;
	}

	public void setNumeroTotale(int numeroTotale) {
		this.numeroTotale = numeroTotale;
	}
	
	

}
