package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FortisHospital fh = new FortisHospital();
		
		fh.physioService();
		fh.cardioService();
		fh.entService();
		fh.oncologyService();
		fh.pediaService();
		fh.dentalService();
		fh.neuroService();
		fh.emergencyService();
		
		System.out.println(USMedical.min_fees);
		
		//Top casting
		// child class object can be referred by parent interface reference variable
		
		USMedical us = new FortisHospital();
		
		
		

	}

}
