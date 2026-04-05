package functionConcept;

public class MainMethodConcept {

	String name;
	int age;
	static final int  wheel=4;
	
	public void get() {
		System.out.println("get method");
	}
	public static void set() {
		System.out.println("set method");
		
	}
	//main method job giving flexibility to user to creating object, call method
	// why main method is static>main method calling by jVM and he can't creating for main method
	// why main method is void in nature> main method  did not have business logic thats its return type is void.
	// why main method is public in nature> it is easy to call for JVM.
	

	public static void main(String[] args) {
		MainMethodConcept mmc= new MainMethodConcept();
	    System.out.println(mmc);

	}

}
