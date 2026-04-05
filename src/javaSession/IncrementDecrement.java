package javaSession;

public class IncrementDecrement {

	public static void main(String[] args) {
	
		//++ --
		//1.post(later) increment:++
		// increase the one value later
		int p=10;
		System.out.println("original valuee is consume by println :"+p);
        System.out.println("now current value of p is post incremented p++ :"+ p);
        
        
        int a=1;
        int b=a++;
        System.out.println(b);
        System.out.println(a);
        
        int x=100;
        int y=x++;
        System.out.println(x);
        System.out.println(y);
        
        int c=-99;
        int d=c++;
        System.out.println(d);
        System.out.println(c);
        
        
        System.out.println("");
        
        //2.Pre increment:++ ,first increase and then assign
        // increase the one value before
        int t=10;
        System.out.println(++t);
        System.out.println(t);
        
        
        int m=1;
        int n=++m;
        System.out.println(m);
        System.out.println(n);
        
        int u=-999;
        int w=++u;
        System.out.println(u);
        System.out.println(w);
        
        
        //3.Post decrement --
        
        System.out.println("");
        
        int totalAmount =500;
        System.out.println(totalAmount--);
        System.out.println(totalAmount);
        
        int s=10;
        int r= s--;
        System.out.println(s);
        System.out.println(r);
        
        
        int nt=-90;
        int at=nt--;
        System.out.println(nt);
        System.out.println(at);
        
        
        System.out.println("");
        
        //4.pre decrement
        
        int v=900;
        System.out.println(--v);
        System.out.println(v);
        
        
        int n1=-499;
        int n2=--n1;
        System.out.println(n1);
        System.out.println(n2);
        
        
        
        
	}

}
