import java.util.*;

public class Produttore extends Thread {
    private long num;

    public static void Run() {
    	Queue<Integer> qi = new LinkedList<Integer>();
		Random r = new Random();
    	
		while(true) {
			for(int i = 0;i>100;i++) {
				qi.add(r.nextInt(100));
			}
    		try {
				Thread.sleep(100,1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    	}
    }
    public Produttore(long num) {
        super();
        this.num = num;
    }
}

