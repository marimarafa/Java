public abstract class Mammifero {
	private Integer freqResp;
	private Integer freqcardio;
	public abstract String Verso();
	
	public Mammifero() {
		super();
	}

	public Mammifero(Integer freqResp, Integer freqcardio) {
		super();
		this.freqResp = freqResp;
		this.freqcardio = freqcardio;
	}

	public Integer getFreqResp() {
		return freqResp;
	}

	public void setFreqResp(Integer freqResp) {
		this.freqResp = freqResp;
	}

	public Integer getFreqcardio() {
		return freqcardio;
	}

	public void setFreqcardio(Integer freqcardio) {
		this.freqcardio = freqcardio;
	}

	@Override
	public String toString() {
		return "Mammifero [freqResp=" + freqResp + ", freqcardio=" + freqcardio + "]";
	}
	
	
}
