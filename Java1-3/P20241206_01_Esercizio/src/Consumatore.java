public class Consumatore {
	private static String numero ;
	private static boolean isNegativ = false;
	private static boolean isPositive = false;
    private static boolean hasDecimalPoint = false;
	

	public static void ControllaCarattere(char c) {
		if(c == '\n') {
			double d = Double.parseDouble(numero);
			System.out.println("Il numero è :" + d );
		} 
		else if(c == '-' || c == '+' || c == '.') {
			if((isNegativ == false)&&(c == '-')) {
				numero =   c + numero ;
				isNegativ = true;
			}
			else if (hasDecimalPoint == false && c == '.') {
				numero =   c + numero ;
				hasDecimalPoint = true;
			} 
			else if(isPositive == false && c == '+') {
				isPositive = true;
			}
		} 
		else if(Character.isDigit(c)) {
			// d = d*10 +v
			 numero = numero + c;
		}
		else {
			System.out.println("Errore, Carattere non valido.");
		}
	}
	
}
   

    
    

   


