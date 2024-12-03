import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {

		// Create una lista con 10 elementi Wifi casuali
		LinkedList<WiFi> lwifi = new LinkedList<WiFi>();
		for (int i = 0; i < 10; i++) {
			lwifi.add(WiFi.MakeWifi());
		}

		System.out.println(lwifi);

		// Domanda:La potreste stampare in formato CSV poiché
		// dobbiamo passarla al vostro collega Onisa?
		for (var x : lwifi) {
			String a = String.format("%s,%s,%s,%f\n", 
					x.getId(), x.getProtocollo(), x.getPassword(), x.getFrequenza());
			System.out.print(a);
			
			System.out.printf("%s,%s,%s,%f\n", 
					x.getId(), x.getProtocollo(), x.getPassword(), x.getFrequenza());
		}
	}
}