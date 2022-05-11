package JavaTraining;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String browser = "Firefox";
		
		switch (browser) {
		case "chrome":
		System.out.println("Open Chrome Browser");	
		break;
		
		case "Opera":
		System.out.println("Open Opera Browser");	
		break;
			
		case "Firefox":
		System.out.println("Open Firefox Browser");	
		break;

		default:
			System.out.println("Please provide the Correct browser" + browser);
			break;
		}
		
		// Environment Selection
		
		String env= "ST";
		
		switch (env) {
		case "ST":
			System.out.println("Run Test Cases in ST Environment");
			break;
		case "dev":
			System.out.println("Run Test Cases in Dev Environment");
			break;
		case "CT":
			System.out.println("Run Test Cases in CT Environment");
			break;
		case "Prod":
			System.out.println("Run Test Cases in Prod Environment");
			break;
			
		default:
			System.out.println("Please provide the correct env : " + env);
			break;
		}
		
		// User Permission -- Admin, Super Admin, Customer, Seller, Client
		
		String role = "Admin";
		
		switch (role) {
		case "Super Admin":
			System.out.println("Give all the Persmissions");
			break;
		case "Admin":
			System.out.println("Give Admin based Persmissions only");
			break;
		case "Customer":
			System.out.println("Give permissions to buy products");
			break;
		case "vendor":
			System.out.println("Give permission to sell products");
			break;

		default:
			System.out.println("Please provide correct role : " + role);
			break;
		}
		
		
		}
		
		}
		
	
