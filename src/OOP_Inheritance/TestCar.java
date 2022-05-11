package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BMW b = new BMW();
		b.Start(); // overridden Method
		b.Stop(); // Inherited Method
		b.Refuel(); // Inherited Method
		b.AutoParking();// Individual Method

		BMW.Speed();
		Car.Speed();

		// Top Casting : whenever child class object is referred by parent class Reference variable
		// Reference type check : 

		Car c1 = new BMW();
         
	}

}
