public class StringaVuota {

	public static void main(String[] args) {
		VerificatoreStringa verificatoreStringa = (parola) -> parola.isEmpty();
		System.out.println(verificatoreStringa.verifica(""));
		System.out.println(verificatoreStringa.verifica("ciao"));
		System.out.println(verificatoreStringa.verifica(" "));

	}

}
@FunctionalInterface
interface VerificatoreStringa {
    boolean verifica(String str);
}