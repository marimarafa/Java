class Somma {
	public static void main(String[] args) {
		Calcolatore calcolatore = (a , b) -> a+b ;
		int somma = calcolatore.calcola(3, 4);
		System.out.println("la somma è :" + somma );
	}
	
}

@FunctionalInterface

interface Calcolatore {

	int calcola(int a, int b);

}
