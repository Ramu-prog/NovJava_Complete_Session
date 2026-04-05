package accesModifier1;

import accesModifier.Car;

public class Audi extends Car {

	public static void main(String[] args) {
		
		Audi a = new Audi();
		a.licenseNumber=676429;// only public and protected allowed
		a.name="AudiQ4";
		
	

	}

}
