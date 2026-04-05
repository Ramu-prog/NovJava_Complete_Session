package superkeyword;

public class Car {
	
	public final int minSpeed= 100;
	
	//java always looks default constructor
	//In the case of constructor calling int the parent child relation  it is opposite to the method calling
    //java  always gave priority to parent class default class constructor.
	
	public Car(){
		this(200);
		System.out.println("Car-- default constructor");
	}
	
	public Car( int a){
		System.out.println("Car-- default constructor" + a);
	}
	
	public Car(int a , int b) {
		System.out.println("car - two parameter const.." +a+b);
	}

	public void start() {
		System.out.println(" Car start");
	}
	
	
	

}
