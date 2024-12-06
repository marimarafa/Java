import java.util.*;

public class Main {
    public static void main(String[] args) {
        CompagniaAerea compagnia = new CompagniaAerea();
        Scanner scan = new Scanner(System.in);
        
        // Creazione di alcuni aerei e voli per il test
        Aereo aereo1 = new Aereo();
        aereo1.setId(1);
        aereo1.setPosti_tot(200);
        aereo1.setPosti(150);
        compagnia.CreaAereo(aereo1);
        
        Aereo aereo2 = new Aereo();
        aereo2.setId(2);
        aereo2.setPosti_tot(100);
        aereo2.setPosti(100);
        compagnia.CreaAereo(aereo2);

        Volo volo1 = new Volo(false, "08:00", "10:00", aereo1, 101, "Roma", "Milano");
        Volo volo2 = new Volo(false, "09:00", "11:00", aereo2, 102, "Milano", "Napoli");
        compagnia.getVoli().add(volo1);
        compagnia.getVoli().add(volo2);
        
        while(true) {
            System.out.println("\n\tMENU GENERALE");
            System.out.println("1) Menu per agenzia");
            System.out.println("2) Menu per aeroporto");
            System.out.println("3) Menu per compagnia aerea");
            System.out.println("4) Esci");
            int op = scan.nextInt();
            
            if(op == 1){
                // MENU AGENZIA
                System.out.println("\tMENU AGENZIA");
                System.out.println("1) Prenotazione Volo");
                System.out.println("2) Cancella Prenotazione");
                System.out.println("0) Torna al menu principale");
                int op2 = scan.nextInt();
                if(op2 == 1) {
                    // Prenotazione Volo
                    System.out.print("Inserisci l'ID del volo da prenotare: ");
                    int idVolo = scan.nextInt();
                    System.out.print("Quanti posti vuoi prenotare? ");
                    int posti = scan.nextInt();
                    compagnia.PrenotaVolo(posti, idVolo);
                } else if(op2 == 2) {
                    // Cancella Prenotazione
                    System.out.print("Inserisci l'ID del volo da cancellare: ");
                    int idVolo = scan.nextInt();
                    System.out.print("Quanti posti vuoi cancellare? ");
                    int posti = scan.nextInt();
                    compagnia.CancellaVolo(posti, idVolo);
                } else if(op2 == 0) {
                    continue;
                }
            }
            else if(op == 2) {
                // MENU AEROPORTO
                System.out.println("\tMENU AEROPORTO");
                System.out.println("1) Orari decollo e atterraggio");
                System.out.println("0) Torna al menu principale");
                int op2 = scan.nextInt();
                if(op2 == 1) {
                    // Orari decollo e atterraggio
                    System.out.print("Inserisci l'ID del volo per gli orari: ");
                    int idVolo = scan.nextInt();
                    compagnia.OrariDecolloAtterraggio(idVolo);
                } else if(op2 == 0) {
                    continue;
                }
            }
            else if(op == 3) {
                // MENU COMPAGNIA AEREA
                System.out.println("\tMENU COMPAGNIA AEREA");
                System.out.println("1) Aggiungi Aereo");
                System.out.println("2) Elimina Aereo");
                System.out.println("3) Aggiungi Volo");
                System.out.println("4) Visualizza Voli");
                System.out.println("0) Torna al menu principale");
                int op2 = scan.nextInt();
                if(op2 == 1) {
                    // Aggiungi Aereo
                    Aereo aereo = new Aereo();
                    System.out.print("Inserisci ID Aereo: ");
                    aereo.setId(scan.nextInt());
                    System.out.print("Inserisci numero totale di posti: ");
                    aereo.setPosti_tot(scan.nextInt());
                    System.out.print("Inserisci posti disponibili: ");
                    aereo.setPosti(scan.nextInt());
                    compagnia.CreaAereo(aereo);
                } else if(op2 == 2) {
                    // Elimina Aereo
                    System.out.print("Inserisci ID dell'Aereo da eliminare: ");
                    int idAereo = scan.nextInt();
                    compagnia.EliminaAereo(idAereo);
                } else if(op2 == 3) {
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
                    int idAereo = scan.nextInt();
                    Aereo aereo = null;
                    for(Aereo a : compagnia.getAerei()) {
                        if(a.getId() == idAereo) {
                            aereo = a;
                            break;
                        }
                    }
                    if(aereo != null) {
                        Volo volo = new Volo(false, decollo, atterraggio, aereo, idVolo, partenza, arrivo);
                        compagnia.getVoli().add(volo);
                        System.out.println("Volo aggiunto con successo.");
                    } else {
                        System.out.println("Aereo non trovato.");
                    }
                } else if(op2 == 4) {
                    // Visualizza Voli
                    System.out.println("\nVoli Disponibili:");
                    for(Volo volo : compagnia.getVoli()) {
                        System.out.println(volo);
                    }
                } else if(op2 == 0) {
                    continue;
                }
            }
            else if(op == 4) {
                System.out.println("Uscita dal programma.");
                break;
            }
        }
        scan.close();
    }
}
