package com.spring.universita.dto;

public class StudCognomeAnnoIscrizioneDTO {
	private String cognome;
	private int anno_immatricolazione;
	
	
	public StudCognomeAnnoIscrizioneDTO( String cognome,int anno_immatricolazione) {
		super();
		this.cognome = cognome;
		this.anno_immatricolazione = anno_immatricolazione;
	}

	public StudCognomeAnnoIscrizioneDTO() {
		super();
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getAnno_immatricolazione() {
		return anno_immatricolazione;
	}
	public void setAnno_immatricolazione(int anno_immatricolazione) {
		this.anno_immatricolazione = anno_immatricolazione;
	}
	

}
