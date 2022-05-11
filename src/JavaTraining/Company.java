package JavaTraining;

public class Company {
	
	//non Static methods and class variables are called Data members of class 
	
	// no input no return method
	
	public void test() {
		System.out.println("test method");
		int a= 20;
		System.out.println(a+30);
	}
	
	// no input and some return method
	
	public int getMarks() {
		System.out.println("Get Marks Method");
		int a= 10;
		int b = 20;
		int c= 30;
		
		int Total = a+b+c;
		
		return Total;	
	}
	
	public String getTrainerName() {
		System.out.println("Display Trainer Name method");
		String TrainerName = "Rahul";
		return TrainerName;
	}
	
	// some input and some return
	public int add(int a, int b) {
		System.out.println("Add Method");
		int sum = a+b;
		return sum;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// to call a method we need to create a Object of class
		
		Company obj = new Company();
		obj.test();
		
		int T = obj.getMarks();
		System.out.println(T);
		
		String Name = obj.getTrainerName();
		System.out.println("The Trainer name is : " + Name);
		
		int Sum = obj.add(40, 50);
           System.out.println(Sum);
	}

}
