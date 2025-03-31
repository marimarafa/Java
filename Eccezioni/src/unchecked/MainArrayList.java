package unchecked;

import java.util.ArrayList;

public class MainArrayList {

	public static void main(String[] args) {
		// creo un arrayList di stringhe e uso metodi che sollevano eccezioni UNCHECKED

		ArrayList<String> fiori = new ArrayList<String>();
		fiori.add("rose");
		fiori.add("fresie");
		fiori.add("margherite");

		System.out.println(fiori);

		System.out.println(fiori.get(0));
		int x = 5;
		try {
			fiori.add(x, "narcisi");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
