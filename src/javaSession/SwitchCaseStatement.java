package javaSession;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		//break means come out from entire switch case
		//if no case match then default
		//if u break the comment then it will execute next case
		
		String browser= "chrome";
		switch (browser) {		
		case "chrome":
			System.out.println("launch chrome ");
			break;

		case "firefox":
			System.out.println("launch firefox ");
			break;
		case "edge":
			System.out.println("launch edge ");
		    break;
			
		case "safari":
			System.out.println("launch safari ");
			break;
	
		default:
			System.out.println("please pass the correct bowser nadm:"+ browser);
			break;
		}
		
		System.out.println("BYE!!");
		
	}
	}



