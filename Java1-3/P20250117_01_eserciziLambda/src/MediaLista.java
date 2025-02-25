import java.util.List;

public class MediaLista {

	public static void main(String[] args) {
		CalcolatoreMedia calcolatoreMedia = (lista) -> {
			int somma = 0;
			for(int i : lista) {
				somma += i;
			}
			return (double)somma / lista.size();
		};
		   double media = calcolatoreMedia.calcola(List.of(23,4,5,6));
	        System.out.println("La media è: " + media);
	}

}

@FunctionalInterface
interface CalcolatoreMedia {
	double calcola(List<Integer> lista);
}