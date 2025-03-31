public class Main {
    public static void main(String[] args) {
        stampaComputersConCornice(10); 
    }


    public static void stampaComputersConCornice(int n) {
        for (int i = 1; i <= n; i++) {
            Double prezzo = 500 + Math.random() * 1000;  // Prezzo tra 500 e 1500 €
            Double peso = 1 + Math.random() * 9;         // Peso tra 1 kg e 10 kg
            Double larghezza = 20 + Math.random() * 40;  // Larghezza tra 20 cm e 60 cm
            Double altezza = 10 + Math.random() * 30;    // Altezza tra 10 cm e 40 cm
            Double profondità = 1 + Math.random() * 19;  // Profondità tra 1 cm e 20 cm
            Integer annoDiProduzione = 2010 + (int) (Math.random() * 15); // Anno tra 2010 e 2024
            String produttore = GeneraStringaRandom(5);  // Produttore con 5 caratteri

            // Creazione nuovo oggetto Computer
            Computer com = new Computer(prezzo, peso, larghezza, altezza, profondità, annoDiProduzione,produttore);
            
            
            StampaIntestazioneOChiusura();
            System.out.printf("| %30s |\n", "Computer numero: " + i);
            System.out.printf("| %30s |\n", "");
            
            String[] attributi = com.toString().split("\n");
            for (String attributo : attributi) {
                System.out.printf("| %30s |\n", attributo);
            }
            
            StampaIntestazioneOChiusura();
            System.out.println();
        }
    }

     static public String GeneraStringaRandom(int len) {
    		String minuscole = "abcdefghijklmnopqrstuvwxyz";
    		String maiuscole = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    		String all = minuscole + maiuscole;
    		String res = "";

    		for (int i = 0; i < len; i++) {
    			res += all.charAt((int) (Math.random() * all.length()));
    		}
    		return res;
    }
    
    public static void StampaIntestazioneOChiusura() {
        System.out.println(" "+"-".repeat(30));
    }
}
