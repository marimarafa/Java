import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("A quale piano devo andare: 0 , 1 , 2 , 3 ?");
			int piano = scan.nextInt();
			Macchina(piano);
		}
	}
	
	static int [][][] fsm = {
			{{0,0},{1,1},{2,2},{3,3}},
			{{-1,0},{0,1},{1,2},{2,3}},
			{{-2,0},{-1,1},{0,2},{1,3}},
			{{-3,0},{-2,1},{-1,2},{0,3}}
			};
	static int stato = 0;		
	
	// La macchina deve muovere al piano indicato come parametro
	private static void Macchina(int piano) {
		int piano_;
		try {
			System.out.printf("Sono al piano %d e devo andare al piano %d: %s\n" , piano ,fsm[piano][stato][1],fsm[piano][stato][0]);
			stato += fsm[stato][piano][1];
		} catch (Exception  e) {
			System.out.println("\nNumero piano non esiste , Riprova");
		}
	}
}