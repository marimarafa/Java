
public class Thread7 extends Thread{
	public static  Thread.State NEW;
	public static  Thread.State RUNNABLE;
	public static  Thread.State TERMINATED;
	
	public void run() {
		if(this.getState() == NEW) {
			System.out.println(this.getState());
			
		}
			
		}
	}


