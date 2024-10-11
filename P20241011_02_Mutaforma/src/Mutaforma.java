
public class Mutaforma {
	// la firma è il nome del metodo e i parametri passati
	public static void main(String[] args) {
		int a = Somma(10,20);
		System.out.println(a);
		
		double b = Somma(10.1,20.0);
		System.out.println(b);
	
		String s = Somma("buona" , "sera");
		System.out.println(s);
		
	}
	private static String Somma(String s1, String s2) {
		return s1 + s2;
	}
	
	private static double Somma(double d, double e) {
		return d + e;
	}
	
	private static int Somma(int i , int j) {
		return i +j;
	}
} 

