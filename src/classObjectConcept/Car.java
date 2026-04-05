package classObjectConcept;

public class Car {

	String name;
	String licensenumber;
	String chasisNumber;
	String color;
	String model;
	double price;
	static final int wheels= 4;   //common value for each object(if some1 change/manipulate the thats why we make final)
	//static variable only class level property cant use inside any method
	public static void main(String[] args) {
		
		Car c1= new Car();
		c1.name="BMW";
		c1.licensenumber="bmw123";
		c1.chasisNumber="bmw908";
		c1.color="black";
		c1.model="X1";
		c1.price=45.50;
		//c2.wheels=4; 
		//warning --not a good practice
				// How to access the static variable
				//1.Using the class name-Always prefer
		System.out.println(Car.wheels);
		//2.call directly
		System.out.println(wheels);
		//3.using object reference way
		System.out.println(c1.wheels);
		
		Car c2= new Car();
		c2.name="Audi";
		c2.licensenumber="Audi123";
		c2.chasisNumber="Audi908";
		c2.color="Red";
		c2.model="AudiX2";
		c2.price=46.50;
		System.out.println(c1.name+" "+c1.licensenumber+" "+c1.price+" "+c1.color+" "+c1.model+" "+Car.wheels);
		
	
		Car c3= new Car();
		c3.name="Honda";
		c3.licensenumber="Honda123";
		c3.chasisNumber="Honda908";
		c3.color="Blue";
		c3.model="hondacity";
		c3.price=47.50;
		
		System.out.println(c3.name+" "+c3.licensenumber+" "+c3.price+" "+c3.color+" "+c3.model+" "+Car.wheels);
		
	
				
				
		
	}
}
