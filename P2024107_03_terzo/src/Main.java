
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d1 = 45.3;
		double d2 = 67.2;

		double ipotenusa = Math.sqrt((d1* d1) + (d2 *d2));
		System.out.println("La lunghezza dell'ipotenusa: " + ipotenusa );

		double area = 0.5 * d1 * d2;
		System.out.println("L'area del triangolo rettangolo è: " + area );

		double perimetro = d1 + d2 + ipotenusa;
		System.out.println("Il perimetro del triangolo rettangolo è: " + perimetro );

		double raggio = (3.0 / 4.0) * ipotenusa;

        double circonferenza = 2 * Math.PI * raggio;
        System.out.println("La circonferenza del cerchio è: " + circonferenza);

        double area_cerchio = Math.PI * (raggio * raggio);
        System.out.println("L'area del cerchio è: " + area_cerchio);

	}

}