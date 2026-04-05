package OOP_Inheritance;

public class Car extends Vehicle {
	
	
	public final int minSpeed=100; // no variable overriding concept  in java 
	
	
	public void start() {
		System.out.println("car___has Kick Started");
	}

	public void refule() {
		System.out.println("car___ refule");
	}
	
	public void stop() {
		System.out.println("car___ Stop");
	}
	
	@Override
	public void engine() {
		System.out.println("Car vehicle___engine");
	}
	//final method :can not be overriden
	public final void parts() {
	  System.out.println("car---parts");
		}
	// Static method can not overridden	
	public static void billing() {
		System.out.println("car----billing");
	}
	
	//Individual method we can not overide privat method
	private void payment() {
	System.out.println("car---payment");	
	}
}
