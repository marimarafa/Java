public class Elefante extends Mammifero implements Must,Req,Comparable<Elefante> {
	
	private Double peso;

	@Override
	public String toString() {
		return "\nElefante [peso=" + peso + ", toString()=" + super.toString() + "]";
	}

	public Elefante() {
		super();
	}

	public Elefante(Integer freqResp, Integer freqcardio, Double peso) {
		super(freqResp, freqcardio);
		this.peso = peso;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	@Override
	public String Verso() {
		return "Barrito";
	}

	@Override
	public int compareTo(Elefante o) {
		return peso.compareTo(o.peso);
	}

	@Override
	public String GetClassName() {
		return "Elefante";
	}

	@Override
	public String GetVersion() {
		return "1.0";
	}

	@Override
	public String GetSerial() {
		return "TJ89";
	}

}
