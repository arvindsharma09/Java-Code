package JavaTraining;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S = "This is my Java Code";

		System.out.println(S.length());

		System.out.println(S.charAt(0));
		//System.out.println(S.charAt(-1));

		System.out.println(S.indexOf("h"));
	
		String msg = "Welcome Admin";
		if(msg.indexOf("Admin")>0) {
			System.out.println("Message displayed is correct");
		}
		else {
			System.out.println("Message displayed is not Correct");
		}
		
		// trim
		String S1 = "    Hello Selenium    ";
		System.out.println(S1.trim());
		
		String S2 = "Hello Testing";
		System.out.println(S2.replace(" ", ""));
		
		String S3 = "this is selenium code";
		System.out.println(S3.toUpperCase());
		
		// equals
		
		String t1 = "hello google";
		String t2 = "hello google";
		
		if(t1.equals(t2)) {
			System.out.println("Two Strings are equal");
		}
		else {
			System.out.println("Two Strings are not equal");
		}
		
		// Contains Method
		
		// Split Method
		
		// Reverse the String
		
		String str = "Selenium";
		
		int len = str.length();
		System.out.println(len);
		
		String rev = "";
		
		for(int i= len-1;i>=0;i--) {
			rev= rev+ str.charAt(i);
		}
		System.out.println(rev);
		
		String s= "SeleniumTestAutomation";
		
		char c[]= s.toCharArray();
		
		for(int i=c.length-1;i>=0;i--) {
			System.out.println(c[i]);
		}
		
	}

}