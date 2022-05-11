package JavaTraining;

import java.util.ArrayList;

public class Car {
	
	/**
	 * This Method is used to book the car on the basis of given car type
	 * @param Car
	 * @return
	 */
	public ArrayList<String> booking (String Car) {
		System.out.println("car Type : " + Car);
		
		ArrayList<String> carList = new ArrayList<String>();
		
		if(Car.equalsIgnoreCase("Sedan")) {
			carList.add("Honda");
			carList.add("Civic");
			carList.add("Tata Indigo");	
		}
		
		else if(Car.equalsIgnoreCase("SUV")){
			carList.add("Range Rover");
			carList.add("Mahindra 700");		
		}
		
		else if(Car.equalsIgnoreCase("Mini")) {
			carList.add("Cooper");
			carList.add("Swift");
		}
		else {
			System.out.println("This car type is not available :" + Car);
		}	
		return carList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car c = new Car();
		ArrayList<String> SuvList = c.booking("SUV");
		
		System.out.println(SuvList);

	}

}
