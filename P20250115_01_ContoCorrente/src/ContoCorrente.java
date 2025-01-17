import java.io.*;

public class ContoCorrente {
	private double saldo;

	public synchronized void prelievo(double somma) throws Exception {
		Thread.sleep(3000);

		BufferedWriter bw = null;
		FileWriter fw = null;

		try {
			double nuovoSaldo = getSaldo() - somma;

			if (nuovoSaldo > 0) {
				fw = new FileWriter(new File(".").getCanonicalPath() + File.separator + "db.txt");
				bw = new BufferedWriter(fw);
				bw.write(nuovoSaldo + "");
			} else
				throw new Exception("Saldo insufficiente!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}
	}

	public void prelievoNonSync(double somma) throws Exception {
		Thread.sleep(3000);

		BufferedWriter bw = null;
		FileWriter fw = null;

		try {
			double nuovoSaldo = getSaldo() - somma;

			if (nuovoSaldo > 0) {
				fw = new FileWriter(new File(".").getCanonicalPath() + File.separator + "db2.txt");
				bw = new BufferedWriter(fw);
				bw.write(nuovoSaldo + "");
			} else
				throw new Exception("Saldo insufficiente!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}

	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public ContoCorrente(double saldo) {
		super();
		this.saldo = saldo;
	}

	public ContoCorrente() {
		super();
	}

}
