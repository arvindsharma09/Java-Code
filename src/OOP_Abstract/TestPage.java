package OOP_Abstract;

public class TestPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HomePage hp = new HomePage();
		hp.title();
		hp.url();
		hp.timeOut();
		hp.logo();
		
		
		LoginPage lp = new LoginPage();
		lp.title();
		lp.url();
		lp.timeOut();
		lp.logo();
		lp.doLogin();
		
		
		
		
		
		
	}

}
