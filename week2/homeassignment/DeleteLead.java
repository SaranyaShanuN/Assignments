package week2.homeassignment;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();

		//Login
		WebElement usernameField = driver.findElement(By.id("username"));
		usernameField.sendKeys("demosalesmanager");
		WebElement passwordField = driver.findElement(By.name("PASSWORD"));
		passwordField.sendKeys("crmsfa");
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Find Lead
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		WebElement phoneNo = driver.findElement(By.name("phoneNumber"));
		phoneNo.sendKeys("9876543210");	
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		WebElement leadId = driver.findElement(By.xpath("(//a[contains(@class,'linktext')])[4]"));
		String lead = leadId.getText();
		System.out.println("Lead ID deleted: "+lead);
		leadId.click();

		//Delete Lead
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[contains(@name,\"id\")]")).sendKeys(lead);	
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement display = driver.findElement(By.xpath("//div[text()='No records to display']"));
		String displaymessage = display.getText();
		String expectedmessage = "No records to display";
		
		if (displaymessage == expectedmessage ) {
			System.out.println("Lead ID: "+lead+ "deleted successfully");	
		}
	
		//Close browser
		driver.close();		
	}
}