package functionConcept;

public class User {

	//AC : getting the student marks:1-100
	//WAM:function name :getStudentmarks(String student name)
	//1 parameter : studentName (String)
	//return: marks (int)
	
	public int getStudentMarks(String studentName) {
		System.out.println("getting student marks for:"+studentName);
		if(studentName.equals("snehal")) {
			return 90;
		}
		else if(studentName.equals("vijay")){
			return 80;
		}
		else if(studentName.equals("priya")) {
			return 70;	
		}
		else if(studentName.equals("naveen")) {
			return 60;
		}
		else {
		System.out.println("studnet not foun:"+studentName);
		return 0;
		}
	}

	//if else has performance issue(if condition is not satisfied then it keep checking for match condition)
	//To overcome this problem we can use Switch case statement
	//return and break can't be together
	
	public int getMarks(String studentName) {
		System.out.println("getting the marks for:" + studentName);
		
		switch (studentName.trim().toLowerCase()) {
		case "naveen":
			return 95;
		case "vijay":
			return 85;
		case "priya":
			return 75;
		case "snehal":
			return 65;
				
		default:
			System.out.println("Student not found..."+ studentName);
			return 0;
		}
	}

	public static void main(String[] args) {
		 User user = new User();
		 int marks = user.getStudentMarks("naveen");
		 System.out.println(" "+ marks);
		 //use of return value store the value and it gives further operation
		 
		 if(marks>=1 && marks<=100) {
			 System.out.println("print the marksheet");	 
		 }
		 
        System.out.println("To overcome this problem we can use Switch case statement");
		int Marks = user.getMarks("naveen"); // do u have match case if yes go and execute otherwise execute default
		System.out.println(Marks);
		 
		 
	}

}
