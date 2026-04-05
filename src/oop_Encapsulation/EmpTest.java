package oop_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		
		Employee e1= new Employee();
	
		e1.setName(null);
		e1.setAge(30);
		e1.setGender('m');
		e1.setSalary(10);
		e1.setActive(true);
		
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getGender());
		System.out.println(e1.getSalary());
		
		
		
		
		
		
		
		
		
	}

}
