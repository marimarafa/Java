import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente(1, "Mario", "Rossi", "mariorossi@gmail.com", 1234);
		Cliente cliente2 = new Cliente(1, "Anna", "Bianchi", "annabianchi@gmail.com", 0000);
		LinkedList<String> negozi = new LinkedList<String>();
		negozi.add("Unieuro");
		negozi.add("Apple Store");
		Smartphone sm1 = new Smartphone(1, "Iphone 15 pro","smartphone con fotocamera da 48 MP", 1299.99 , negozi, 6, "argento");
		negozi.add("Media World");
		Smartphone sm2 = new Smartphone(2, "Galaxy 24 ultra","smartphone con fotocamera principale da 50 MP", 999.99 , negozi, 5, "nero");
		
		LinkedList<Prodotto> prodotti = new LinkedList<Prodotto>();
		prodotti.add(sm2);
		cliente1.AcquistaProdotti(prodotti);
		prodotti.add(sm1);
		cliente2.AcquistaProdotti(prodotti);
		
		
	}

}
