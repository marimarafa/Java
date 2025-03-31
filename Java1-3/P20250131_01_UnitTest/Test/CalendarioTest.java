import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalendarioTest {

	@Test
	void testSetCalendario() {
		assertEquals("Giovedì", Calendario.SetCalendario(6, 2, 2025));
		
	}

}
