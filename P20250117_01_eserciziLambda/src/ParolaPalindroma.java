public class ParolaPalindroma {
	public static void main(String[] args) {
		VerificatoreParola2 verificatoreParola2 = (parola) -> {
			String parolaInversa = new StringBuilder(parola).reverse().toString();
			return parolaInversa.equals(parola);
		};
		boolean v =  verificatoreParola2.verifica("anna");
		boolean v1 =  verificatoreParola2.verifica("ciao");
		System.out.println(v);
		System.out.println(v1);
	}

}

@FunctionalInterface
interface VerificatoreParola2 {
    boolean verifica(String parola);
}
