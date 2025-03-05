public class AreaCerchio {
	public static void main(String[] args) {
		CalcolatoreArea calcolatoreArea = (r) ->  Math.PI* r* r;
		double area = calcolatoreArea.calcola(7.0);
		System.out.println(area);
	} 
	

}

@FunctionalInterface

interface CalcolatoreArea {

             double calcola(double raggio);

}