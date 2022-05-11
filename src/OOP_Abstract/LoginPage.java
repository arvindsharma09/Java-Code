package OOP_Abstract;

public class LoginPage extends Page{

	@Override
	public void title() {
		System.out.println("LP --- LoginPage Title");
		
	}

	@Override
	public void url() {
		System.out.println("LP --- HomePage url");
		
	}

	@Override
	public void timeOut() {
		System.out.println("Page timeout is in 5 seconds");
	
}
	
	public void doLogin() {
		System.out.println("App Login Method");
	}
}