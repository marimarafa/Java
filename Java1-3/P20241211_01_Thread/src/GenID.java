import java.util.concurrent.locks.ReentrantLock;

public class GenID extends Thread {
	static ReentrantLock lock = new ReentrantLock();
	static long ID =0;
	
	public static synchronized void Increase() {
		//lock.lock();
        System.out.println(ID );
        // Simulare un minimo di tempo di calcolo
        try {
            Thread.sleep(71);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        
        ID = ID + 1;
        //lock.unlock();
	}
	
	public void run() {
        for (int i=0; i<100; i++) {
        	Increase();
            // Simulare un minimo di tempo di calcolo
        try {
            Thread.sleep(97);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }
}
