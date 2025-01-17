public class Verificatore {
	public static void main(String[] args) {
		VerificatoreParola verificatoreParola = (p , l) -> p.length() >= l;
		boolean len = verificatoreParola.verifica("Ciao", 4);
		System.out.println(len);
		
	}

}

@FunctionalInterface

interface VerificatoreParola {

             boolean verifica(String parola, int lunghezza);

}