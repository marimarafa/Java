package com.spring.rubrica.dto;

public class ContattoNomeCognomeDTO {
	private String nome;
	private String cognome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public ContattoNomeCognomeDTO(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}
	public ContattoNomeCognomeDTO() {
		super();
	}
	
	

}
