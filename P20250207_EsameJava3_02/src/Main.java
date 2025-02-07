import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> casellaPosta = new LinkedList<Integer>();

		Thread invio = new Thread(new InvioMessaggi(casellaPosta));
		Thread leggi = new Thread(new LetturaMessaggi(casellaPosta));

		invio.start();
		try {
			invio.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		leggi.start();

	}

}
