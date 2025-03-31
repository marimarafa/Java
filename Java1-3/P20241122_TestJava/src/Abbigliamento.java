
public class Abbigliamento extends Prodotto{

	public Abbigliamento() {
		super();
	}

	public Abbigliamento(String name, Double price, String categoria) {
		super(name, price, categoria);
	}

	@Override
	public Double calculateDiscount() {
		if (getCategoria() == "Abbigliamento invernale") {
			return getPrice() - (getPrice() * 0.15);
		} else {
			return getPrice();
		}
	}

	@Override
	public String toString() {
		return "\nAbbigliamento [" + super.toString() + "]";
	}
	
	

}
