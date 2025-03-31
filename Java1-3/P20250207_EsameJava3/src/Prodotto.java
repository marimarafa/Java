import java.util.LinkedList;

public class Prodotto {
	private int id;
	private String nome ;
	private String descrizione;
	private double prezzo;
	LinkedList<String> negozi = new LinkedList<String>();
	
	
	@Override
	public String toString() {
		return " id=" + id + ", nome=" + nome + ", descrizione=" + descrizione + ", prezzo=" + prezzo
				+ ", negozi=" + negozi ;
	}
	public int getId() {
		return id;
	}
	public Prodotto() {
		super();
	}
	public Prodotto(int id, String nome, String descrizione, double prezzo, LinkedList<String> negozi) {
		super();
		this.id = id;
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.negozi = negozi;
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
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public LinkedList<String> getNegozi() {
		return negozi;
	}
	public void setNegozi(LinkedList<String> negozi) {
		this.negozi = negozi;
	}
}
