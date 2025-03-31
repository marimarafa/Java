package com.spring.phonebook.dto;

public class NumeroContattiDiRubricaDTO {

	private String proprietario;
	private int numero_contatti;
	
	
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	public int getNumero_contatti() {
		return numero_contatti;
	}
	public void setNumero_contatti(int numero_contatti) {
		this.numero_contatti = numero_contatti;
	}
	public NumeroContattiDiRubricaDTO(String proprietario, int numero_contatti) {
		super();
		this.proprietario = proprietario;
		this.numero_contatti = numero_contatti;
	}
	public NumeroContattiDiRubricaDTO() {
		super();
	}
}
