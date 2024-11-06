
public class Main {

	public static void main(String[] args) {
		{
		for (int i = 0; i< 10; i++) {
			System.out.println(i);
		}
		}

		{ int i = 0;
		while(i<10) {
			System.out.println(i);
			i += 1;
		}
		}
		{
			int i = 0;
			do {
				System.out.println(i);
				i+= 1;
			} while(i<10);
		}
		{
			int i = 10;
			int j = 20;
			System.out.println(i+++--j);
		}
		{
			String i = "..";
			switch (i) {
			case "cosa" : {//istruzioni
				System.out.println("cosa");
			}
				break;
			case "ciao" : {//istruzioni
				System.out.println("ciao");
			}
				break;
			default:
				//istruzioni che saranno eseguite se nessun case è verificato
				System.out.println("Default");
				break;
			}
		}
		
		
		
	}

}
