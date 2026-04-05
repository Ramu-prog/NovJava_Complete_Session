package oop_Encapsulation;

public class User {
	private String name ;
	private int age;
	private String city;
	
   //Through constructor assigning the value
	public User(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}

	//
	public void printUserInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(city);
		

	//Static method not a part of OOprograming	
	}
	

}
