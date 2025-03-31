import java.util.*;

public  class ProductManager implements Ordinabile {
	
	public static void addProduct(List<Prodotto> products,Prodotto prod) {
		products.add(prod);
	}
	
	@Override
	public  List<Prodotto> sortByPrice(List<Prodotto> products) {
		Collections.sort(products);
		return products;

	}

	public ProductManager() {
		super();
	}

}
