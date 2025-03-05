public abstract class AutoMezzo implements Comparable<AutoMezzo> {
	private Integer numero_ruote;
	private String carburante;
	
	
	public abstract Double GetConsumo();
	public abstract Integer  MaxSpeed();
	
	public Integer getNumero_ruote() {
		return numero_ruote;
	}
	public void setNumero_ruote(Integer numero_ruote) {
		this.numero_ruote = numero_ruote;
	}
	public String getCarburante() {
		return carburante;
	}
	public void setCarburante(String carburante) {
		this.carburante = carburante;
	}
	@Override
	public String toString() {
		return "numero_ruote=" + numero_ruote + ", carburante=" + carburante + ".";
	}
	public AutoMezzo(Integer numero_ruote, String carburante) {
		super();
		this.numero_ruote = numero_ruote;
		this.carburante = carburante;
	}
	public AutoMezzo() {
		super();
	}
	
	public int compareTo(AutoMezzo o) {
		int s1 = MaxSpeed().compareTo(o.MaxSpeed());
		if (s1 != 0) {
			return s1;
		} else {
		 return GetConsumo().compareTo(o.GetConsumo());
		}
	}
	

}
