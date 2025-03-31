
public class Calcolatrice {

	public static void main(String[] args) {
		Somma(2,1);
		Sottrazione(4,2);
		Multiplicazione(4,2);
		Divisione(6,2);

	}

	public static double Divisione(double i , double j) {
		return i/j;
		
	}

	public static int Multiplicazione(int i, int j) {
		return i*j;
		
	}

	public static int Sottrazione(int i, int j) {
		return i-j;
		
	}

	public static int Somma(int i, int j) {
		return i +j;
		
	}
	

}
