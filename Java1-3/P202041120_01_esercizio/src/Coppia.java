
public class Coppia <T,T2> {
	private T primo ;
	private T2 secondo;
	
	
	public Coppia() {
		super();
	}
	public Coppia(T primo, T2 secondo) {
		super();
		this.primo = primo;
		this.secondo = secondo;
	}
	public T getPrimo() {
		return primo;
	}
	public void setPrimo(T primo) {
		this.primo = primo;
	}
	public T2 getSecondo() {
		return secondo;
	}
	public void setSecondo(T2 secondo) {
		this.secondo = secondo;
	}
	@Override
	public String toString() {
		return "Coppia [primo=" + primo + ", secondo=" + secondo + "]";
	}
	


}
