package StringConstantPool;

import java.util.Arrays;

public class CharSequenceConcept {
	
	//public static void sendkey(CharSequence data) {
	//charSequence(I) all types of data u can give(Implemented class like as) >like as String StrinBuffer StringBuilder
	public static void sendkey(CharSequence... data) {
		//This Array now
		//System.out.println(data);
		
		System.out.println(Arrays.toString(data));
	}

	public static void main(String[] args) {

		String data ="Selenium";
		StringBuffer sb= new StringBuffer("Learning");
		StringBuilder sbf= new StringBuilder("Concept");
		sendkey(data,sb,sbf);
		
		
		
        
		
		
		
		
		
		
		
		
		
		

	}

}
