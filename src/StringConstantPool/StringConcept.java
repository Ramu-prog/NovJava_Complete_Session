package StringConstantPool;

public class StringConcept {

	public static void main(String[] args) {
		
		String x= "selenium";
		String y= x+"Automation"; //seleniumAutomation
		
		System.out.println(x);
		System.out.println(y);
		
		String a="Testing";
		System.out.println(a+"Api");//Testingapi
		
		//String literals
		String s1="java";
		String s2="java";
		
		//using new keyword:heap object
		String s3=new String("java");
		String s4=new String("java");
		
		String s5= "java";
		System.out.println(s1==s2);//true
		System.out.println(s1==s5);//true
		System.out.println(s2==s5);//true
		
		System.out.println(s1==s3);//false
		System.out.println(s1.equals(s3)); //true
		
		
		String s6= new String("Playwright");
		String t3= "Playwright";
		String t4="playright";
		
		
		

	}

}
