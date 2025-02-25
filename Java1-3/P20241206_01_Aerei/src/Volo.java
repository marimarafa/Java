public class Volo {
	private Boolean imbarco;
	private String decollo;
	private String atterraggio;
	private Aereo aereo;
	private int id ;
	private String partenza;
	private String arrivo;
	
	public Volo(Boolean imbarco, String decollo, String atterraggio, Aereo aereo, int id, String partenza,
			String arrivo) {
		super();
		this.imbarco = imbarco;
		this.decollo = decollo;
		this.atterraggio = atterraggio;
		this.aereo = aereo;
		this.id = id;
		this.partenza = partenza;
		this.arrivo = arrivo;
	}
	
	@Override
	public String toString() {
		return "Volo [imbarco=" + imbarco + ", decollo=" + decollo + ", atterraggio=" + atterraggio + ", aereo=" + getAereo()
				+ ", id=" + id + ", partenza=" + partenza + ", arrivo=" + arrivo + "]";
	}
	
	
	public void PrenotaPosto(int postiDaPrenotare) {
		if(getImbarco()) {
			System.out.println("Il volo non è più prenotabile.");
		}
		else if(aereo.getPosti() >= postiDaPrenotare) {
			aereo.setPosti(aereo.getPosti() - postiDaPrenotare);
			System.out.println("Posti prenotati con successo");	
			
		}  
		else if(aereo.getPosti() == 0) {
			setImbarco(true);
		}
		else {
			System.out.println("Numero posti non disponibili, disponibili solo " +  aereo.getPosti() + " posti.");
		}
	}
	
	public  void CancellazionePosto( int postiDacancellare) {
		aereo.setPosti(aereo.getPosti() + postiDacancellare);
		System.out.println("Posti cancellati con successo.");
	}


	
	public  Boolean getImbarco() {
		return imbarco;
	}
	public void setImbarco(Boolean imbarco) {
		this.imbarco = imbarco;
	}
	public String getDecollo() {
		return decollo;
	}
	public void setDecollo(String decollo) {
		this.decollo = decollo;
	}
	public String getAtterraggio() {
		return atterraggio;
	}
	public void setAtterraggio(String atterraggio) {
		this.atterraggio = atterraggio;
	}
	public int getAereo() {
		return aereo.getId();
	}
	public void setAereo(Aereo aereo) {
		this.aereo = aereo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPartenza() {
		return partenza;
	}
	public void setPartenza(String partenza) {
		this.partenza = partenza;
	}
	public String getArrivo() {
		return arrivo;
	}
	public void setArrivo(String arrivo) {
		this.arrivo = arrivo;
	}
	
	
	
	
	
}
