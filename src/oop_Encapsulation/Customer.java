package oop_Encapsulation;

public class Customer {

	private String name;
	private int age;
	private int custid;
	private String city;
	
	//Behaving like a setter 
	public Customer(String name, int age, int custid, String city) {

		this.name = name;
		this.age = age;
		this.custid = custid;
		this.city = city;
	}

	
	//pblic getters and setteres
	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public int getAge() {
		return age;
	}

//	public void setAge(int age) {
//		this.age = age;
//	}

	public int getCustid() {
		return custid;
	}

//	public void setCustid(int custid) {
//		this.custid = custid;
//	}

	public String getCity() {
		return city;
	}

//	public void setCity(String city) {
//		this.city = city;
//	}
//	
	
	
	
	
}
