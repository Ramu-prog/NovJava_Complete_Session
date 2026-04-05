package DynamicArray;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
	
		//ArrayList --default class in java
		//order based collection --it maintains the index
		
		ArrayList ar= new ArrayList();
		System.out.println(ar.size());
		
		ar.add(100);
		ar.add(200);
		
		System.out.println(ar.size());
		ar.add(300);
		ar.add(400);
		
		System.out.println(ar.size());//4
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(3));
		System.out.println(ar.get(4));
		
		
		
		
		
		
		

	}

}
