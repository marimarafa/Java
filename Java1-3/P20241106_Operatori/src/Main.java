import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Studente[] studenti = new Studente[10];
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		while (true) {
		    System.out.println("\tScegli operazione da fare:");
		    System.out.println("1) Aggiungi uno studente");
		    System.out.println("2) Stampa lista studenti");
		    System.out.println("3) Esci");
		    int num = scanner.nextInt();
		    
		    switch (num) {
		        case 1 :{
		            if (count >= studenti.length){
		                System.out.println("Spazio esaurito..");
		            } 
		            else{
		                System.out.print("Inserisci nome: ");
                        String nome = scanner.next();
                        System.out.print("Inserisci eta: ");
                        int eta = scanner.nextInt();
                        System.out.print("Inserisci corso: ");
                        String corso = scanner.next();
                        System.out.print("Inserisci anni di frequenza: ");
                        int anniDiFrequenza = scanner.nextInt();
                        studenti[count] = new Studente(nome,eta, corso, anniDiFrequenza);
                        count += 1;
                    } 
                    break;
		        }
		        case 2: {
		            for (int i = 1 ; i <=count; i++){
		                System.out.println("Studente numero "+ i +":\n"+ studenti[i-1]);
		            }
		            break;
		        }
		        case 3: {
		            System.exit(0);
		        }
		        default:{
		             System.out.println("Opzione non valida.");
		        }
                   
		    }
		    
		}
	}
}