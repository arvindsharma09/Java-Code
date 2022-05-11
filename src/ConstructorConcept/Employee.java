package ConstructorConcept;

public class Employee {
	
	String name;
	int age;
	String city;
	double salary;
	boolean IsCitizen;
	
	// Constructor : - Constructor name is same as the class name
	// constructor looks like function, but not a function
	// constructor cannot return anything... no return type
	//constructor overloading is possible
	// Constructor will be called when we create the object of the class
	// but function is called when we create the object of the class and use object reference variable
	
	public Employee() {
		System.out.println("zero Parameter default constructor");
	}
	
	public Employee(int a) {
	System.out.println("one Parameter Constructor");	
	}
	
	public Employee(int a, int b) {
		System.out.println("Two Parameter Constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee obj = new Employee();
		
		
	}

}
