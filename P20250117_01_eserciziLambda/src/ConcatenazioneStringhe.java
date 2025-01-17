public class ConcatenazioneStringhe {
	public static void main(String[] args) {
		Concatenazione concatenazione = (a,b) -> a+ b;
		String ris = concatenazione.concatena("Buon", "giorno");
		System.out.println(ris);
		
	}

}
@FunctionalInterface
interface Concatenazione {
    String concatena(String a , String b);
}