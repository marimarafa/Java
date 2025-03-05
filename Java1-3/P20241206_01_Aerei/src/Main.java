import java.io.IOException;
import java.util.*;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
	public static void main(String[] args) throws IOException {

		CompagniaAerea compagnia = new CompagniaAerea("WizzAir");
		

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println(
					"\n\tMENU GENERALE \n1) Menu per agenzia \n2) Menu per aeroporto \n3) Menu per compagnia aerea \n4) Esci");
			int op = scan.nextInt();

			switch (op) {
			case 1:
				// MENU AGENZIA
				System.out.println(
						"\n\tMENU AGENZIA \n1) Prenotazione Volo \n2) Cancella Prenotazione \n3) Torna al menu principale");
				int op2 = scan.nextInt();

				switch (op2) {
				case 1:
					// Prenotazione Volo
					compagnia.PrenotaVolo();
					break;

				case 2:
					// Cancella Prenotazione
					compagnia.CancellaVolo();
					break;

				case 3:
					break;
				}
				break;

			case 2:
				// MENU AEROPORTO
				System.out.println("\tMENU AEROPORTO \n1) Orari decollo e atterraggio \n2) Torna al menu principale");
				int op3 = scan.nextInt();
				switch (op3) {
				case 1:
					// Orari decollo e atterraggio
					compagnia.OrariDecolloAtterraggio();
					break;

				case 2:
					break;
				}
				break;

			case 3:
				// MENU COMPAGNIA AEREA
				System.out.println(
						"\tMENU COMPAGNIA AEREA \n1) Aggiungi Aereo \n2) Elimina Aereo \n3) Aggiungi Volo \n4) Visualizza Voli \n5) Visualizza Aerei \n6) Torna al menu principale");
				int op4 = scan.nextInt();
				switch (op4) {
				case 1:
					// Aggiungi Aereo
					compagnia.CreaAereo();
					break;

				case 2:
					// Elimina Aereo
					compagnia.EliminaAereo();
					break;

				case 3:
					// Aggiungi Volo
					compagnia.AggiungiVolo();
					break;

				case 4:
					// Visualizza Voli
					System.out.println("\nVoli Disponibili:");
					for (Volo volo : compagnia.getVoli()) {
						System.out.println(volo);
					}
					break;

				case 5:
					// Visualizza Aerei
					System.out.println("\nAerei Disponibili:");
					for (Aereo aereoo : compagnia.getAerei()) {
						System.out.println(aereoo);
					}
					break;

				case 6:
					break;
				}
				break;

			case 4:
				System.out.println("Uscita dal programma.");
				scan.close();
				return;

			}
			ObjectMapper objectMapper = new ObjectMapper();
			
			var fou = Util.OpenFileForWriting("aerei.txt");
			String c = objectMapper.writeValueAsString(compagnia.getNome());
			fou.write("La compagnia aerea:\n" + c + "\nCon i seguenti aerei");
			for (var x : compagnia.getAerei()) {
				String a = objectMapper.writeValueAsString(x);
				fou.write("\n" + a);
			}
			for (var i : compagnia.getVoli()) {
				String v = objectMapper.writeValueAsString(i);
				fou.write("\n E i seguenti voli: \n" + v);
			}
			fou.close();

		}
		
	}
}
