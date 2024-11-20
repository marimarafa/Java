import java.util.*;
public class Main {
	public static void main(String[] args) {
		 LinkedList<Integer> li = new LinkedList<Integer>();
		 
		 li.add(7);
		 li.add(5);
		 li.add(9);
		 li.add(2);
		 li.addFirst(11);
		 li.add(li.size(),3); // aggiungere un elemento alla fine
		 li.add(3, 99);
		 
		 
		 System.out.println(li);
		 Collections.sort(li);
		 
		 System.out.println(li);
		 System.out.println(Collections.max(li));
		 
		 Collections.shuffle(li);
		 System.out.println(li);
		 Ghepardo g1 = new Ghepardo(15,60 , 90.0);
		 Ghepardo g2 = new Ghepardo(13,66 , 80.0);
		 Ghepardo g3 = new Ghepardo(16,50 , 100.0);
		 Ghepardo g4 = new Ghepardo(14,55 , 85.0);
		 
		 //Ghepardo[] ghepardi = new Ghepardo[4];
		 LinkedList<Ghepardo> lg = new LinkedList<Ghepardo>();
		 lg.add(g1);
		 lg.add(g2);
		 lg.add(g3);
		 lg.add(g4);
		 
		 
		 // var -> Ghepardo per il for 
		 Collections.sort(lg);
		 System.out.println(lg);
		 lg.sort(new Comparator<Ghepardo>() {
			 public int compare(Ghepardo g1 , Ghepardo g2) {
				 return g1.getSpeed().compareTo(g2.getSpeed());
			 }
		 });
		 
		 LinkedList<Elefante> le = new LinkedList<Elefante>();
		 Elefante e1 = new Elefante(5,10 , 4500.0);
		 Elefante e2 = new Elefante(4,11 , 4500.0);
		 Elefante e3 = new Elefante(4,8 , 4900.0);
		 Elefante e4 = new Elefante(4,9 , 4900.0);
		 
		 le.add(e1);
		 le.add(e2);
		 le.add(e3);
		 le.add(e4);
		 
		 LinkedList<Mammifero> lm = new LinkedList<Mammifero>();
		 lm.addAll(lg);
		 lm.addAll(le);
		 System.out.println(lm);
		 
		 var it = le.iterator();
		 //Procedura merge, usiamo due liste di interi gia ordinate
		 LinkedList<Integer> l1 = new LinkedList<Integer>();
	     LinkedList<Integer> l2 = new LinkedList<Integer>();
         l1.add(3);
         l1.add(8);
         l1.add(11);
         l2.add(1);
         l2.add(2);
         l2.add(3);
         l2.add(4);
         l2.add(9);
         l2.add(12);
         l2.add(15);
		 
	}
//	//private static LinkedList<Integer> MergeLists(LinkedList<Integer> l1, LinkedList<Integer> l2) {
//        //Prima cosa: impariamo a usare gli iteratori!!!
//
//        //Usando un iteratore, stampare una lista
////        Iterator<Integer> it1 = l1.iterator();
////        while (it1.hasNext()) {
////            Integer num = it1.next();
////            System.out.println(num);
////        }
//		//1) creo la lista risultato
//        LinkedList<Integer> lret = new LinkedList<Integer>();
//
//        //2)faccio la merge delle 2 liste ordinate
//        Iterator<Integer> it1 = l1.iterator();
//        Iterator<Integer> it2 = l2.iterator();
//        
//     
//        
//        
//        
//      
//    }

}
