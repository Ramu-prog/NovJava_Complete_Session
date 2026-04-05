package functionConcept;

public class CallByRefrenceConcept {
	
	public void pop() {
		System.out.println("Im a pop method");
		//Ns to S
		//CallByRefrenceConcept.top();
	}
	
	public static void top(CallByRefrenceConcept Cref1) {
		System.out.println("Im a top method");
		//Cref=Cref1  Here we are direct class object reference
		//S to NonS
		//CallByRefrenceConcept Cref2= new CallByRefrenceConcept();
		//Cref2.rest();
		
		// 1.Here calling non static to static we have two option either create fresh object.
		// 2.or get reference and supply the reference and pass as a parameter in static method and call non static method.
		// Call by reference Need of:-nonStatic method calling to Static method
		Cref1.rest();
		Cref1.pop();
	}
	
	public void rest() {
		System.out.println("Im a rest method");
	}

	public static void main(String[] args) {
		//S to NonS
		CallByRefrenceConcept Cref= new CallByRefrenceConcept();
		//Cref.pop();
		//S to S
		//CallByRefrenceConcept.top();
		
		CallByRefrenceConcept.top(Cref);

	}

}
