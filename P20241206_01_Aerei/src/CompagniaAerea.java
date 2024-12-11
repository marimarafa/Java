import java.util.*;

public class CompagniaAerea {
	private String nome ;
	private LinkedList<Volo> voli = new  LinkedList<Volo>();
	private LinkedList<Aereo> aerei = new  LinkedList<Aereo>();
	
	Scanner scan = new Scanner(System.in);
	
	public CompagniaAerea(String nome) {
		super();
		this.nome = nome;
	}

	public void CreaAereo() {
		Aereo aereo = new Aereo();
		System.out.print("Inserisci ID Aereo: ");
		aereo.setId(scan.nextInt());
		System.out.print("Inserisci numero totale di posti: ");
		aereo.setPosti_tot(scan.nextInt());
		System.out.print("Inserisci posti disponibili: ");
		aereo.setPosti(scan.nextInt());
	    boolean id_trovato = false; 
	    for (Aereo a : aerei) {
	        if (aereo.getId() == a.getId()) { 
	            id_trovato = true;
	            break;
	            
	        }
	    }

	    if (!id_trovato) {
	        aerei.add(aereo); 
	        System.out.println("Aereo aggiunto con successo.");
	    } else {
	        System.out.println("Aereo già esistente.");
	    }
	}

	public void EliminaAereo() {
		System.out.print("Inserisci ID dell'Aereo da eliminare: ");
		int id = scan.nextInt();
	    boolean id_trovato = false; 
	    for(Aereo aereo: aerei) {
	        if(aereo.getId() == id) {
	            aerei.remove(aereo);    
	            id_trovato = true; 
	            break; 
	        }
	    }
	    
	    if(id_trovato) {
	        System.out.println("Aereo cancellato con successo.");
	    } else {
	        System.out.println("Aereo non disponibile.");
	    }
	}
	public  void PrenotaVolo() {
		System.out.print("Inserisci l'ID del volo da prenotare: ");
		int id = scan.nextInt();
		System.out.print("Quanti posti vuoi prenotare? ");
		int postiDaPrenotare = scan.nextInt();
		
		boolean id_trovato = false;
		for(Volo volo:voli) {
			if(volo.getId() == id) {
				id_trovato = true;
				volo.PrenotaPosto(postiDaPrenotare);
				break;
			}
		}
		if(id_trovato) {
			System.out.println("Volo trovato.");
				
		}else{
				System.out.println("Volo non disponibile.");
		}
			
	}
	public void CancellaVolo() {
		System.out.print("Inserisci l'ID del volo da cancellare: ");
		int id = scan.nextInt();
		System.out.print("Quanti posti vuoi cancellare? ");
		int postiDaCancellare = scan.nextInt();
		boolean id_trovato = false;
		for(Volo volo:voli) {
			if(volo.getId() == id) {
				id_trovato = true;
				volo.CancellazionePosto(postiDaCancellare);
				break;
			}
		}
		if(id_trovato) {
			System.out.println("Volo trovato.");
				
		}else{
				System.out.println("Volo non disponibile.");
		}
			
	}
	public void OrariDecolloAtterraggio() {
		System.out.print("Inserisci l'ID del volo per gli orari: ");
		int id = scan.nextInt();
		boolean id_trovato = false;
		for(Volo volo:voli) {
			if(volo.getId() == id) {
				id_trovato = true;
				System.out.println("Orario decollo :" + volo.getDecollo() + "\nOrario atterraggio :" + volo.getAtterraggio() );
				break;
			}
		}
		if(id_trovato) {
			System.out.println("Volo trovato.");
				
		}else{
				System.out.println("Volo non disponibile.");
		}
			
	}	
	public void AggiungiVolo() {
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
		
		Aereo aereoTrovato = null;
        for (Aereo a : aerei) {
            if (a.getId() == idaereo) {
                aereoTrovato = a;
                break;
            }
        }
       
        if (aereoTrovato != null) {
            Volo v = new Volo(false, decollo, atterraggio, aereoTrovato, idVolo, partenza, arrivo);
           voli.add(v);
            System.out.println("Volo aggiunto con successo");
        } else {
            System.out.println("Aereo con ID " + idaereo + " non trovato.");
        }

	}
	public  String getNome() {
		return nome;
	}
	public  void setNome(String nome) {
		this.nome = nome;
	}
	public  LinkedList<Volo> getVoli() {
		return voli;
	}
	public  void setVoli(LinkedList<Volo> voli) {
		this.voli = voli;
	}
	public LinkedList<Aereo> getAerei() {
		return aerei;
	}
	public void setAerei(LinkedList<Aereo> aerei) {
		this.aerei = aerei;
	}
}

