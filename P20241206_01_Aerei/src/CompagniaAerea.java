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
		try {
			for(Volo volo:voli) {
				if(volo.getId() == id) {
					aerei.remove(volo.getId());
					System.out.println("Aereo eliminato con successo.");
				}
			}
		} catch(Exception e) {
			System.out.println("Aereo non disponibile.");
		}
	}
	public  void PrenotaVolo(int postiDaPrenotare,int id) {
		try {
			for(Volo volo:voli) {
				if(volo.getId() == id) {
					volo.PrenotaPosto(postiDaPrenotare);
				}
			}	
		}catch(Exception e) {
				System.out.println("Volo non disponibile.");
			}
		}
	public void CancellaVolo(int postiDaCancellare, int id) {
		try {
			for(Volo volo:voli) {
				if(volo.getId() == id) {
					volo.CancellazionePosto(postiDaCancellare);
				}
			}
			
		}catch(Exception e) {
			System.out.println("Volo non disponibile");
		}
		
	}	
	public void OrariDecolloAtterraggio(int id) {
		try {
			for(Volo volo:voli) {
				if(volo.getId() == id) {
					System.out.println("Orario decollo :" + volo.getDecollo() + "\nOrario atterraggio :" + volo.getAtterraggio() );
				}
			}
		} catch(Exception e){
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

