
public class Computer {
	private double prezzo;
	private double peso;
	private double dimensione;
	private int anno_produzione;
	private double larghezza;
	private double altezza;
	private double profondità;
	
	static int conta = 0;
	public static int Numero_computer() {
		return conta;
	}
	
	public Computer(double prezzo, double peso, int anno_produzione, double larghezza, double altezza,
			double profondità) {
		super();
		this.prezzo = prezzo;
		this.peso = peso;
		this.anno_produzione = anno_produzione;
		this.larghezza = larghezza;
		this.altezza = altezza;
		this.profondità = profondità;
		
		dimensione = altezza + larghezza + profondità;
		
		conta ++;
	} 

	@Override
	public String toString() {
		return "Computer [prezzo=" + prezzo + ", peso=" + peso + ", dimensione=" + dimensione + ", anno_produzione="
				+ anno_produzione + ", larghezza=" + larghezza + ", altezza=" + altezza + ", profondità=" + profondità
				+ "]";
	}

	public double getPrezzo() {
		return prezzo;
	}

	public double getPeso() {
		return peso;
	}

	public int getAnno_produzione() {
		return anno_produzione;
	}

	public double getLarghezza() {
		return larghezza;
	}
	
	public double getDimensione() {
		return dimensione;
	}
	public double getAltezza() {
		return altezza;
	}

	public double getProfondità() {
		return profondità;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAnno_produzione(int anno_produzione) {
		this.anno_produzione = anno_produzione;
	}

	public void setLarghezza(double larghezza) {
		this.larghezza = larghezza;
		UpdateFunctionalRelations();
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
		UpdateFunctionalRelations();
	}

	public void setProfondità(double profondità) {
		this.profondità = profondità;
		UpdateFunctionalRelations();
	}
	
	private void UpdateFunctionalRelations() {
		dimensione = altezza + larghezza + profondità;
		
	}


	

}
