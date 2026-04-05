package ExceptionHandling;

public class Testdata {

	public static void main(String[] args) {

	//throw keyword
		
		String data = "RN";
		
		if(data == null) {
			throw new RuntimeException("DatanotFoundException");
			
		}
		
		System.out.println(data);
		
		System.out.println("BYE");
	}

}
