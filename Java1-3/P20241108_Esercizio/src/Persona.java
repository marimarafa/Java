public class Persona extends EssereVivente{
	private String nome;
	private int eta;
	
	public Persona(String nome, int eta) {
		super();
		this.nome = nome;
		this.eta = eta;
	}
	
	public Persona() {
		super();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public String toString() {
		return " nome = " + nome + ", eta = " + eta ;
	}

	@Override
	public void SetColoreOcchi(String s) {
		
	}

	@Override
	public void GetColoreOcchi(String s) {
		
	}
	
}
