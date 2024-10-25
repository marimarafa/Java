public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Double prezzo = 500 + Math.random() * 1000;  // Prezzo tra 500 e 1500 €
            Double peso = 1 + Math.random() * 9;         // Peso tra 1 kg e 10 kg
            Double larghezza = 20 + Math.random() * 40;  // Larghezza tra 20 cm e 60 cm
            Double altezza = 10 + Math.random() * 30;    // Altezza tra 10 cm e 40 cm
            Double profondità = 1 + Math.random() * 19;  // Profondità tra 1 cm e 20 cm
            Integer annoDiProduzione = 2010 + (int)(Math.random() * 15);// Anno tra 2010 e 2024

            // Crea un nuovo oggetto Computer
            Computer c1 = new Computer(prezzo, peso, larghezza, altezza, profondità, annoDiProduzione);

            // Stampa la cornice
            System.out.println("-".repeat(25));
            System.out.println("| Computer numero: " + i + " |");
            System.out.println(c1.toString());
            System.out.println("-".repeat(25));
        }
    }
}