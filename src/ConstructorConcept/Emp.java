package ConstructorConcept;

public class Emp {
	
	String name;
	int age;
	String city;
	double salary;
	boolean IsCitizen;
	
	// Constructor will help us to design the object
	//Advantage- : we are restricting creation of unnecessary objects
	
	// Business Logic is always written in function, we never write business Logic in constructor
	

	public Emp(String name, int age, String city) {
		System.out.println("Emp Constructor...");
		this.name = name;
		this.age = age;
		this.city = city;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp ep = new Emp("Naveen", 10 , "Plano");
		
		System.out.println(ep.name);
		System.out.println(ep.age);
		System.out.println(ep.city);
		
		
		
	}

}
