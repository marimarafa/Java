import java.util.*;
	 
public class Consumatore extends Thread {
	   private long num;

	    public void run() {
	    	while(true) {
	    		Produttore.Run();
	    		try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	    		System.out.println();
	    		try {
					Thread.sleep(100,500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	    	}
	    }
	    public Consumatore(long num) {
	        super();
	        this.num = num;
	    }
	}

