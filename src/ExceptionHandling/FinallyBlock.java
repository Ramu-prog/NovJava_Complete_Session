package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		
		System.out.println("A");

		try {
		int i =9/0  ;
		}
		
		catch(ArithmeticException AE) {
			System.out.println("Ae is coming..");
			AE.printStackTrace();
		}
		System.out.println("Im a finally block");
		
	}

}
