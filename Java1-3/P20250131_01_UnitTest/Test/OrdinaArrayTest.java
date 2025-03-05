import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class OrdinaArrayTest {

	@Test
	void testOrdina() {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(3);
		l1.add(1);
		l1.add(2);
		
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l2.add(1);
		l2.add(2);
		l2.add(3);

		assertEquals(l2, OrdinaArray.Ordina(l1));
	}

}
