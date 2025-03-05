public class Aereo {
	@Override
	public String toString() {
		return "Aereo [posti_tot=" + posti_tot + ", posti=" + posti + ", id=" + id + "]";
	}

	private  int posti_tot ;
	private  int posti;
	private  int id ;
	

	public  int getId() {
		return id;
	}

	public  void setId(int id) {
		this.id = id;
	}

	
	public  int getPosti_tot() {
		return posti_tot;
	}

	public void setPosti_tot(int posti_tot) {
		this.posti_tot = posti_tot;
	}

	public  int getPosti() {
		return posti;
	}

	public  void setPosti(int posti) {
		this.posti = posti;
	}
		
}