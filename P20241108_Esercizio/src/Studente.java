public class Studente extends Persona implements Comparable<Studente> {
	static public int studentiCreati = 0;
	private String corso;
	private int annoDiFrequenza;
	
	public Studente(String nome, int eta, String corso, int annoDiFrequenza) {
		super(nome, eta);
		this.corso = corso;
		this.annoDiFrequenza = annoDiFrequenza;
		studentiCreati ++ ;
	}

	public Studente() {
		super();
		
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
	public String toString() {
		return "Studente: "+super.toString() +",corso = " + corso + ", annoDiFrequenza = " + annoDiFrequenza + ".\n";
	}

	@Override
	public int compareTo(Studente o) {
		if(getNome().compareTo(o.getNome()) != 0) {
			return getNome().compareTo(o.getNome());
		}
		else if(getEta() - o.getEta() != 0 ) {
			return getEta() - o.getEta();
		}
		else if(getCorso().compareTo(o.getCorso())!= 0){
			return getCorso().compareTo(o.getCorso());
		}
		else if(getAnnoDiFrequenza() - o.getAnnoDiFrequenza() != 0 ) {
			return getAnnoDiFrequenza() - o.getAnnoDiFrequenza();
	
		}
		return 0;
	}
	
}
