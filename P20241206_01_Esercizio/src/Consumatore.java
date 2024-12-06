public class Consumatore {

	public Consumatore() {
		super();
	}
	static int[] digit = new int [10];
	static double numero =0.0;
	public static void RiceviCarattere(char c) {
		if(c == '\n') {
			System.out.println("Il numero è :" + numero );
		} else if(c == '-' | c == '+' | c == '' ) {
			
			
		}
		
	}
}

    private static double numero = 0.0;
    private static boolean hasDecimalPoint = false;
    private static boolean isNegative = false;
    private static boolean hasStarted = false;
    private static int decimalPosition = 0;

    public static void RiceviCarattere(char c) {
        // Caso: '\n' (fine stringa)
        if (c == '\n') {
            if (hasStarted) {
                if (isNegative) {
                    numero = -numero;
                }
                System.out.println("Il numero è: " + numero);
            } else {
                System.out.println("Errore");
            }
            resetState(); // Ripristina lo stato per una nuova elaborazione
            return;
        }

        // Caso: Segno '+' o '-'
        if (c == '-' || c == '+') {
            if (hasStarted) {
                System.out.println("Errore"); // Segno dopo l'inizio
                resetState();
                return;
            }
            hasStarted = true;
            isNegative = (c == '-');
            return;
        }

        // Caso: Punto '.'
        if (c == '.') {
            if (hasDecimalPoint) {
                System.out.println("Errore"); // Secondo punto
                resetState();
                return;
            }
            hasDecimalPoint = true;
            hasStarted = true;
            decimalPosition = 0;
            return;
        }

        // Caso: Digit '0-9'
        if (Character.isDigit(c)) {
            hasStarted = true;
            int digitValue = c - '0';
            if (!hasDecimalPoint) {
                numero = numero * 10 + digitValue; // Parte intera
            } else {
                decimalPosition++;
                numero += digitValue / Math.pow(10, decimalPosition); // Parte decimale
            }
            return;
        }

        // Caso: Carattere non valido
        System.out.println("Errore");
        resetState();
    }

    // Ripristina lo stato per una nuova elaborazione
    private static void resetState() {
        numero = 0.0;
        hasDecimalPoint = false;
        isNegative = false;
        hasStarted = false;
        decimalPosition = 0;
    }
