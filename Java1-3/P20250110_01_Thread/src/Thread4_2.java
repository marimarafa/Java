
public class Thread4_2 extends Thread{
	public void run() {
		for(int i=0; i<=5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

}
