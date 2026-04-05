package javaSession;

public class IncrementDecrementExpression {

	public static void main(String[] args) {
	
		int i =11;
		int j=i++ + ++i;
		System.out.println(i);
		System.out.println(j);
		
		int a=11;
		int b=22;
		int c= a+b + a++ + b++ + ++a + ++b;
		
		System.out.println("a="+ a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		int m=0;
		int n= m++ + --m + ++m - m--;
		System.out.println(m);
		System.out.println(n);
		
		
		
		int a1=1, b1=2;
		int c1= --b1 - ++a1 + ++b - --a1;
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		
		int o=0, p=0;
		int q=--o* --p*o-- * m--;
		System.out.println(o);
		System.out.println(p);
		System.out.println(q);
		
		
		
		
		
		
		
		
		
		
		
	}

}
