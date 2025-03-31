package com.spring.rubrica.entity;

import java.sql.Date;

public class Contatto {
	private int id;
	private String nome;
	private String cognome;
	private int numero;
	private String gruppo_appartenenza = "default";
	private Date data_nascita;
	private boolean preferito;
	
	
	public String getNome() {
		return nome;
	}
	public Contatto() {
		super();
	}
	public Contatto(int id,String nome, String cognome, int numero, String gruppo_appartenenza, Date data_nascita,
			boolean preferito) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.numero = numero;
		this.gruppo_appartenenza = gruppo_appartenenza;
		this.data_nascita = data_nascita;
		this.preferito = preferito;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getGruppo_appartenenza() {
		return gruppo_appartenenza;
	}
	public void setGruppo_appartenenza(String gruppo_appartenenza) {
		this.gruppo_appartenenza = gruppo_appartenenza;
	}
	public Date getData_nascita() {
		return data_nascita;
	}
	public void setData_nascita(Date data_nascita) {
		this.data_nascita = data_nascita;
	}
	public boolean isPreferito() {
		return preferito;
	}
	public void setPreferito(boolean preferito) {
		this.preferito = preferito;
	}
	
	
}
