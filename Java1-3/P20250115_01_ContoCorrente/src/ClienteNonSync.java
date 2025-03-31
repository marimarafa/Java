public class ClienteNonSync extends Thread {
	private String nome;
	private double somma;
	ContoCorrente conto = new ContoCorrente(100);
	
	 public void run() {
	        System.out.println(nome + " sta verificando il saldo: " + conto.getSaldo());
	        try {
				conto.prelievoNonSync(somma);
			} catch (Exception e) {
				e.printStackTrace();
			}
	    }


	public ClienteNonSync(String nome, double somma) {
		super();
		this.nome = nome;
		this.somma = somma;
	}

}
