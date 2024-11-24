package week3.week3homeassignment;

public class LoginTestData extends Testdata {
	
	public void enterUsername() {
		System.out.println("Enter User name");
	}

	public void enterPassword() {
		System.out.println("Enter Password");
	}

	public static void main(String[] args) {
		LoginTestData unamepass = new LoginTestData();
		unamepass.enterCredentials();
		unamepass.navigateToHomePage();
		unamepass.enterUsername();
		unamepass.enterPassword();

	}

}
