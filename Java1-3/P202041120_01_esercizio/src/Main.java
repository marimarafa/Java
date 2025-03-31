import java.util.*;

public class Main {

	public static void main(String[] args) {
		Coppia<Integer,Double> c1 = new Coppia(1,2.0);	
		Coppia<Integer,Double> c2 = new Coppia(111,112.0);	
		
		SwapCoppia(c1,c2);
//		System.out.println(c1);
//		System.out.println(c2);
		
		Coppia<String,String> cs1 = new Coppia("ciao","aabb");	
		Coppia<String,String> cs2 = new Coppia("buongiorno","xsxs");
		
		SwapCoppia(cs1,cs2);
//		System.out.println(cs1);
//		System.out.println(cs2);
		
		LinkedList<Integer> li = new LinkedList<Integer>();
        li.addAll(Arrays.asList(new Integer[]{3,4,6,2,3,7,8}));
        //Scambiare con un metodo i valori dal posto 3 al posto 5 della lista
        System.out.println(li);
        Swap(li,3,5);
        System.out.println(li);
		
		
	}

	private static void Swap(LinkedList<Integer> li, int i, int j) {
		Integer appo=li.get(i);
		li.set(i, li.get(j));
		li.set(j, appo);
		
	}

//	private static void SwapCoppia(Coppia<Integer, Double> c1, Coppia<Integer, Double> c2) {
//		Coppia<Integer,Double> appo = new Coppia(c1.getPrimo(),c1.getSecondo());
//		
//		c1.setPrimo(c2.getPrimo());
//		c1.setSecondo(c2.getSecondo());
//		
//		c2.setPrimo(appo.getPrimo());
//		c2.setSecondo(appo.getSecondo());
//		
//	}
	
	private static <T1,T2>void SwapCoppia(Coppia<T1, T2> c1, Coppia<T1, T2> c2) {
		Coppia<T1,T2> appo = new Coppia(c1.getPrimo(),c1.getSecondo());
		
		c1.setPrimo(c2.getPrimo());
		c1.setSecondo(c2.getSecondo());
		
		c2.setPrimo(appo.getPrimo());
		c2.setSecondo(appo.getSecondo());
		
	}
	
	
	}


