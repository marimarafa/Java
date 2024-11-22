public class Elettronica extends Prodotto {
	

	public Elettronica() {
		super();
	}
	public Elettronica(String name, Double price, String categoria) {
		super(name, price, categoria);
	}

	@Override
	public Double calculateDiscount() {
		if ( getPrice() > 500) {
			return getPrice() - (getPrice() * 0.10) ;
		} else {
			return getPrice();
		}
		
	}

	@Override
	public String toString() {
		return "\nElettronica [" + super.toString() + "]";
	}

}
