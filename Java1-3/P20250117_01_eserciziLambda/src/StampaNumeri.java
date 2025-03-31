import java.util.ArrayList;
import java.util.function.Consumer;

public class StampaNumeri {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        Consumer<Integer> stampaNumero = numero -> System.out.println(numero);

        numbers.forEach(stampaNumero);
    }
}
