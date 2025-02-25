
public class Esercizio {

	public static void main(String[] args) {
		/*
		 * Realizzare una classe Computer con i seguenti attributi:
		 * - Prezzo
		 * - Peso
		 * - Dimensione (largezza , altezza , profondità)
		 * - Anno di produzione
		 * 
		 * Nel main creare due o tre oggetti di tipo Computer
		 * e stampare il loro contenuto
		 * 
		 * NB :utilizzare getter, setter e costruttore
		 * Bonus: aggiungere un metodo alla classe Computer che stampi quanti oggetti sono stati creati 
		 * */
	
		
		Computer c1 = new Computer(23.5,35.6,1980,2.3,4.3,4.5);
		System.out.println(c1.getDimensione());
		System.out.println(c1.getAnno_produzione());
		c1.setLarghezza(23.5);
		System.out.println(c1.getLarghezza());
		System.out.println(c1.Numero_computer());
		Computer c2 = new Computer(23.5,35.6,1980,2.3,4.3,4.5);
		System.out.println(c2.Numero_computer());
		
	}
		
	}


