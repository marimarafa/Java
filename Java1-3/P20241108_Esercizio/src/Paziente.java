public class Paziente extends Persona implements Specs {
	private String illness;
	private boolean codiceRosso;
	
	public Paziente(String nome, int eta, String illness, boolean codiceRosso) {
		super(nome, eta);
		this.illness = illness;
		this.codiceRosso = codiceRosso;
	}
	public String getIllness() {
		return illness;
	}
	public void setIllness(String illness) {
		this.illness = illness;
	}
	public boolean isCodiceRosso() {
		return codiceRosso;
	}
	public void setCodiceRosso(boolean codiceRosso) {
		this.codiceRosso = codiceRosso;
	}
	@Override
	public String toString() {
		return "Paziente :"+ super.toString()+ "illness=" + illness + ", codiceRosso=" + codiceRosso 
				+ ".";
	}
	@Override
	public String GetVersion() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String GetDate() {
		// TODO Auto-generated method stub
		return null;
	}
	

}

