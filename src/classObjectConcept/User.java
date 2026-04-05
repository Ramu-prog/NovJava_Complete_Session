package classObjectConcept;

public class User {

	String name;
	int age;
	String city;
	public static void main(String[] args) {
		
		//An Object can have multiple references
		User us1=new User();
		us1.name="U";
		us1.age=18;
		us1.city="Bangalore";
		
		User us2=new User();
		us2.name="S";
		us2.age=19;
		us2.city="Pune";
		
		User us3=new User();
		us3.name="V";
		us3.age=20;
		us3.city="Hyd";
		
		System.out.println(us1.name+" "+us1.age+" "+us1.city);
		System.out.println(us2.name+" "+us2.age+" "+us2.city);
		System.out.println(us3.name+" "+us3.age+" "+us3.city);
		
        System.out.println("_______________");
        
        us1=us2;
        System.out.println(us1.name+" "+us1.age+" "+us1.city);
		System.out.println(us2.name+" "+us2.age+" "+us2.city);
		System.out.println(us3.name+" "+us3.age+" "+us3.city);
		
		System.out.println("______________");
		
	      us2=us3;
	        System.out.println(us1.name+" "+us1.age+" "+us1.city);
			System.out.println(us2.name+" "+us2.age+" "+us2.city);
			System.out.println(us3.name+" "+us3.age+" "+us3.city);
			
			System.out.println("______________");
			
		       us3=us1;
		        System.out.println(us1.name+" "+us1.age+" "+us1.city);
		        System.out.println(us3.name+" "+us3.age+" "+us3.city);
				System.out.println(us2.name+" "+us2.age+" "+us2.city);
				
		        
	        
        
	}

}
