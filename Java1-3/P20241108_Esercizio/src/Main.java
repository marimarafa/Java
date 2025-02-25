import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LinkedList<Studente> lstud = new LinkedList<Studente>();
		lstud.add(new Studente("pippo", 34, "altro", 32));
		lstud.add(new Studente("pippo", 44, "altro", 22));
		lstud.add(new Studente("paperino", 22, "altro", 11));
		lstud.add(new Studente("aaa cercasi", 22, "altra", 19));
		lstud.add(new Studente("aaa cercasi", 11, "altro", 11));
					
		System.out.println("Studenti creati finora: "+ lstud.getFirst().studentiCreati);
		
	
		Collections.sort(lstud);
		System.out.println(lstud);
		
		if (false) {	
			Studente s1 = (Studente)ParseClass.Parse(Studente.class);
			// or Persona p1 = (Persona)ParseClass.Parse(Persona.class);
			System.out.println(s1);
			
			Studente[] studenti = new Studente[4];
			Paziente[] pazienti = new Paziente[4];
			
			studenti[0]= new Studente("giovanni", 19 , "cloud", 1);
			pazienti[0] = new Paziente("marco", 215,"tutto",true);
			
			Persona[] persone = new Persona[8];
			persone[0] = studenti[0];
			persone[1] = pazienti[0];
			
			System.out.println(persone[0]);
			System.out.println(persone[1]);
			
			EssereVivente[] ev = new EssereVivente[8];
			
	//		EssereVivente p = new EssereVivente() {
	//			
	//			@Override
	//			public void SetColoreOcchi(String s) {
	//				
	//			}
	//			
	//			@Override
	//			public void GetColoreOcchi(String s) {
	//				
	//			}
	//		};
			
		}
//		System.out.println(lstud);
//		LinkedList<Integer> li = new LinkedList<Integer>();
//		li.add(10);		
//		li.add(20);
//		li.add(1);
//		Collections.sort(li); // per ordinare una lista
//		Collections.reverse(li);
//		System.out.println(li);

	}
}
