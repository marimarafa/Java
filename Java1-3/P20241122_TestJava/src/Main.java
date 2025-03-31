import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		Abbigliamento ab1 = new Abbigliamento("dress", 20.3,"Abbigliamento estivo");
		Abbigliamento ab2 = new Abbigliamento("jacket", 34.0,"Abbigliamento invernale");
		Abbigliamento ab3 = new Abbigliamento("sweater", 24.0,"Abbigliamento invernale");
		System.out.println(ab2.calculateDiscount());
		
		LinkedList<Abbigliamento> lab = new LinkedList<Abbigliamento>();
		lab.add(ab1);
		lab.add(ab2);
		lab.add(ab3);
			
		Elettronica el1 = new Elettronica("Computer", 300.0,"ewef");
		Elettronica el2 = new Elettronica("Mobile", 600.0,"fd3wf");
		Elettronica el3 = new Elettronica("Dishwasher", 800.0,"eedecf");
		System.out.println(el2.calculateDiscount());
		
		LinkedList<Elettronica> lel = new LinkedList<Elettronica>();
		lel.add(el1);
		lel.add(el2);
		lel.add(el3);
		
		LinkedList<Prodotto> lpr = new LinkedList<Prodotto>();
		lpr.addAll(lel);
		lpr.addAll(lab);
		
		
		System.out.println("Lista non ordinata:");
		System.out.println(lpr);
		
		ProductManager prodMan = new ProductManager();
		
		Elettronica el4 = new Elettronica("jhioj", 900.0,"ewef");
		ProductManager.addProduct(lpr, el4);
		
		System.out.println("\nLista ordinata:");
		System.out.println(prodMan.sortByPrice(lpr));
		
		

		

	}

}
