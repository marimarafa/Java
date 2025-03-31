import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringheTest {

	@Test
	void testParolaPalindroma() {
		assertEquals(true, Stringhe.ParolaPalindroma("anna"));
		assertTrue(Stringhe.ParolaPalindroma("ama"));
		assertFalse(Stringhe.ParolaPalindroma("ciaooo"));
	}

	@Test
	void testContaCarattere() {
		assertEquals(2, Stringhe.ContaCarattere("aaannaaa" , 'n'));
		assertNotEquals(3,Stringhe.ContaCarattere("ciaooo", 'c'));
	}

}
