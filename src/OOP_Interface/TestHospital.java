package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		
		FortisHospital fh = new FortisHospital ();
		fh.cardioService();
		fh.ENTService();
		fh.gynecServices();
		fh.oncologyServices();
		fh.neuroService();
		fh.pediaService();
		fh.physioService();
		fh.medicalTraining();
		fh.OPTServices();
		fh.medicalNews();//individuals
		fh.medicalRnD();//individuals
		fh.emergencyService();//common
		fh.covidVaccination();//Who
		System.out.println(USMedical.min_fee);
		System.out.println(FortisHospital.min_fee);
		USMedical.billing();
		fh.training();
		System.out.println("__________________");
		
		
		
		//top casting: child class object can be referred by parent interface ref variable.
		// we can not create object of interface 
		//because whatever method interface contain thats is prototype/deceleration method
		//we can not define the method inside the interface because interface variable and methods are public and abstract
		
		USMedical us = new FortisHospital();
		us.cardioService();
		us.pediaService();
		us.physioService();
		us.emergencyService();
		us.covidVaccination();
		us.training();
		
		
		System.out.println("__________________");
		
		
		UKMedical uk = new FortisHospital();
		uk.ENTService();
		uk.neuroService();
		uk.emergencyService();
		uk.emergencyService();
        uk.covidVaccination();
       
        
		System.out.println("__________________");
		
		IndianMedical ind = new FortisHospital();
		ind.gynecServices();
		ind.oncologyServices();
		ind.emergencyService();
		ind.covidVaccination();
		
		System.out.println("__________________");
		
		
		//Down casting :NA because we have to create the object of interface
		//Interface down casting is not allowed
		//Complie time error class cast exception
		
		
		

	}

}
