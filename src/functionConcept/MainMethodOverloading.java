package functionConcept;

public class MainMethodOverloading {
	 public static void login(int loginwithotp) {
		 System.out.println("Login with opt");
		 
	 }
	 
 public static void login(String username, String password) {
		 
	 }
 
 public static void login(String gmail) {
	 
 }
	
	public static void main(int a ,int b) {
	System.out.println("main method:" +(a+b));
	}
	public static void main(int a) {
	System.out.println("main method:"+a);

	}

	//jvm always comes and call this (public static void main(String[] args))
	public static void main(String[] args) {
		System.out.println("main method");
	
		
		MainMethodOverloading.main(10);
		MainMethodOverloading.main(10, 20);
		MainMethodOverloading.login(1234);
	    

		}

}
