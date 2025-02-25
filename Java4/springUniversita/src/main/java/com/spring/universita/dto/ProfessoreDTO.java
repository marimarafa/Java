package com.spring.universita.dto;

import com.spring.universita.entity.Professore;

public class ProfessoreDTO implements Comparable<ProfessoreDTO> {
	private int id;
	private String nome;
	private String cognome;
	private String materia_insegnamento;

	public ProfessoreDTO() {
		super();
	}

	public ProfessoreDTO(int id, String nome, String cognome, String materia_insegnamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.materia_insegnamento = materia_insegnamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getMateria_insegnamento() {
		return materia_insegnamento;
	}

	public void setMateria_insegnamento(String materia_insegnamento) {
		this.materia_insegnamento = materia_insegnamento;
	}

	@Override
	public String toString() {
		return "Professore [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", materia_insegnamento="
				+ materia_insegnamento + "]";
	}
	@Override
	public int compareTo(ProfessoreDTO o) {
		return this.getCognome().compareTo(o.getCognome());
	}
	
}
