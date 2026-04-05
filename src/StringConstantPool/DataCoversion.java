package StringConstantPool;

public class DataCoversion {

	public static void main(String[] args) {
		
		String x="100";
		System.out.println(x+20);
		//Convert String to int use Wrapper class Interger>this class has Method parseInt
		
		int i =Integer.parseInt(x);
		System.out.println(i);
		
		
//		String y = "100A";
//		int j=Integer.parseInt(y);
//		System.out.println(j+20);//NFE
		
		
		//String int double
		String t= "100.12";
		Double d= Double.parseDouble(t);
		System.out.println(d+20);
		
		
		String isActive= "true";
		boolean isact =Boolean.parseBoolean(isActive);
		
		if(isact) {
			System.out.println("login to app");
		}
		
		//int to String
		int p= 100;
		String p1=p+"";
		System.out.println(p1);
	String p2= String.valueOf(p);//100>"100"
	System.out.println(p2.length());
	
	String p3= String.valueOf(12.33);
	System.out.println(p3+20);

		//true-->"true"
	
	
	boolean flag= true;
	String fg=String.valueOf(flag);
	System.out.println(fg+20);
	
	System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		System.out.println(Short.MAX_VALUE);
		
	}

}
