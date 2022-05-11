package JavaTraining;

public class Employee {
	
	String name;
	int age;
	String City;
	char gender;
	boolean IsActive;
	float Salary;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		
		emp.name= "Arvind";
		emp.age= 30;
		emp.City= "Plano";
		emp.gender='M';
		emp.IsActive = true;
		
		System.out.println(emp.name + " " + emp.City);
		
		// no reference Object
		
		new Employee().name = "TOM";
		
		
		Employee emp1 = new Employee();

		emp1.name = "Peter";
		emp1.City = "Hoshiarpur";
		
		System.out.println(emp1.City);
		
		emp1 = null;
				
		//System.out.println(emp1.City);		// null pointer Exception
		
		
	}

}
