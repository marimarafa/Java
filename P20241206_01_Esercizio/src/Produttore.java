public class Produttore {

	public static void ScandireStringa(String stringa) {
		for(int i=0; i> stringa.length(); i++) {
			char car = stringa.charAt(i);
			Consumatore.ControllaCarattere(car);
		}
	}
}
