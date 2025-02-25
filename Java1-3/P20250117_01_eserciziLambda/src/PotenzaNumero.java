public class PotenzaNumero {
	public static void main(String[] args) {
        CalcolatorePotenza calcolatore = (base, esp) -> {
	        int risultato = 1;
	        for (int i = 0; i < esp; i++) {
	            risultato *= base;
	        }
	        return risultato;
        };
     
        System.out.println(calcolatore.calcola(2, 5)); 
        System.out.println(calcolatore.calcola(3, 4)); 
        System.out.println(calcolatore.calcola(5, 3)); 
    }
}

@FunctionalInterface
interface CalcolatorePotenza {
	int calcola(int base, int esponente);
}
