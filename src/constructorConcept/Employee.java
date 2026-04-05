package constructorConcept;

public class Employee {

    //Target is assign global variable to local variable(this.G=L)
	//Concept:constructor name will be same as a class name
    //       :it can not return anything.. no void ..no return type
    //       :never write any logic inside this (because it seems like a method but a mthod)
    //       :main purpose is initialize the instance/non static variable
    //       :it is called when we create the object
    //       :it can be overloaded
    //       :used to initialize the instance variable using this keyword
//   
//    
//    public Employee(String subject) {
//    	System.out.println("Im overlaoded constructor");
//    }
    
	String name;
	int age;
	double salary;
    boolean isActive;
    char gender;
    String dob;
    String city;
    
    //Ac:create the EMp registration via registration form
    //rule:-
          //1.Emp can registered with name.age city
          //2.Emp can registered with name.age city gender
          //3.Emp can registered with name.age city Dob
          //4.Emp can registered with name.age city,Dob,gender,isActive
    
    
    public Employee(String name, int age,String city) {
   	//Global variable =Local variable
    //this.Global variable =Local variable
    	//this.GV=Lv
    	this.name= name;
    	this.age=age;
    	this.city=city;
    }
	

	public Employee(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Employee(String name, int age, char gender, String dob, String city) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dob = dob;
		this.city = city;
	}

	public Employee(String name, int age, double salary, boolean isActive, char gender, String dob, String city) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isActive = isActive;
		this.gender = gender;
		this.dob = dob;
		this.city = city;
	}


	public static void main(String[] args) {
		
		Employee emp= new Employee("Tom", 21, "pune");
		
        System.out.println(emp.name +" "+ emp.age+ " "+ emp.city);

        Employee emp2= new Employee("Peter",22,"HYD" );
        System.out.println(emp2.name +" "+ emp2.age+ " "+ emp2.city+ " "+emp2.gender+ " "+emp2.salary +""+emp2.gender);
        
        
	}

}
