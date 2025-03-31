import java.util.List;

public class LetturaMessaggi implements Runnable {
	private final List<Integer> casellaPosta;

	public LetturaMessaggi(List<Integer> casellaPosta) {
		this.casellaPosta = casellaPosta;
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("Lettura dei messaggi in corso...");
				leggiMessaggi();
				Thread.sleep(3000);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

	private void leggiMessaggi() throws InterruptedException {
		while (casellaPosta.isEmpty()) {
			synchronized (casellaPosta) {
				System.out.println("La casella è vuota, la dimensione della casella adesso è: " + casellaPosta.size());
				System.out.println("Lettura in attesa");
				casellaPosta.wait();
			}
		}

		synchronized (casellaPosta) {
			System.out.println("Messaggio eliminato dalla casella " + casellaPosta.remove(0)
					+ " la dimensione della casella adesso è: " + casellaPosta.size());
			casellaPosta.notifyAll();
		}
	}
}