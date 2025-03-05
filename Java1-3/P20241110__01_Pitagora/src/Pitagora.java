
public class Pitagora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double cat1 = 45.3;
		double cat2 = 67.2;

		double hyp = Math.sqrt((cat1* cat1) + (cat2 *cat2));
		System.out.println("La lunghezza dell'ipotenusa: " + hyp );

		double area = 0.5 * cat1 * cat2;
		System.out.println("L'area del triangolo rettangolo è: " + area );

		double perimetro = cat1 + cat2 + hyp;
		System.out.println("Il perimetro del triangolo rettangolo è: " + perimetro );

		double raggio = (3.0/ 4.0) * hyp;

        double circonferenza = 2.0  * Math.PI * raggio;
        System.out.println("La circonferenza del cerchio è: " + circonferenza);

        double area_cerchio = Math.PI * (raggio * raggio);
        System.out.println("L'area del cerchio è: " + area_cerchio);
        // Math.PI * Math.pow(raggio * 2 );
        
        
        TriangoloRettangolo tr = new TriangoloRettangolo(3,4);
        System.out.println("Ipotenusa:" +tr.getHyp());
        System.out.println("Area:" + tr.getArea());
        
        tr.setCat1(2);
        System.out.println("Ipotenusa:" +tr.getHyp());
        System.out.println("Area:" + tr.getArea());
        
        
	}

}