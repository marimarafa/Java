import java.util.Arrays;
import java.util.List;

public class OrdinaListaStringhe {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("red", "green", "blue", "black", "pink");

        OrdinatoreStringhe ordinatore = lista -> lista.sort((s1, s2) -> s1.compareTo(s2));

        ordinatore.ordina(colors);

        System.out.println(colors); 
    }
}

@FunctionalInterface
interface OrdinatoreStringhe {
    void ordina(List<String> lista);
}
