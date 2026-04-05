package webDriverArctech;

public class FirefoxDriver implements WebDriver {

	public FirefoxDriver() {
		System.out.println("Lauch Firefox browser");
	}
	
	
	@Override
	public void findElement(String locator) {
	System.out.println("find the elements using :"+ locator);
		
	}
	
	@Override
	public void findElements(String locators) {
		System.out.println("find the elements using :"+ locators);
	}

	@Override
	public void get(String url) {
		System.out.println("find the elements using :"+ url);
		
		
	}

	@Override
	public String getTitle() {
		String title="Amazon home page";
		return title;
	}

	@Override
	public void click(String element) {
		System.out.println("Click on the element: " +element);
		
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("sendkey the value: "+ element + "into: "+ value);
		
	}
    @Override
	public void quit() {
		System.out.println("quit the browser");
	}

}
