import java.util.*;

public class Main {

	public static void main(String[] args) {
		/*
         * Definire la classe astratta Automezzo con attributi
         * - numero di ruote
         * - carburante
         * e con il metodo astratto getMaxSpeed()
         * Definire due classi figlie di Automezzo: Motociclo e Autovettura
         * che aggiungono gli attributi cilindrata e consumo
         * 1) Creare una lista di Motociclo e una lista di Autovettura
         * 2) inserire almeno 10 elementi per lista
         * 3) Stampare le liste ordinate (per velocità e poi per consumo)
         * 4) Costruire una nuova lista che contiene contemporaneamente Motocicli e Autovetture
         * 6) Stampare la nuova lista ordinata (per velocità e poi per consumo)
         */
		Motociclo m1 = new Motociclo(2, "swgg", 200, 12.0);
		Motociclo m2 = new Motociclo(2, "xec", 100, 22.0);
		Motociclo m3 = new Motociclo(2, "erwe", 200, 42.0);
		
		LinkedList<Motociclo> lm = new LinkedList();
		lm.add(m1);
		lm.add(m2);
		lm.add(m3);
		
		Autovettura a1 = new Autovettura(4, "e2feg", 40, 2.0);
		Autovettura a2 = new Autovettura(4, "ewrw3", 60, 32.0);
		Autovettura a3 = new Autovettura(4, "ceq2", 20, 3.0);
		
		LinkedList<Autovettura> la = new LinkedList();
		la.add(a1);
		la.add(a2);
		la.add(a3);
		Collections.sort(la);
		System.out.println(la);
		Collections.sort(lm);
		System.out.println(lm);
		
		LinkedList<AutoMezzo> laumtomezzi = new LinkedList<AutoMezzo>();
		laumtomezzi.addAll(la);
		laumtomezzi.addAll(lm);
		
		Collections.sort(laumtomezzi);
		System.out.println(laumtomezzi);
		

	}

}
