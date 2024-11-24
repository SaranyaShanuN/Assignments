package week5.week5homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

	public class StaticParametrization extends ProjectSpecificMethodStatic{
		
		@Test
		public void tc1() {
		
			driver.findElement(By.xpath("//button[@title='App Launcher']")).click();	
			driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
			driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Legal Entities");
			driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();	
			driver.findElement(By.xpath("//div[@title='New']")).click();	
			driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Salesforces");
			WebElement status = driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input slds-input_faux')]"));
			driver.executeScript("arguments[0].click()", status);
			driver.findElement(By.xpath("//span[@title='Active']")).click();
			driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
			WebElement alertmessage = driver.findElement(By.xpath("//div[text()='Complete this field.']"));
			String message = alertmessage.getText();
			String alertMessage = message.replaceAll("^(.*\\n){1}", "");
			System.out.println(alertMessage);
			
			if(alertMessage.equalsIgnoreCase("Complete this field.")) 
			{
				System.out.println("This is a valid alert. Please enter the company name");
			}
			else
			{
				System.out.println("Not a valid alert");
			}
	}
	}
