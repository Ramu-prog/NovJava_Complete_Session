package ExceptionHandling;

public class Employee {
	String name;
	public static void testing() {
		System.out.println("yeh");
		System.out.println("exception");
		System.out.println("handling");
		
		try {
		int i=9/0;
		System.out.println("hello");
		
		Employee obj = new Employee();
		obj=null;
		System.out.println(obj.name);//NPE
		}
		
		catch(NullPointerException ne){
			System.out.println("NE is coming...");
			ne.printStackTrace();
		}
		
		catch(ArithmeticException e){
		System.out.println("AE is coming...");
		e.printStackTrace();
		
	    }
		
		catch(RuntimeException rn){
			System.out.println("AE is coming...");
			rn.printStackTrace();
			 
		    }
		catch(Throwable th){
			System.out.println("AE is coming...");
			th.printStackTrace();
			
		    }
		
		
		System.out.println("BYE");
	    }
		
	public static void main(String[] args) {
		
		testing() ;
		
		
		
		
		
		
		
		
	}

}
