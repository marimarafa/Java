import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		List<Integer> bufferCondiviso = new LinkedList<Integer>();
		int size = 4;

		Thread prodThread = new Thread(new Producer(bufferCondiviso, size), "Producer");
		Thread consThread = new Thread(new Consumer(bufferCondiviso, size), "Consumer");

		prodThread.start();
		try {
			prodThread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		consThread.start();

	}
}