package OOP_Interface;

public interface USMedical extends who {
	
	
	//interface variables are by default static and final in nature.
	//access by them using Interface name
	int min_fee=100;
	
	
	//Only Method declaration thats means can not have method body.
	//Only prototype method
	//can not have constructor of the interface>>object creation is not possible of the interface
	//No business logic in interface method
	// All are public abstract (by default) Method--no body no business logic Only method deceleration
	// In java we can not create the object of interface
	//policy maker classes child class responsibility to define the method.
	public void pediaService();
	public void cardioService();
	public void physioService();
	public void emergencyService();
	
	//two major change from JDK1.8;
	//1.Static method with the method body.
	
	public static void billing() {
		System.out.println("USMedical--billing");
	}
	
	//2.default method with the method body (non static):
	//default keyword --is only for interface
	default void training() {
		System.out.println("USM--training");
	}
	
	

}
