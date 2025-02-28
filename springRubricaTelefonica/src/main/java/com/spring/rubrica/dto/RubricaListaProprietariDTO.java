package com.spring.rubrica.dto;

import java.util.List;

public class RubricaListaProprietariDTO {
	private List<String> proprietari;
	private int numeroTotale;
	
	public RubricaListaProprietariDTO(List<String> proprietari, int numeroTotale) {
		super();
		this.proprietari = proprietari;
		this.numeroTotale = numeroTotale;
	}

	public RubricaListaProprietariDTO() {
		super();
	}

	public List<String> getProprietari() {
		return proprietari;
	}

	public void setProprietari(List<String> proprietari) {
		this.proprietari = proprietari;
	}

	public int getNumeroTotale() {
		return numeroTotale;
	}

	public void setNumeroTotale(int numeroTotale) {
		this.numeroTotale = numeroTotale;
	}
	
	

}
