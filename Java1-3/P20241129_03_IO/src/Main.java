import java.io.*;
import java.util.*;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Locale.setDefault(Locale.US);
		// Create una lista con 10 elementi Wifi casuali
		LinkedList<WiFi> lwifi = new LinkedList<WiFi>();
		for (int i = 0; i < 10; i++) {
			lwifi.add(WiFi.MakeWifi());
		}

		//System.out.println(lwifi);

		// Domanda:La potreste stampare in formato CSV poiché
		// dobbiamo passarla al vostro collega Onisa?
		for (var x : lwifi) {
//			String a = String.format("%s,%s,%s,%f\n", 
//					x.getId(), x.getProtocollo(), x.getPassword(), x.getFrequenza());
			//System.out.print(a);
			//System.out.printf("%s,%s,%s,%f\n", 
					//x.getId(), x.getProtocollo(), x.getPassword(), x.getFrequenza());
		}
		var fou = Util.OpenFileForWriting("wifi.dat");
		for (var x : lwifi) {
			String a = String.format("%s,%s,%s,%f\n",x.getId(), x.getProtocollo(), x.getPassword(), x.getFrequenza());
			fou.write(a);
		}
		fou.close();
		
		//lwifi.clear();
		
		BufferedReader fin = Util.OpenFileForReading("wifi.dat");
		String riga = fin.readLine();
//		while (riga != null) {
//			riga = new StringBuilder(new StringBuilder(riga).reverse().toString().replaceFirst(",", ".")).reverse()
////                    .toString();
//			String[] items = riga.split(",");
//			WiFi it = new WiFi(items[0], items[1], items[2], Double.parseDouble(items[3]));
//			lwifi.add(it);
//			riga = fin.readLine();
//		}
//		fin.close();
		
		//serialize
		WiFi appo = WiFi.MakeWifi();
		// dichiaro la stringa che conterra la descrizione in formato json
		String jsonString;
		ObjectMapper objectMapper = new ObjectMapper();
		jsonString = objectMapper.writeValueAsString(appo);
		System.out.println(jsonString);
		
		
		// deserialize
		WiFi nuovo = objectMapper.readValue(jsonString, WiFi.class);
		System.out.println(nuovo);
		
		
		var file = Util.OpenFileForWriting("wifi.txt");
		for (var x : lwifi) {
			String a = objectMapper.writeValueAsString(x);
			file.write(a + "\n");
		}
		file.close();
		
		
		lwifi.clear();
		fin = Util.OpenFileForReading("wifi.txt");
		riga = fin.readLine();
		while (riga != null) {
			WiFi it = objectMapper.readValue(riga, WiFi.class);
			lwifi.add(it);
			riga = fin.readLine();
		}
		fin.close();
		System.out.println(lwifi);
		
		
		String listaJson = objectMapper.writeValueAsString(lwifi);
		System.out.println(listaJson);
		
		lwifi.clear();
		lwifi = objectMapper.readValue(listaJson, lwifi.getClass());
		System.out.println(lwifi);
		
		
	}
}