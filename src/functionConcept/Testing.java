package functionConcept;

public class Testing {
	
	//if something is common for ever1 use static concept
	// if not it is uncommon the non static
	
	public void sendMail() {
		System.out.println("Send the mail");
	}

	public static void getMail() {
		System.out.println("get the mail");
	}
	public static void main(String[] args) {
		
		//How to call non static method:creating object of class & using its object reference
		Testing t1=new Testing();
		t1.sendMail();
	
		
		//How to call static method there is Two way
		//1.using class
		//2.direct method call(not a good practice)becz if another class same method it will gives to confusing challenge to manage
		 Testing.getMail();
		 getMail();
		 System.out.println("__");
		 //3.using object reference
		// t1.getMail(); performance issue
	}

}
