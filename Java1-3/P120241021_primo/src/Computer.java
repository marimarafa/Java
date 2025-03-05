public class Computer {
	   
		private Double prezzo;
	    private Double peso;
	    private Double larghezza, altezza, profondità;
	    private String produttore;
	    private Integer annoDiProduzione;
	    private static int contatore = 0;
	   
		public Computer(Double prezzo, Double peso, Double larghezza, Double altezza, Double profondità,
				String produttore, Integer annoDiProduzione) {
			
			this.prezzo = prezzo;
			this.peso = peso;
			this.larghezza = larghezza;
			this.altezza = altezza;
			this.profondità = profondità;
			this.produttore = produttore;
			this.annoDiProduzione = annoDiProduzione;
			
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
			return "Computer [prezzo=" + prezzo + ", peso=" + peso + ", larghezza=" + larghezza + ", altezza=" + altezza
					+ ", profondità=" + profondità + ", produttore=" + produttore + ", annoDiProduzione="
					+ annoDiProduzione + "]";
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
		public String getProduttore() {
			return produttore;
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
		public void setProduttore(String produttore) {
			this.produttore = produttore;
		}
		public void setAnnoDiProduzione(Integer annoDiProduzione) {
			this.annoDiProduzione = annoDiProduzione;
		}


	}

