package JavaTraining;

import java.util.ArrayList;

public class ArraysListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Object> ar = new ArrayList <Object>();
		
		ar.add(100);
		ar.add(200);
		ar.add("Selenium");
		ar.add('f');
		ar.add(false);
		
		System.out.println(ar.get(2));
		
		System.out.println(ar.size());
		
       // to fetch all the values of ArrayList
		
		for(int i= 0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
  		System.out.println("*********************************");
		// for each loop
		
		for(Object e : ar) {
			System.out.println(e);
		}
		
		
		
	}

}
