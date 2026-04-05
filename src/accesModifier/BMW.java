package accesModifier;

public class BMW extends Car{

	public static void main(String[] args) {

		
		//Except private all properties are allowed
		
		BMW b= new BMW();
		b.name="BMW new";
		b.color="Blue";
		b.licenseNumber=123432;
		
		

	}

}
