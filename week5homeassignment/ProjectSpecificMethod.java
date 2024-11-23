package week5.week5homeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
	
	public ChromeDriver driver;
	
	@BeforeMethod
	public void precondition() {
	driver = new ChromeDriver();
	driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();	
	WebElement usernameField = driver.findElement(By.id("username"));
	usernameField.sendKeys("dilip@testleaf.com");
	WebElement passwordField = driver.findElement(By.id("password"));
	passwordField.sendKeys("leaf@2024");
	WebElement loginButton = driver.findElement(By.id("Login"));
	loginButton.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void postcondition() {
		driver.close();
	}

}
