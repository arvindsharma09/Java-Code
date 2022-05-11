package JavaTraining;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "Hello";
		String y = "Testing";
		
		int a= 100;
		int b = 200;
		
		System.out.println(x+y);
		System.out.println(a+b);
		
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+ (a+b));
		
		
		System.out.println("The Value of a is :" + a);
		System.out.println("The Value of b is :" + b);
		
		System.out.println("Total Sum is:" + (a+b));
		
		char t1 = 'a';
		char t2 = 'b';
		
		System.out.println(t1+t2);
		System.out.println(t1);
		
		//System.out.println(9/0);
		
		//System.out.println(0/0);
		
		String st1 ="Hello";
		String st2 = "Hello";
		
		if(st1.equalsIgnoreCase(st2)) {
			
			System.out.println("Both the Strings are same");
		}
		
	}

}
