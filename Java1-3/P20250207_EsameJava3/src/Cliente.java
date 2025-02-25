import java.util.LinkedList;

public class Cliente {
	private int id;
	private String nome;
	private String cognome;
	private String email;
	private int password;
	
	public void AcquistaProdotti(LinkedList<Prodotto> prodotti){
		System.out.println("I prodotti acquistati dal cliente: " + nome + " sono:\n " + prodotti);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public Cliente(int id, String nome, String cognome, String email, int password) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
	}

}
