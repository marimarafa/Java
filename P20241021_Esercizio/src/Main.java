public class Main {

	public static void main(String[] args) {
		/*
		 * for i in range(0, 10):
		 * 		print(i)
		 */
		
		/*per il for: tre elementi separati da ;
		 * primo : 	dichiarazione e inizializzazione 
		 * 			della variabile di ciclo
		 * secondo: condizione di permanenza nel ciclo
		 * terzo:	incremento della variabile di ciclo
		 * 			da fare come ultima istruzione del ciclo
		 */
		for (int i=0; i<10; i++) {
			System.out.println(i);
		}
		
//		for (;;) {
//			System.out.println("Ciao");
//		}
		
		int i1=20;
		for (; i1<25; i1 += 10) {
			System.out.println(i1);
		}

//		for (int i=0; i1<10; i++) {
//			System.out.println(i);
//		}
//		for (int i=0; i<1;) {
//			System.out.println(i);
//		}
		
		for (int i=2; i<=20; i+=2) {
			System.out.println(i);
		}
		/*
		 * for i in range(2, 21, 2):
		 * 		print(i)
		 */
		for (int i=2; i<=20; i++) {
			System.out.println(i);
			i = i+1;
		}
		
		/* Considerato che Math.random() genera un numero
		 * double casuale compreso tra 0 e 1, 1 escluso,
		 * stampare 10 numeri casuali, uno per riga.
		 * double d;
		 * d = Math.random();
		 */
		for (int i=0; i<10; i++) {
			Double d= Math.random();
			System.out.println(d);
		}
		
		/* La stessa cosa ma sulla stessa riga, separati da spazio
		 * andando a capo solo in fondo
		 */
		for (int i=0; i<10; i++) {
			Double d= Math.random();
			System.out.print(d);
			System.out.print(" ");
		}
		System.out.println();
		
		/* E se ...
		 *  1) 0.23423
		 *  2) 0.12313
		 *  ...
		 *  9) 0.12313
		 * 10) 0.123344
		 */
		for (int i=0; i<10; i++) {
			Double d= Math.random();
			System.out.println(((i<9)?" ":"") + (i+1) + ") " + d);
		}
		
		/*
		 * Operatore ternario
		 * <espressione logica>?<valore se true>:<valore se false>
		 */
		for (int i=0; i<10; i++) {
			Double d= Math.random();
			System.out.printf("%2d)\t%4.3g\n", i+1, d);
		}
		/*
		 * System.out.printf è un metodo che vuolevcome parametri
		 * 1) una stringa di formato
		 * 2) un elenco di variabili i cui valori
		 *    saranno inseriti nella stringa risultante
		 *    in corrispondenza dei caratteri %<dgcs..> dove
		 *    d: intero
		 *    c: char
		 *    g: float
		 *    s: string
		 *    ...
		 *    Inoltre nella stringa di formato
		 *    \n => vai a capo a nuova riga
		 *    \r => vai a capo sulla riga corrente
		 *    \t => inserisci un tab
		 *    Tutto quello che non è %<...> oppure \.
		 *    viene riportato in stampa così com'è 
		 */
		int ni = 10;
		System.out.printf("Il numero è: %d\n", ni);
		
		int n2=44;
		System.out.printf("I numeri sono: %d, %d\n", ni, n2);
		
		System.out.printf("I numeri sono: (%d, %d)\n", ni, n2);
		
		/*
		 * Subito dopo il % e prima dei modificatori (d, f, g, s, b, ...)
		 * è possibile mettere un valore intero che indica la dimensione
		 * del campo
		 * se il valore è decimale allora posso scrivere
		 * <dimensioni totali>.<dimensioni dopo la virgola>
		 * esempio %7.3g => in totale 7 digit di cui 3 dopo la virgola
		 */
		
		System.out.printf("Numero libero: %07d\n", 987);
		System.out.printf("Numero libero: %07d\n", 1123987);
		// Math.ransom()*(2000 - 1000) + 1000;
		
	}

}
