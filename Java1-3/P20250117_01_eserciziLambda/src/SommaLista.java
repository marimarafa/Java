import java.util.List;

public class SommaLista {
    public static void main(String[] args) {
        Sommatore sommatore = (lista) -> {
            int somma = 0;
            for (int l : lista) {
                somma += l;
            }
            return somma; 
        };
        int ris = sommatore.somma(List.of(2,3,4,5));
        System.out.println(ris);
	

	}

}
@FunctionalInterface
interface Sommatore {
    int somma(List<Integer> lista);
}