public class Ghepardo extends Mammifero implements Must,Req,Comparable<Ghepardo>{

	public Ghepardo(Integer freqResp, Integer freqcardio, double speed) {
		super(freqResp, freqcardio);
		this.speed = speed;
	}
	
	public Ghepardo() {
		super();
	}

	@Override
	public String Verso() {
		return "Roarr";
	}
	private Double speed;
	
	@Override
	public String toString() {
		return "\nGhepardo [speed=" + speed + ", toString()=" + super.toString() + "]";
	}
	
	public Double getSpeed() {
		return speed;
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	public String GetClassName() {
		return "Ghepardo";
	}

	@Override
	public String GetVersion() {
		return "1.0";
	}

	@Override
	public String GetSerial() {
		return "AI48";
	}

	@Override
	public int compareTo(Ghepardo o) {
		Integer ret = speed.compareTo(o.speed);
		if(ret != 0) {
			return ret;
		} else {
			return getFreqcardio().compareTo(o.getFreqcardio());
		}
		
	}

}
