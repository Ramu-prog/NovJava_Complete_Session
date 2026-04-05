package OOP_Abstract;

public abstract class Page {
	
	
	public Page () {
		System.out.println("Page___default class constructor");
	}
	
	public Page (int a) {
		System.out.println("Page ..one param const..." +a);
	}
	
	public Page (int a, int b) {
		System.out.println();
		System.out.println("Page ..one param const..." +a+b);
	}
	
	
	public abstract void title();
	public abstract void url();
	
	public void loadingTime() {
		System.out.println("Page --loading time:-10 sec");
	}
	
	public static final void logo() {
		System.out.println("Page __logo");
	}

	
	
	
	
	
	
	
}
