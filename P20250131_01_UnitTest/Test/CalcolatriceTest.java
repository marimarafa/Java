import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalcolatriceTest {

	@Test
	void testSomma() {
		assertEquals(2, Calcolatrice.Somma(1, 1) );
	}
	
	@Test
	void testSottrazione() {
		assertEquals(2, Calcolatrice.Sottrazione(4,2) );
	}
	
	@Test
	void testMultiplicazione() {
		assertEquals(8, Calcolatrice.Multiplicazione(4,2) );
	}
	
	@Test
	void testDivisione() {
		assertEquals(2, Calcolatrice.Divisione(4,2) );
	}

}
