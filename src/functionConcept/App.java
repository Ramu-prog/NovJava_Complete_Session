package functionConcept;

public class App {
	//stack overflow 
	//memory allocation happen and after that memory dislocation will be happend
	//if it is no happening the stackover flow will happen
	public static void t1() {
		System.out.println("Static method1");
		App.t2();
	}
	public static void t2() {
		System.out.println("Static method2");
		App.t3();
	}
	public static void t3() {
		System.out.println("Static method3");
	}
	
	public void m1() {
		System.out.println("non static method1");
		m2();
	}
	public void m2() {
		System.out.println("non static method2");
		m3();
	}
	public void m3() {
		System.out.println("non static method3");
		//m1();Stack overflow
		App.t1();
		
	}

	public static void main(String[] args) {
		
      App ap=new App();
      ap.m1();
	}}

    // Within the same class
	//S-calling:-S:use class name
	//NS-calling:-NS:direct calling
	//NS-calling:-S:use class name
	//S-calling:-NS:use class object ref name
