package StringConstantPool;

public class StringManipulationMethod {

	public static void main(String[] args) {
		
		 String str="Hello Easy way Type script with Playwright oky";
		 System.out.println("Lenght of given Strin:"+ str.length());
		 
		 System.out.println(str.charAt(17));
		 System.out.println(str.indexOf('l'));
		 System.out.println(str.indexOf('T'));
		 
		 System.out.println("________");
		 //First occurrence of y
		System.out.println(str.indexOf('H'));
		System.out.println(str.indexOf('y'));
		System.out.println(str.indexOf('a'));
		 
		 System.out.println(str.indexOf('y', 10));//hardcoaded if one1 change the string
		 
		 //2nd occurrence of y
		 System.out.println(str.indexOf('y', str.indexOf('y')+1));
		 
		 System.out.println(str.indexOf('y', str.indexOf('y', str.indexOf('y')+1)+1));
		 
		 System.out.println(str.indexOf('y', str.indexOf('y', str.indexOf('y')+1)+1)+1);
		 
		 System.out.println(str.indexOf("Playwright"));
		 
		 String msg="Welcome Admin";
		 if(msg.indexOf("Admin")==8) {
			 System.out.println("Pass");
		 }
		 else {
			 System.out.println("fail");
		 }
		 
		 
		 //trim> removed space before & after
		 String tr="    Testing   ";
		System.out.println(tr.trim());
		 
		//replace
		String dob="09-10-190";//09/10/1990
		System.out.println(dob.replace("-", "/"));
		
		//replace with nothing
		String ty=" play wright  ";
		System.out.println(ty.replace(" ", ""));
		
		
		StringBuilder sb= new StringBuilder("     TypeScript    ");
		sb.replace(0, sb.length(), "");
		
		String pop = "playwright";
		System.out.println(pop.toUpperCase());
		System.out.println(pop.toLowerCase());
		
		//contains
		String test= "product name is MacbookPro";
		System.out.println(test.contains("MackbookPro"));
		
		//split
		String lang="Java_Python_Javascript_TypeScript";
		String lg[]=lang.split("_");
		System.out.println(lg[0]);
		
		
		String data="xXseleniumXxXTestingXXxXAutomationX";
		String dt[] = data.split("xX");
		System.out.println(dt[0]);//blank
		
		System.out.println(dt[1]);
		System.out.println(dt[2]);
		System.out.println(dt[3]);
		//System.out.println(dt[4]);//AIOB
		
		System.out.println("_________");
		
		String mydata= "Tom||SDET||IBM||Banglore||24.25";
		String value[] = mydata.split("\\|");
		System.out.println(value[0]);
		
		System.out.println("_________");
		
		String mydata1= "Tom.SDET.IBM.Banglore.24.25";
		String value1[] = mydata1.split("\\.");
		System.out.println(value1[0]);
		
		
		System.out.println("_________");
		String loop="I love \"\\java\" coding";//I love "java" coding
		System.out.println(loop);
		
		System.out.println("_________");
		String wq="I Love 'java' coding";//i love 'java' coding
		System.out.println(wq);
		
		
		
		
		
		
		
		
		
	}

}
