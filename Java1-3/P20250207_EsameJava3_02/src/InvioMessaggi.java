import java.util.List;

public class InvioMessaggi implements Runnable {
	private final List<Integer> casellaPosta;
	private final int SIZE = 10;
	private int a = 1;

	public InvioMessaggi(List<Integer> casellaPosta) {
		this.casellaPosta = casellaPosta;
	}

	@Override
	public void run() {
		while (true) {
			try {
				inviaMessaggi();
				a++;
				Thread.sleep(2000);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

	private void inviaMessaggi() throws InterruptedException {
		while (casellaPosta.size() == SIZE) {
			synchronized (casellaPosta) {
				System.out.println(
						"la casella è piena,la dimensione della casella è: "+ casellaPosta.size());
				System.out.println("Invio in attesa...");
				casellaPosta.wait();
			}
		}
		synchronized (casellaPosta) {
			casellaPosta.add(a);
			casellaPosta.notifyAll();

			System.out.println("Il messaggio '" + a + "' è stato aggiunto alla casella. \nLa dimensione della casella adesso è: " + casellaPosta.size());
		}
	}

}
