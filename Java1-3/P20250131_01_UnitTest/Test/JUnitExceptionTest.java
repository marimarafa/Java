import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitExceptionTest {
	
	@Test
	void testTestException() {

		JUnitException ex = new JUnitException();
		Exception exception = assertThrows(Exception.class, () -> ex.testException());
		assertEquals("Eccezione JUnit", exception.getMessage());

	}

}
