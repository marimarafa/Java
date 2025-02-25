
public class Main {
	public static void main(String[] args) {
		
		int []vint  = new int[100];
		double [] vdou = new double[100];
		System.out.println(vint);
		// stampa nome della classe + il codice ascii dell'oggetto
		for(int i= 0; i< 100;i++) {
			vint[i] = i += 1;
		}
		
		for(int i= 100; i> 0;i--) {
			vint[100-i] = i;
			//System.out.println(i);
		}
		StampaVint(vint);
		
		//per inserire dei numeri pari
		for(int i = 0; i >= 100 ; i ++) {
			vint[i]=(i+2) *2;
		}
		
		//per inserire dei numeri dispari
		for(int i = 0; i >= 100 ; i ++) {
			vint[i]=(i+2) *2 -1 ;
		}
		
		// per inserire in vdou la serie armonica
		for(int i = 1; i<100 ;i++ ) {
			vdou[i-1] = 1.0/i;
		}
		
		// per inserire in vint la seria numerica:1,1,2,3,5,8,13,...
		vint[0] = 1;
		vint[1] = 1;
		for(int i = 2; i<100 ;i++ ) {
			vint[i] = vint[i-1]+ vint[i-2];
		}
		StampaVint(vint);
		
		//per inserire in vint i numeri primi in sequenza :2,3,5,7,11,13,17,..
		//Crivelli di Eratostene
		//Implementare il crivello di eratostone e stampare i primi 10000 numeri primi
		
		//Eratostone(10000);
		
		//per stampare un fattoriale di un numero n
		System.out.println(Fattoriale(15));
		System.out.println(Fact(15));
		
		// inserire la serie geometrica: 1/2^0,1/2^1,..
		for(int i = 0;i<100;i++) {
			vdou[i] = 1.0/Math.pow(2, i);
		}
		StampaVdou(vdou);
		
	}
			
	
	private static void StampaVdou(double [] vdou) {
		for(double v:vdou){
			System.out.println(v + " ");
		}
		
	}

	private static int  Fattoriale(int N) {
		int p= 1;
		for(int i= 2 ;i<=N ;i++) {
			p *= i;
		}
		return p;
	}
	
	public static int Fact(int N) {
		if(N == 0) {
			return 1;	
		} else {
			return N* Fact(N -1);
		}
	}


	private static void Eratostone(int N) {
		boolean [] v = new boolean[1000000000];
		int numeriprimi=0;
		for(int i = 2; i < v.length; i++) {
			v[i]= true;
		}
		//ciclo per determinare i primi
		for(int i = 2;i<v.length;i++) {
			if(v[i] == true) {
				System.out.println(i +"e il "+ ++numeriprimi + "-esimo numero primo");
				
				for (int k = i+i ; k<v.length;k+=i) {
					v[k]= false;
				}
			}
		}
		
		
	}











	private static void StampaVint(int[] vint) {
		for(int v:vint) {
			System.out.print(v + " ");
		}
		System.out.println();
		
		
	}
}
