package week3.week3homeassignment;

public class Testdata {
	
	public void enterCredentials() {
		System.out.println("Enter Credentials");	
	}
	
	public void navigateToHomePage() {
		System.out.println("Navigate to Home Page");	
	}

	public static void main(String[] args) {
		Testdata credentials = new Testdata();	
		credentials.enterCredentials();
		credentials.navigateToHomePage();
	}
}
