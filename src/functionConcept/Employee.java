package functionConcept;

public class Employee {
	
	//Method is a piece of code which can execute n number of times like login method
	//Login(){
	//Enter UN
	//Enter Pass
	//Click on login
  //}
	//Method and function both are same
	//Methods are always independently
	//we can not write method inside the method
	//Duplicate methods are not allowed--->method overloading 

	//1. no input (parameter) and no return type
	public void test() {
		System.out.println(" This is the test method");
	}
	
	public void clickLoginButton() {
		System.out.println(" click on login button");
	}
//	2.some input (parameter) and no return
	public void add(int a, int b) {
		System.out.println(" add method");
		int c=a+b;
		System.out.println(c);
		
	}
	public void login(String username ,String password) {
		System.out.println("____login to app______");	
		System.out.println("enter the username:"+username);
		System.out.println("enter the password:"+password);
		System.out.println("click on login button");
		}
//	3.some input (parameters) and some return
	public int sum(int a, int b) {
		System.out.println("sum of two number..");
		int c=a+b;
		return c;
	}
	
	public boolean isuserActive(String username) {
		System.out.println("user is active or not ...");
		if(username.equals("rn")) {
			return true;
		}
		else
			return false;
	}
	//4.no input but return type
	public String getaTrainer() {
		System.out.println("getting trainer name");
		return "naveen";
	}
	
	
	
	public static void main(String[] args) {
		//calling a method : have to create the object of the class:
		Employee emp = new Employee();
		 emp.test();//calling the method
		 emp.clickLoginButton();
		 emp.add(10, 30);
		 emp.login("Admin0101", "pass#2"); //Arguments
		 int s1= emp.sum(10, 30); //Arguments
		 System.out.println(s1);// reueable approach
		 System.out.println(s1+5);
	     boolean	flag = emp.isuserActive("rn");
	     System.out.println(flag);
	     if(flag) {
		 System.out.println("increase the salary");
		 
	String trainername	 =emp.getaTrainer();
		System.out.println(trainername);
	}
			
		

	}

}
