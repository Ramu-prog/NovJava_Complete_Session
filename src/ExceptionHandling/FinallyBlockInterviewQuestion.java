package ExceptionHandling;

public class FinallyBlockInterviewQuestion {

	public static int getMarks(String name) {
		System.out.println("getting the marks"+name);
		
		if(name.equals("Tom")) {
			System.out.println("getting the final marks");
		
			try {
			int i = 9/0;
			return 100;
		
			}
			catch(ArithmeticException AE) {
				System.out.println("AE is coming...");
				return 80;
			}
			finally {
				System.out.println("finally block");
				return 70;
			}
		}
		else if(name.equals("peter")) {
			return 90;
		}
		else {
			System.out.println("Invalid student");
			return-1;
		}
	}
	public static void main(String[] args) {
		
        int m1 = getMarks("peter");
        System.out.println(m1);
         

	}

}
