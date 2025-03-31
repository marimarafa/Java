import java.util.logging.*;

public class Calcolatrice {
	private static Logger logger = Logger.getLogger(Calcolatrice.class.getName());

	static {
		logger.setUseParentHandlers(false);
		logger.setLevel(Level.CONFIG); // Set the log level
		ConsoleHandler handler = new ConsoleHandler();
		handler.setLevel(Level.FINEST); // Set handler log level
		logger.addHandler(handler);
	}

	public static void main(String[] args) {
		
		Calcolatrice c = new Calcolatrice();
		int s = c.somma(10, 20);
		int so = c.sottrazione(300,10);
		double m =c.moltiplicazione(300,10);
		double d = c.divisione(100,10);
		
		logger.severe("This is a SEVERE error message \n" + s );
		logger.warning("This is a WARNING message \n" + so);
		logger.info("This is an INFO message \n" + m);
		logger.config("This is a CONFIG message \n"+ d);

		
		
	}
	
	public double divisione(double i, double j) {
		logger.info("Divisione eseguita");
	return i/j;
	}

	public double moltiplicazione(double i, double j) {
		logger.info("Moltiplicazione eseguita");
	return i*j;
		
	}

	public int sottrazione(int i, int j) {
		logger.info("Sottrazione eseguita");
	return i-j;
	}

	public int somma (int a, int b) {
		logger.info("Somma eseguita");
	return a+b;
	}
	
		
	}

