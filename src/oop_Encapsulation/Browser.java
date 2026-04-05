package oop_Encapsulation;

public class Browser {
	
	//Achieving the encapsulation with private and public method
	
public void launcBrowser() {
	System.out.println("Lauch browser...");
	checkBrowserVersion();
	checkOSCompatibility();
	checkOSCompatibility();
	checkBrowserIsUpgraded();
	checkRAMAvailable();
	System.out.println("chrome browser lauch successfully");
}
	
private void checkBrowserVersion() {
	System.out.println("Check browserversion");
	
}
private void checkOSCompatibility() {
	System.out.println("Check checkOSCompatibility");
	
}
private void checkBrowserIsUpgraded() {
	System.out.println("Check checkBrowserIsUpgraded");
	
}
private void checkRAMAvailable() {
	System.out.println("Check RAMAvailable");
	
}
}
