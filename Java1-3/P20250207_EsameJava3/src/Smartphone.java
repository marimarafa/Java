import java.util.LinkedList;

public class Smartphone extends Prodotto {
	private int dimensioneSchermo;
	private String colori;
	
	public Smartphone() {
		super();
	}

	public int getDimensioneSchermo() {
		return dimensioneSchermo;
	}

	public void setDimensioneSchermo(int dimensioneSchermo) {
		this.dimensioneSchermo = dimensioneSchermo;
	}

	public String getColori() {
		return colori;
	}

	public void setColori(String colori) {
		this.colori = colori;
	}

	public Smartphone(int id, String nome, String descrizione, double prezzo, LinkedList<String> negozi,
			int dimensioneSchermo, String colori) {
		super(id, nome, descrizione, prezzo, negozi);
		this.dimensioneSchermo = dimensioneSchermo;
		this.colori = colori;
	}

	@Override
	public String toString() {
		return "[" + super.toString() + " dimensioneSchermo= " + dimensioneSchermo + ", colori=" + colori 
				+ "]\n" ;
	}

	

}
