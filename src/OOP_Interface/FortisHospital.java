package OOP_Interface;

public class FortisHospital extends Medical implements USMedical,UKMedical,IndianMedical{

	static int min_fee=200;
	
	
	// We can extend only one class but N number of interface
	//Extends class should be first
	//Common method are allowed in all the interface below method is common
	
   //US, UK, IN
	@Override
	public void emergencyService() {
		System.out.println("Im common method in all interface--emergencyService");
		//this class responsibility to create logic for all respected interface based
		//on the given country
		
	}
	
	@Override
	public void pediaService() {
		System.out.println("FH--pediaService");
		
	}

	@Override
	public void cardioService() {
		System.out.println("FH--cardioService");
		
	}

	@Override
	public void physioService() {
		System.out.println("FH--physioService");
		
		
	}

	@Override
	public void ENTService() {
		System.out.println("FH--ENTService");
		
		
	}

	@Override
	public void neuroService() {
		System.out.println("FH--neuroService");
		
		
	}
	

	@Override
	public void gynecServices() {
		System.out.println("FH--gynecService");
		
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH--oncologyService");
		
		
	}
	
	//Individual methods
	public void medicalTraining() {
	    System.out.println("FH--medicalTraining");
		}
		
	public void OPTServices() {
			System.out.println("FH--OTPServices");
			
		}

	//who method
		@Override
	public void covidVaccination() {
		System.out.println("FH-- covidVaccination");	
			
		}

		//Method hiding
	public static void billing() {
			System.out.println("FH--billing");
		}
	
	//default>> to public
	@Override
	public void training() {
		System.out.println("FH--training");
	}
	
	
}
