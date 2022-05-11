package OOP_Inheritance;

public class BMW extends Car{

	// Method Overriding :
	//When you have a method in parent class as well as in child class
	//with the same name 
	// and same number of parameters
	// and same return type
	// Static and private methods can not be overridden
	
	@Override
	public void Start() {
		System.out.println("BMW --- Start Method");
	}
	
	public void AutoParking() {
		System.out.println("BMW --- AutoParking Method");
	}
	
	// Method Hiding : if we have static method in Parents class and same method is available in child class , this 
	// concept is called Method Hiding
	public static void Speed() {
		System.out.println("BMW ---- Speed Method");
	}
	
	
}
