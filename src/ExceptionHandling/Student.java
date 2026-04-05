package ExceptionHandling;

public class Student {
	
	//Ecomm
	public static void t1() {
		System.out.println("t1 method");
		t2();
	}
	
	public static void t2() {
		System.out.println("t2 method");
		try {
		t3();
		
		}
		catch(ArithmeticException ae) {
			System.out.println("AE__Exception");
			ae.printStackTrace();
			
		}
	}
	
	//Bank
	public static void t3() throws ArithmeticException {
		System.out.println("t3 method");
		
		int i=9/0;
	}

	//user /caller 
	public static void main(String[] args) {
		t1();
		System.out.println("BYE");

	}

}
