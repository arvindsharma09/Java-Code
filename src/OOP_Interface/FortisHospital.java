package OOP_Interface;

public class FortisHospital implements USMedical, UKMedical, IndiaMedical {

	// US
	@Override
	public void physioService() {
		System.out.println("Fortis --- physioService");

	}

	@Override
	public void cardioService() {
		System.out.println("Fortis --- cardioService");

	}

	@Override
	public void entService() {
		System.out.println("Fortis --- entService");

	}

	// UK
	@Override
	public void oncologyService() {
		System.out.println("Fortis ---oncologyService");

	}

	@Override
	public void pediaService() {
		System.out.println("Fortis --- pediaService ");

	}

// India Medical
	@Override
	public void dentalService() {
		System.out.println("Fortis --- dentalService");

	}

	@Override
	public void neuroService() {
		System.out.println("Fortis --- neuroService");

	}

	@Override
	public void emergencyService() {
		System.out.println("Fortis --- emergency");

	}

// Fortis Hospital Individual Methods
	public void optService() {
		System.out.println("Fortis --- optService");
	}

	public void medicalInsurance() {
		System.out.println("Fortis --- medicalInsurance");
	}

	
	
	
}
