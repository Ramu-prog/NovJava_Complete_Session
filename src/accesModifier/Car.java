package accesModifier;

public class Car {

	public String name;
	private float price ;
	protected int licenseNumber;
	String color;
	
	
	public static void main(String[] args) {
		
		Car c= new Car();
		c.name="BMW";
		c.price=2123;
		c.licenseNumber=12423;
		c.color="Red";
		
	

	}

}
