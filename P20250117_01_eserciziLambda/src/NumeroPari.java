public class NumeroPari {
	public static void main(String[] args) {
		VerificatoreNumeroPari verificatore = (n)-> (n % 2 == 0);
		boolean ris = verificatore.verifica(300);
		System.out.println(ris);

	}

}

@FunctionalInterface
interface VerificatoreNumeroPari {
	boolean verifica(int numero);
}
