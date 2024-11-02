package week2.homeassignment;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		// Login		
		WebElement usernameField = driver.findElement(By.id("username"));
		usernameField.sendKeys("DemoCSR");
		WebElement passwordField = driver.findElement(By.name("PASSWORD"));
		passwordField.sendKeys("crmsfa");
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Create Lead
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();	
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");	
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Leaf");
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("TestLocal");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Create Lead Description");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sara@gmail.com");
		WebElement stateDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateDW = new Select(stateDD);
		stateDW.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		// Edit Lead
		driver.findElement(By.xpath("//a[contains(@href,'updateLeadForm')]")).click();		
		WebElement editDescription = driver.findElement(By.id("updateLeadForm_description"));
		editDescription.clear();
		editDescription.sendKeys("Edit Lead Description");
		driver.findElement(By.name("importantNote")).sendKeys("Important Notes");	
		driver.findElement(By.className("smallSubmit")).click();		
		
		//Get the title & Print
		String title = driver.getTitle();
		System.out.println(title);	
		
		//Close the browser
		driver.close();
		
	}

}