public class Autovettura extends AutoMezzo {
	private Integer cilindrata;
	private Double consumo;
	
	@Override
	public Integer MaxSpeed() {
		return 100;
		
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
	public String toString() {
		return "\nAutovettura [cilindrata=" + cilindrata + ", consumo=" + consumo + ", " + super.toString()
				+ "]";
	}
	public Autovettura(Integer numero_ruote, String carburante, Integer cilindrata, Double consumo) {
		super(numero_ruote, carburante);
		this.cilindrata = cilindrata;
		this.consumo = consumo;
	}
	public Autovettura() {
		super();
	}
	@Override
	public Double GetConsumo() {
		return consumo;
	}
	

	

}
