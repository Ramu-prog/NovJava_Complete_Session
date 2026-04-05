package OOP_Inheritance;

public class BMW extends Car {
   
	//Method overriding :
	//When we have method in tje parent class and the same method in the child class with
	//1.With the same name
	//2.with same number of parameter
	//3.with the same return type
	//Poly+Morphism :dynamic runtime time polymorphism
	//Compiler is confuse which methodd have call thats why this compile time polymorphism
	
	// use of super keyword is: to called the parent class property in the child class
	// use of this keyword is: it always called the current class properties    
	public int minSpeed=200;
	
	public void dashboard() {
		System.out.println("dashbaord details");
		System.out.println(super.minSpeed);// calling class speed //100
		System.out.println(minSpeed);// 300
		super.start();// car start from parent
		start();//BMW start method
	}
	
	
	
	
	
	@Override
	public void start() {
		System.out.println("BMW___ has self Started");
         super.start(); // i need some business help from my parent class start method for this purpose we can use super keyword to use parent class method.
         System.out.println("BMNW-- start logic");
         super.stop();
         System.out.println(minSpeed);
         System.out.println(super.minSpeed);
         System.out.println("__________________________________");
        
	}
	
	
	@Override
	public void engine() {
		System.out.println("BMW vehicle___engine");
	}

	public void autoparking() {
		System.out.println("BMW___auto parking");
	}
	// we can can not override static method it is individula method 
	//Method hiding child and parent has same method
	public static void billing() {
		System.out.println("car----billing");
	}
	
	private void payment() {
		System.out.println("car---billing");	
		}
	
}
