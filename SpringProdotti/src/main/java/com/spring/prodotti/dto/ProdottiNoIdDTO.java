package com.spring.prodotti.dto;

public class ProdottiNoIdDTO {
	private String marca;
	private String modello;
	private String descrizione;
	private double prezzoConsigliato;
	private double prezzoMassimo;
	private int quantita;
	private String categoria;

	public ProdottiNoIdDTO() {

	}

	public ProdottiNoIdDTO(String marca, String modello, String descrizione, double prezzoConsigliato,
			double prezzoMassimo, int quantita, String categoria) {
		this.marca = marca;
		this.modello = modello;
		this.descrizione = descrizione;
		this.prezzoConsigliato = prezzoConsigliato;
		this.prezzoMassimo = prezzoMassimo;
		this.quantita = quantita;
		this.categoria = categoria;
	}

	String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzoConsigliato() {
		return prezzoConsigliato;
	}

	public void setPrezzoConsigliato(double prezzoConsigliato) {
		this.prezzoConsigliato = prezzoConsigliato;
	}

	public double getPrezzoMassimo() {
		return prezzoMassimo;
	}

	public void setPrezzoMassimo(double prezzoMassimo) {
		this.prezzoMassimo = prezzoMassimo;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Prodotti [marca=" + marca + ", modello=" + modello + ", descrizione=" + descrizione
				+ ", prezzoConsigliato=" + prezzoConsigliato + ", prezzoMassimo=" + prezzoMassimo + ", quantita="
				+ quantita + ", categoria=" + categoria + "]";
	}

}
