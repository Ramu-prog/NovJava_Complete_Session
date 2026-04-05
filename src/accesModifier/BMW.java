package accesModifier;

public class BMW extends Car{

	public static void main(String[] args) {

		
		//Except private all properties are allowed
		
		BMW b= new BMW();
		b.name="BMW new";
		b.color="Blue";
		b.licenseNumber=123432;
		
		//bmw class class is extended from car class.
       System.out.println("print nothing");
	}

}
