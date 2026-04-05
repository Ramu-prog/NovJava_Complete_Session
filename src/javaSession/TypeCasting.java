package javaSession;

public class TypeCasting {

	public static void main(String[] args) {
		
		//widening -Implicit>byte>short>int>long>float>double
		//if reverse it then it called narrowing or Explicit conversion
		byte b= 10;
		short s=b;
		System.out.println(s);
		int i=b;
		System.out.println(i);
		long l =b;
		System.out.println(l);
		//--
		
		byte x1=20;
		byte x2=10;
		//byte x3=x1+x2;
		int x3=x1+x2;
		System.out.println(x3);
		//whenever u are trying to do mathematical operation use int
		
		
		int t=200;
		byte e=(byte)t;
		//byte range -128to127[data loose]
		System.out.println(e);
	
		
		short s1=(short)t;
		//range -32768 to 32767[no data loss within the range]
		System.out.println(s1);//200
		
		
		int t1=50000;
		short s11=(short)t1;
		System.out.println(s11);//-15536
		//beyond the range we are gone thats -ve value came 
		
		
		long k=90909090l;
		byte e1=(byte)k;
		System.out.println(e1);
		
		
		int i2=9000;
		float ft=i2;
		System.out.println(ft);
		
		
		double d=12.23;
		byte te=(byte)d; // hoga 12.33 but 12 print hoga
		System.out.println(te);
		
		double d2=300.44;
		byte be=(byte)d2;
		System.out.println(be);
		
		long bill=400000;
		float f=bill;
		System.out.println(f);
		
		
		
		
		
		
		

	}

}
