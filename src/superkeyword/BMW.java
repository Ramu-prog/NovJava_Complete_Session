package superkeyword;

public class BMW extends Car {
	
	int minSpeed= 200;
	
	//java will create default constructor if there is not constructor
	
	public BMW() {
		System.out.println("BMW -- default const..");
	}
	
	public BMW(int a) {
		System.out.println("BMW -- one param const.." + a);
	}
	
	
	public BMW(int a, int b) {
		//call parent class constructor.. using super keyword
		super(a, b);// When ever u r calling the constructor super and this keyword always in first statement
		System.out.println("BMW -- two param.." + a+b);
		
	}
	@Override
	public void start() {
		System.out.println("BMW started ");
		
	}

}
