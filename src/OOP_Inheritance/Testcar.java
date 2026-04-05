package OOP_Inheritance;

public class Testcar {

	public static void main(String[] args) {
		
		//We can access override method and inherited method
		BMW b = new BMW();
		b.start(); //Overriding
		b.stop();// Inherited
		b.refule();// Inherited
		b.autoparking();//Individuals 
		b.engine();
		b.parts(); //Inherited
		b.billing();//not access by right way
		System.out.println(b.minSpeed);
		b.dashboard();
		
	    System.out.println("__________");
	    
	    Audi au =new Audi();
	    au.start();
	    au.stop();
	    au.refule();
	    au.theftSafty();
	    au.engine();
	    Audi.billing();//inherited
	   
	    
	    System.out.println("__________");
	   
	    Car c = new Car();
	    c.start();
	    c.stop();
	    c.refule();
	    c.engine();
	    
	    System.out.println("__________");
	    
	    //child class object can be refereed by parent by parent class ref variable
	   // Top casting>Read this Every BMw is a car
	    
	     Car c1 = new BMW();
	     c1.start();//bmw method will call
	     c1.engine();
	     c1.stop();
	     c1.refule();
	     c1.parts(); //Inherited 
	    //down casting:- ClassCastException
	     //Parent class object can be referred by child class ref variable
	     //BMW b1 =(BMW) new Car();//ClassCastException
	     
	     //Sibling to sibling casting
	     //Audi a1= new BMW();
	     
	     //Child class object can be referred by grand parent class ref variable
	     //Top Casting 
	     Vehicle v1 = new BMW();
	     v1.engine();
	    
	     //
	     Vehicle v2 = new BMW();
	     v2.engine();
	     
	     
	     
	     
	     
	    
	}

}
