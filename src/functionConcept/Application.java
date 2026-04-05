package functionConcept;

public class Application {
	//Method overloading:within the same class,when we have multiple method
	//1.with the same name
	//2.with the different number of parameter
	//3.with the different type of parameter
	//4.with the different sequence of parameter
	//5.return type could be anything--it does not matter
	//-- Polymorphism (poly-means-more,morphism-form) which has multiple form
	// it is also called compile time polymorphism
	
	public void test() {
		
	}
    public void test(int a) {
		
	}
    public void test(int a ,int b) {
	
	}
    public void test(int a ,String b) {
    	System.out.println("calling me");
    	
    }
    
    public void test(String a ,int b) {
    	
	}
    //in one method we can pass 256 parameter.
    // use of overloading
    
    //Ecom>According my functionality user can able to login
    
    public void login() {
    	
    }
    
 public void login(String username, String password) {
    	
    }
 
 public void login(String username, String password, int otp) {
 	
 }
    
 public void login(String username, String password, int otp, String role) {
	 	
 }
  
 //Search
 
 public static void serach() {
	 
 }
 public static void serach(String productname) {
	 
 }
    
public static void serach(String productname, int price) {
	 
 }
   

public static void serach(String productname, String color ,int price) {
 
}
    
    //payemet
public static void makePayment() {
	
}
    
public static void makePayment(String upi) {
	
}
    
public static void makePayment(String upi, String CC) {
	
}
 //booking
public static void bookingride(String srtpoint, String endpoint) {
	
}
public static void bookingride(String srtpoint, String endpoint, String cartype) {
	
}  
public static void bookingride(String srtpoint, String endpoint, String cartype, int basedseat) {
	
}
    
//Zomato
public static void food(String member, int quantity) {
	
}
public static void food(String member, int quantity, float blance) {
	
} 
public static void food (String member, int quantity, float blance,String type ) {
	
} 
    
    
	public static void main(String[] args) {

    Application ap= new Application();
    ap.test();
    ap.test(10);
    ap.test(10, "ravi");
    ap.login("Admin", "pass#2");
    
	}

}
