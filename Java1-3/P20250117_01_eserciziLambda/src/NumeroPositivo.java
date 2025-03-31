public class NumeroPositivo {

	public static void main(String[] args) {
		VerificatoreNumero verificatoreNumero = (n) ->( n > 0);
		boolean pos = verificatoreNumero.verifica(30);
		System.out.println(pos);

	}

}

@FunctionalInterface
interface VerificatoreNumero {
    boolean verifica(int numero);
}