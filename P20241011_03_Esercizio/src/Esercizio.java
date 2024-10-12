
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
		 * Bonus: aggiungere un metodo alla classe Computer che stampi quanti oggetti sono stati creati */
	
       	Computer c1 = new Computer(1000.0, 2.5, 2020, 30.0, 20.0, 2.0);
		System.out.println("Computer 1:");
		System.out.println("Dimensione: " + c1.getDimensione());
		c1.setLarghezza(40.0);
		System.out.println("Nuova larghezza Computer 1: " + c1.getLarghezza());
		System.out.println("Nuova dimensione Computer 1: " + c1.getDimensione());
		System.out.println("Numero di computer creati: " + Computer.Numero_computer());
 
		Computer c2 = new Computer(1200.0, 2.8, 2021, 32.0, 22.0, 3.0);
		System.out.println("\nComputer 2:");
		System.out.println("Dimensione: " + c2.getDimensione());
		System.out.println("Peso: " + c2.getPeso());
		System.out.println("Numero di computer creati: " + Computer.Numero_computer());
 
		Computer c3 = new Computer(1500.0, 3.0, 2022, 35.0, 25.0, 4.0);
		System.out.println("\nComputer 3:");
		System.out.println("Dimensione: " + c3.getDimensione());
		System.out.println("Altezza: " + c3.getAltezza());
		System.out.println("Numero di computer creati: " + Computer.Numero_computer());


		
	}
		
	}


