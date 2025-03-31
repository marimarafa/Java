
public class Thread5 extends Thread {
	private String c;
	
	public void run() {
			if(c == "a") {
				for(int i = 1; i <=10; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(c + i);
				}
			}
			else if(c == "b") {
				for(int i = 100; i >=90; i--) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(c + i);
				}
			} else {
				System.out.println("Errore lettera non valida.");
			}
		}
		
	public Thread5(String c) {
		super();
		this.c= c;
	}

}
