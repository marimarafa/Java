public class Thread7 extends Thread{
	
	public void run() {
		System.out.println(this.getState());
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread7 t7 = new Thread7();
		
		
		System.out.println(t7.getState());
		t7.start();
		t7.sleep(500);
		System.out.println(t7.getState());
		
	}

}


