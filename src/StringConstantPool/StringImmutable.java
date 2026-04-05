package StringConstantPool;

public class StringImmutable {

	public static void main(String[] args) {
		
		int i=10;
		i=i+20;
		System.out.println(i);//30
		
		//inString
		String s= "java";
		s = s+"testing";
		System.out.println(s);//javatesting
		System.out.println("hello"+"automation"+100 + 12.33);

		
		//case1
		System.out.println("______");
		String str= "Automation";
		str.concat("Testing");
		System.out.println(str);//Automation
		
		
		//case2
		
		System.out.println("__ == __");
		str =str.concat("Testing");
		System.out.println(str);//AutomationTesting
		
		//String is immutable thats why java introduce SBF and SBl both class
	//StringBuffer 1.0 Vs StringBuilder	1.5
		
		//case 3
		System.out.println("Case1 vs Case3 ");
		
		StringBuilder sb = new StringBuilder("Selenium");
		sb.append("Testing");
		System.out.println(sb);
		
		System.out.println("_________");
		StringBuffer sbf= new StringBuffer("Cypress");
		sbf.append("Testing");
		System.out.println(sbf);
		
		
		
		
		
	}

}
