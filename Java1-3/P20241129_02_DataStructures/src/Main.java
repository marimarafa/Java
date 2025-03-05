import java.util.*;

public class Main {
	public static void main(String[] args) {
		// I set
		HashSet<Prova> hsp = new HashSet<Prova>();
		TreeSet<Prova> tsp = new TreeSet<Prova>();
		
		// Le mappe
		HashMap<Prova , Integer > hmp = new HashMap<Prova,Integer>();
		TreeMap<Prova, Integer> tmp = new TreeMap<Prova, Integer>();
		
		for(int i = 0; i< 100; i++) {
			hsp.add(new Prova(i));
			tsp.add(new Prova(i));
		}
		
		// Per cercare un elemento in un set , mi serve l'elemento stesso
		System.out.println(hsp.contains(new Prova(10)));
		
		Prova unaProva = new Prova(987);
		hsp.add(unaProva);
		System.out.println(hsp.contains(unaProva));
		hsp.clear();
		hsp.add(new Prova(1));
		System.out.println(hsp);
		hsp.add(new Prova(2));
		System.out.println(hsp);
		hsp.add(new Prova(3));
		System.out.println(hsp);
		hsp.add(new Prova(4));
		System.out.println(hsp);
		
		
		var it = hsp.iterator();
		while(it.hasNext() ) {
			System.out.println(it.next());
		}
		System.out.println(tsp.contains(unaProva));
		
		for(int i = 0; i< 100; i++) {
			hmp.put(new Prova(i), i);
			tmp.put(new Prova(i), i);
		}
		
		System.out.println(hmp.get(new Prova(10)));
		System.out.println(tmp.get(new Prova(10)));
		
		// la coda 
		Queue<String> qs = new LinkedList<String>();
		
		qs.add("uno");
		qs.add("due");
		qs.add("tre");
		
		var item = qs.poll(); // toglie il primo elemento della coda
		System.out.println(qs);
		
		// Stack 
		Stack<String> ss = new Stack<String>();
		ss.push("uno");
		ss.push("due");
		ss.push("tre");
		ss.push("quatro");
		
		System.out.println(ss.pop()); // toglie l'ultimo elemento del vettore
		System.out.println(ss);
		
		// Array
		Vector<String> vs = new Vector<String>();
		
	}
	
}
class Prova implements Comparable<Prova> {
	public String uno;
	public Integer due;
	public Prova(int n) {
		uno = "UNO";
		due = n;
	}
	public String toString() {
		return "" + due;
	}
	@Override
	public int compareTo(Prova o) {
		return due - o.due ;
	}
	
}
