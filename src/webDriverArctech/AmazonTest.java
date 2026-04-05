package webDriverArctech;

import ExceptionHandling.MyException;

public class AmazonTest {
	
	static WebDriver driver;//null

	public static void main(String[] args) {
	
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver= new FirefoxDriver();
		//EdgeDriver driver= new EdgeDriver();
		//SafariDriver driver= new SafariDriver();
		
		//Cross browser logic
		String browser= "chrome";
		
		switch(browser.toLowerCase().trim()){
		
			case "opera":
			driver = new ChromeDriver();
			break;
			
			case "firefox":
				driver = new FirefoxDriver();
				break;
					
			case "edge":
				driver= new EdgeDriver();
				break;
				
			case "safari":
				driver= new SafariDriver();
				break;
		
				default:
				System.out.println("plz pass the coreect browser "+ browser);
				throw new MyException("Invalid browser");
		}
		
	
		driver.get("http://www.amzon.com");
	    String title = driver.getTitle();
	    System.out.println(title);
	
	    driver.findElement("emailID");
	    driver.sendKeys("emaiId", "naveen@gmail.com");
	    
	    driver.findElement("passowrd");
	    driver.sendKeys("password", "rn@123");
	    
	    driver.findElement("loginBtn");
	    driver.click("loginBtn");
	    driver.quit();
	    		
	    
  
	    
	}

	private static void Switch(String trim) {
		
	}

}
