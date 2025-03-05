public class Stringhe {
	public static void main(String[] args) {
		System.out.println(ContaCarattere("buongirno ciao aa", 'a' ));
		System.out.println(ParolaPalindroma("anna"));

	}

	public static boolean ParolaPalindroma(String parola) {
		String parolaInversa = new StringBuilder(parola).reverse().toString();
		 return parolaInversa.equals(parola);
	}

	public static int ContaCarattere(String s1, char s2) {
		int conta = 0;
		 for (int i = 0; i < s1.length(); i++) {
		        if (s1.charAt(i) == s2) {
		            conta += 1;
		        }
		 } return conta;
	}

}
