import java.util.*;

public class CompagniaAerea {
	private String nome ;
	private LinkedList<Volo> voli = new  LinkedList<Volo>();
	private LinkedList<Aereo> aerei = new  LinkedList<Aereo>();
	
	public void CreaAereo(Aereo a) {
		aerei.add(a);
		System.out.println("Aereo aggiunto con successo.");
	}
	public void EliminaAereo(int id) {
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
	public  void PrenotaVolo(int postiDaPrenotare,int id) {
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
	public void CancellaVolo(int postiDaCancellare, int id) {
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
	public void OrariDecolloAtterraggio(int id) {
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

