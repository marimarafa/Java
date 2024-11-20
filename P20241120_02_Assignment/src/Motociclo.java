public class Motociclo extends AutoMezzo {
	private Integer cilindrata;
	private Double consumo;

	public Motociclo() {
		super();
	}

	public Motociclo(Integer numero_ruote, String carburante, Integer cilindrata, Double consumo) {
		super(numero_ruote, carburante);
		this.cilindrata = cilindrata;
		this.consumo = consumo;
	}

	@Override
	public String toString() {
		return "\nMotociclo [cilindrata=" + cilindrata + ", consumo=" + consumo + ", " + super.toString()
				+ "]";
	}

	public Integer getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(Integer cilindrata) {
		this.cilindrata = cilindrata;
	}


	public void setConsumo(Double consumo) {
		this.consumo = consumo;
	}

	@Override
	public Integer MaxSpeed() {
		return 200;
		
	}

	@Override
	public Double GetConsumo() {
		return consumo;
	}
}
