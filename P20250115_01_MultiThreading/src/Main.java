public class Main {
	public static void main(String[] args) throws InterruptedException {
		ClienteSync c1 = new ClienteSync("Mario ", 20);
		ClienteNonSync c2 = new ClienteNonSync("Lucia ", 50);
		// Avvio i Threads
		c1.start();
		c2.start();
		// Attendo il completamento
		c1.join();
		c2.join();
	}
}