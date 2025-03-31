import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StudentiTest {

	@Test
	void testAddStudente() {
		Studenti.AddStudente(1);
		Studenti.AddStudente(2);
		assertEquals(2,Studenti.CountStudent());
		
	}

	@Test
	void testDeleteStudente() {
		Studenti.AddStudente(1);
		Studenti.AddStudente(2);
		Studenti.DeleteStudente(2);
		assertEquals(1, Studenti.CountStudent());
		
	}

	@Test
	void testDeleteAllStudent() {
		Studenti.AddStudente(1);
		Studenti.AddStudente(2);
		Studenti.DeleteAllStudent();
		assertEquals(0,Studenti.CountStudent());
		
	}

}
