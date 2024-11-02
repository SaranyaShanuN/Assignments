package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CreateLead {

		public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().window().maximize();
			
			WebElement usernameField = driver.findElement(By.id("username"));
			usernameField.sendKeys("DemoCSR");
			WebElement passwordField = driver.findElement(By.name("PASSWORD"));
			passwordField.sendKeys("crmsfa");
			WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
			loginButton.click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();	
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Saranya");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");	
			WebElement title = driver.findElement(By.id("createLeadForm_generalProfTitle"));
			title.sendKeys("Testing");
		
//		driver.findElement(By.className("smallSubmit")).click();
	
//		driver.close();
		
	}

}