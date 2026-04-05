package javaSession;

public class CharConcept {

	public static void main(String[] args) {
		// if u performed mathematical operation it will give the ASCII value
		//char range is a-z=97to122
		//char range is A-Z=65to90
		//0t09:48+57
		//char store single value and range is 2bytes (16 bits)
		
	   //unicode char is =1600 char+ASCII value
		char ch1='a';
		char ch2='b';
		System.out.println(ch1+ch2);
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println('A'-'B');
		
		
		System.out.println(ch1*10);
		
		System.out.println(ch1+0);
		System.out.println((byte)ch2);
		System.out.println((byte)98);
		System.out.println((char)9896);
		
		int p=100;
		System.out.println((char)p);
		System.out.println('a'+ "A");//aA
		System.out.println("A"+"B");//AB
		System.out.println('a'+'a');//194
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
