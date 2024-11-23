package week5.week5homeassignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase1 extends ProjectSpecificMethod{
	
	@Test
	public void tc1() {
	
		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();	
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Legal Entities");
		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();	
		driver.findElement(By.xpath("//div[@title='New']")).click();	
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Saranya");
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
}
}
