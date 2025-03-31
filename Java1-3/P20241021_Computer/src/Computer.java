public class Computer {
	   
	private Double prezzo;
	private Double peso;
	private Double larghezza, altezza, profondità;
	private Integer annoDiProduzione;
	private String produttore;
	private static int contatore = 0;
   
	public Computer(Double prezzo, Double peso, Double larghezza, Double altezza, Double profondità,
			Integer annoDiProduzione,String produttore) {
		
		this.prezzo = prezzo;
		this.peso = peso;
		this.annoDiProduzione = annoDiProduzione;
		this.larghezza = larghezza;
		this.altezza = altezza;
		this.profondità = profondità;
		this.produttore = produttore;
		
		contatore ++;
	}
	public Computer() {
		contatore ++;
		
	}
	public Computer(Double prezzo, Double peso) {
		
		this.prezzo = prezzo;
		this.peso = peso;
		contatore ++;
	}
	@Override
	public String toString() {
		return String.format("Prezzo: %.2f €\nPeso: %.2f kg\nAnno di produzione: %d\nLarghezza: %.2f cm\nAltezza: %.2f cm\nProfondità: %.2f cm\nProduttore: %s.", 
						 prezzo, peso, annoDiProduzione, larghezza, altezza, profondità,produttore);
	}
	public String GetProduttore(){
	    return produttore;
	}
	public void setProduttore(String produttore) {
		this.produttore = produttore;
	}
	static public int GetContatore() {
		return contatore;
	}
	public Double getPrezzo() {
		return prezzo;
	}
	public Double getPeso() {
		return peso;
	}
	public Double getLarghezza() {
		return larghezza;
	}
	public Double getAltezza() {
		return altezza;
	}
	public Double getProfondità() {
		return profondità;
	}
	public Integer getAnnoDiProduzione() {
		return annoDiProduzione;
	}
	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public void setLarghezza(Double larghezza) {
		this.larghezza = larghezza;
	}
	public void setAltezza(Double altezza) {
		this.altezza = altezza;
	}
	public void setProfondità(Double profondità) {
		this.profondità = profondità;
	}
	public void setAnnoDiProduzione(Integer annoDiProduzione) {
		this.annoDiProduzione = annoDiProduzione;
	}


}

