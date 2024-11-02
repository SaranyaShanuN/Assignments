package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

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
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");	
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Saranya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		
		WebElement SourceWB = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select SourceDD = new Select(SourceWB);
		SourceDD.selectByIndex(4);
		
		WebElement MarketingWB = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select MarketingDD = new Select(MarketingWB);
		MarketingDD.selectByVisibleText("Automobile");
		
		WebElement OwnershipWB = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select OwnershipDD = new Select(OwnershipWB);
		OwnershipDD.selectByValue("OWN_CCORP");
	
//		driver.findElement(By.className("smallSubmit")).click();
		
//		String title = driver.getTitle();
//		System.out.println(title);
	
//		driver.close();		
	}

}