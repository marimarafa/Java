import java.util.*;

public class Main {
    public static void main(String[] args) {
        CompagniaAerea compagnia = new CompagniaAerea();
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("\n\tMENU GENERALE \n1) Menu per agenzia \n2) Menu per aeroporto \n3) Menu per compagnia aerea \n4) Esci");
            int op = scan.nextInt();
            
            switch(op) {
                case 1:
                    // MENU AGENZIA
                    System.out.println("\n\tMENU AGENZIA \n1) Prenotazione Volo \n2) Cancella Prenotazione \n3) Torna al menu principale");
                    int op2 = scan.nextInt();
                    
                    switch(op2) {
                        case 1:
                            // Prenotazione Volo
                            System.out.print("Inserisci l'ID del volo da prenotare: ");
                            int idVolo = scan.nextInt();
                            System.out.print("Quanti posti vuoi prenotare? ");
                            int posti = scan.nextInt();
                            compagnia.PrenotaVolo(posti, idVolo);
                            break; 

                        case 2:
                            // Cancella Prenotazione
                            System.out.print("Inserisci l'ID del volo da cancellare: ");
                            int idVolo1 = scan.nextInt();
                            System.out.print("Quanti posti vuoi cancellare? ");
                            int posti1 = scan.nextInt();
                            compagnia.CancellaVolo(posti1, idVolo1);
                            break; 
                            
                        case 3:
                            break; 
                    }
                    break;

                case 2:
                    // MENU AEROPORTO
                    System.out.println("\tMENU AEROPORTO \n1) Orari decollo e atterraggio \n2) Torna al menu principale");
                    int op3 = scan.nextInt();
                    switch(op3) {
                        case 1:
                            // Orari decollo e atterraggio
                            System.out.print("Inserisci l'ID del volo per gli orari: ");
                            int idVoloOrario = scan.nextInt();
                            compagnia.OrariDecolloAtterraggio(idVoloOrario);
                            break; 

                        case 2:
                            break; 
                    }
                    break;

                case 3:
                    // MENU COMPAGNIA AEREA
                    System.out.println("\tMENU COMPAGNIA AEREA \n1) Aggiungi Aereo \n2) Elimina Aereo \n3) Aggiungi Volo \n4) Visualizza Voli \n5) Visualizza Aerei \n6) Torna al menu principale");
                    int op4 = scan.nextInt();
                    switch(op4) {
                        case 1:
                            // Aggiungi Aereo
                            Aereo aereo = new Aereo();
                            System.out.print("Inserisci ID Aereo: ");
                            aereo.setId(scan.nextInt());
                            System.out.print("Inserisci numero totale di posti: ");
                            aereo.setPosti_tot(scan.nextInt());
                            System.out.print("Inserisci posti disponibili: ");
                            aereo.setPosti(scan.nextInt());
                            compagnia.CreaAereo(aereo);
                            break; 

                        case 2:
                            // Elimina Aereo
                            System.out.print("Inserisci ID dell'Aereo da eliminare: ");
                            int idAereo = scan.nextInt();
                            compagnia.EliminaAereo(idAereo);
                            break; 

                        case 3:
                            // Aggiungi Volo
                            System.out.print("Inserisci ID del volo: ");
                            int idVolo = scan.nextInt();
                            System.out.print("Inserisci l'orario di decollo (hh:mm): ");
                            String decollo = scan.next();
                            System.out.print("Inserisci l'orario di atterraggio (hh:mm): ");
                            String atterraggio = scan.next();
                            System.out.print("Inserisci la città di partenza: ");
                            String partenza = scan.next();
                            System.out.print("Inserisci la città di arrivo: ");
                            String arrivo = scan.next();
                            System.out.print("Inserisci l'ID dell'Aereo: ");
                            int idaereo = scan.nextInt();
                            Volo v = new Volo(false, decollo, atterraggio, idVolo, aereo.getId(), partenza, arrivo);
                            compagnia.AggiungiVolo(v);
                            break; 

                        case 4:
                            // Visualizza Voli
                            System.out.println("\nVoli Disponibili:");
                            for(Volo volo : compagnia.getVoli()) {
                                System.out.println(volo);
                            }
                            break; 

                        case 5:
                            // Visualizza Aerei
                            System.out.println("\nAerei Disponibili:");
                            for(Aereo aereoo : compagnia.getAerei()) {
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
            }
        }
    }
}
