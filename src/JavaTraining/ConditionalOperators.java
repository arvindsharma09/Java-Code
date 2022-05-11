package JavaTraining;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 20;
		int b= 30;
		
		if(b>a) {
			System.out.println("B is Greater number");
		}
		else {
			System.out.println("A is Greater number");
		}
		
		int x= 100;
		int y = 200;
		int z= 300;
		
		if(x>y && x>z) {
			System.out.println("X is the Greatest Number");
		}
		else if(y>z) {
			System.out.println("Y is the Greatest Number");
		}
		else{
			System.out.println("Z is the Greatest Number");
		}
		

		String browser = "Chrome";
	    if (browser.equalsIgnoreCase("Chrome")) {
		System.out.println("Open Chrome Browser");
	  }
	    else if (browser.equalsIgnoreCase("Firefox")) {
	    System.out.println("Open Firefox Browser");
	    }
	    else if (browser.equalsIgnoreCase("Opera")) {
	    System.out.println("Open Opera Browser");
	    }
	    else {
	    	System.out.println("Please Provide the correct Browser: " + browser);
	    }
	    
	    
	    
	}

}
