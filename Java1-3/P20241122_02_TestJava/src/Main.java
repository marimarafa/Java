import java.util.*;

public class Main {
	public static void main(String[] args) {

		HashMap<Integer, Long> hm = new HashMap<>();
		System.out.println(Fib(50, hm));		
	}

	static public Long Fib(int n, HashMap<Integer, Long> hm) {
		if (n < 2) {
			return 1L;
		}
		//se in hm c'ì indice n ,allora torno il valore
		Long n2, n1;
		if (hm.containsKey(n-1)) {
			n1 = hm.get(n-1);	
		} else {
			n1 = Fib(n-1, hm);
			hm.put(n-1, n1);
		} 
		if (hm.containsKey(n-2)) {
			n2 = hm.get(n-2);	
		} else {
			n2 = Fib(n-2, hm);
			hm.put(n-2, n2);
		} 
		return n1 + n2;
		
	}

}
