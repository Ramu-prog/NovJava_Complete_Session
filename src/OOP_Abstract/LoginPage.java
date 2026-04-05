package OOP_Abstract;

public class LoginPage extends Page {


	public LoginPage() {
		System.out.println("Lp____default constructor");
	}
	
	public LoginPage(int a) {
		System.out.println("Lp____one constructor"+ a);
	}
	
	@Override
	public void title() {
		System.out.println("LP--title");
		
	}

	@Override
	public void url() {
		System.out.println("LP --Logo");
		
	}
    @Override
	public void loadingTime() {
		System.out.println("loginPage --loading time:-2 sec");
	}
	
    
	public void doLogin() {
		System.out.println("Lp___dologin");
	}
	
	
}
