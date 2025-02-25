package com.spring.prodotti.dto;

import java.util.List;
import java.util.Map;

public class ReportDTO {
	private List<String> descrizioniProdotti;
	private int totalePezzi;
	private int prodottiNonDisponibili;
	private double mediaPrezzi;
	private List<String> nomiProdottiNonDisponibili;
	private Map<String, List<Integer>> idProdottiPerCategoria;
	


	public ReportDTO(List<String> descrizioniProdotti, int totalePezzi, int prodottiNonDisponibili, double mediaPrezzi,
			List<String> nomiProdottiNonDisponibili, Map<String, List<Integer>> idProdottiPerCategoria) {
		super();
		this.descrizioniProdotti = descrizioniProdotti;
		this.totalePezzi = totalePezzi;
		this.prodottiNonDisponibili = prodottiNonDisponibili;
		this.mediaPrezzi = mediaPrezzi;
		this.nomiProdottiNonDisponibili = nomiProdottiNonDisponibili;
		this.idProdottiPerCategoria = idProdottiPerCategoria;
	}

	public ReportDTO() {
		super();
	}


	public List<String> getDescrizioniProdotti() {
		return descrizioniProdotti;
	}

	public void setDescrizioniProdotti(List<String> descrizioniProdotti) {
		this.descrizioniProdotti = descrizioniProdotti;
	}

	public int getTotalePezzi() {
		return totalePezzi;
	}

	public void setTotalePezzi(int totalePezzi) {
		this.totalePezzi = totalePezzi;
	}

	public int getProdottiNonDisponibili() {
		return prodottiNonDisponibili;
	}

	public void setProdottiNonDisponibili(int prodottiNonDisponibili) {
		this.prodottiNonDisponibili = prodottiNonDisponibili;
	}

	public double getMediaPrezzi() {
		return mediaPrezzi;
	}

	public void setMediaPrezzi(double mediaPrezzi) {
		this.mediaPrezzi = mediaPrezzi;
	}

	public List<String> getNomiProdottiNonDisponibili() {
		return nomiProdottiNonDisponibili;
	}

	public void setNomiProdottiNonDisponibili(List<String> nomiProdottiNonDisponibili) {
		this.nomiProdottiNonDisponibili = nomiProdottiNonDisponibili;
	}

	public Map<String, List<Integer>> getIdProdottiPerCategoria() {
		return idProdottiPerCategoria;
	}

	public void setIdProdottiPerCategoria(Map<String, List<Integer>> idProdottiPerCategoria) {
		this.idProdottiPerCategoria = idProdottiPerCategoria;
	}
}
