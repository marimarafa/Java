import java.util.*;

public class Studenti {
	public static void main(String[] args) {
	
		Studenti.AddStudente(1);
		Studenti.AddStudente(2);
		Studenti.AddStudente(3);
		Studenti.AddStudente(4);
		Studenti.AddStudente(5);
		Studenti.DeleteStudente(5);
		System.out.println(Studenti.CountStudent());
		Studenti.DeleteAllStudent();
		System.out.println(Studenti.CountStudent());
		
	}
	
	private static ArrayList<Integer> studenti = new ArrayList<Integer>();
	
	public static void AddStudente(int studente) {
		
		Boolean ris = true;
		
		for(int stud :studenti) {
			if(studente == stud) {
				ris = false;
			}
		}
		
		if(ris) {
			
			studenti.add(studente);
		} else {
			System.out.println("Studente gia presente");
			
		}
	}
	public static void DeleteStudente(int studente) {
		Boolean ris = false;
		Integer ind = -1;
		
		for(int stud :studenti) {
			if(studente == stud) {
				ris = true;
				ind = studenti.indexOf(stud);
			}
		}
		
		if(ris) {
			
			studenti.remove(ind);
		} else {
			System.out.println("Studente gia presente");
			
		}
		
	}
	public static void DeleteAllStudent() {
			studenti.removeAll(studenti);
		
	}
	public static int CountStudent() {
		return studenti.size();		
	}
	
	

}
