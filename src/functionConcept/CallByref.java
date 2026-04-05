package functionConcept;

public class CallByref {
	
	public void push() {
		System.out.println("push method is non Static");
		//NS>S>call
		
	}

	public static void pop(CallByref cf1) {
		System.out.println("pop method is Static method");	
		//S>NS>call ___Cf=Cf1
		cf1.rest();
		//Call by reference is need when the static method is calling the non static method.
		//Advantage:avoiding the to object creation n number of times
		//supply the references use it 
	}
	
	public void rest() {
		System.out.println("rest method non Static");
	}
	public static void main(String[] args) {
		//S to NS:call
		CallByref cf= new CallByref();
		cf.push();
	
		CallByref.pop(cf); //Call by reference

	}

}
