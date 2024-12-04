import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rng = new Random();
		for(int i = 0; i < 20 ; i++) {
			Integer num = Dividi(rng.nextInt(10),rng.nextInt(10));
			//System.out.println(num);
		}	
	}

	private static Integer Dividi(int i, int j) {
		try {
			Integer q = i /  j;
			System.out.print("OK ");
			return q;
		} catch (Exception ex){
			//ex.printStackTrace();
			System.out.print("NOT_OK ");
			
		} finally {
			// viene eseguito sempre
			System.out.println("fine");
		}
		// viene eseguito solo se entra nel catch
		System.out.println("ah");
		return null;
	}
}