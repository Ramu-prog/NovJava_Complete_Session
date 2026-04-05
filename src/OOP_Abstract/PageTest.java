package OOP_Abstract;

public class PageTest {
	
	public static void main(String[] args) {
		
		LoginPage lp= new LoginPage();
		lp.title();
		lp.url();
		lp.loadingTime();
		lp.doLogin();  
		Page.logo();
		
		//Top casting : child class object can be referred by abstract parent class ref variable.
		Page page = new LoginPage();
		page.title();
		page.url();
		page.loadingTime();
		Page.logo();
		
		//Down casting:not application we can not create abstract class object
		
		 
		
	}

}
