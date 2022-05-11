package OOP_Abstract;

public abstract class Page {
	
	// Abstract Methods + Non Abstract methods
	// Cannot create Object of Abstract Class
	// but can create the constructor of Abstract Class
	// and this constructor will be called, when you create object of child class
	
	public Page() {
		System.out.println("Constructor --- Page Class");
	}
	
	public abstract void title();
	public abstract void url();
	
	public void timeOut() {
		System.out.println("Page timeout is in 10 seconds");
	}
	
	public final void logo() {
		System.out.println("Page Logo");
	}

}
