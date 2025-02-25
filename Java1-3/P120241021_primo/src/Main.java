
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer com1 = new Computer();
		com1.setAltezza(1.5);
		com1.setAnnoDiProduzione(2023);
		com1.setLarghezza(35.0);
		com1.setPeso(4.5);
		com1.setPrezzo(4500.0);
		com1.setProduttore("archer");
		com1.setProfondità(25.0);
		System.out.println(com1);
		
		Computer com2 = new Computer(987., 34.0, 242., 23., 124.3, "archer", 1990);
		Computer com3 = new Computer(987., 34.0);
		System.out.println(Computer.GetContatore());
	}
}
