public class Studente extends Persona {
	private String corso;
	private int annoDiFrequenza;
	
	public Studente(String nome, int eta, String corso, int annoDiFrequenza) {
		super(nome, eta);
		this.corso = corso;
		this.annoDiFrequenza = annoDiFrequenza;
	}

	public String getCorso() {
		return corso;
	}

	public void setCorso(String corso) {
		this.corso = corso;
	}

	public int getAnnoDiFrequenza() {
		return annoDiFrequenza;
	}

	public void setAnnoDiFrequenza(int annoDiFrequenza) {
		this.annoDiFrequenza = annoDiFrequenza;
	}

	@Override
	public String toString() {
		return super.toString() +",corso = " + corso + ", annoDiFrequenza = " + annoDiFrequenza + ".";
	}
	
	
}
