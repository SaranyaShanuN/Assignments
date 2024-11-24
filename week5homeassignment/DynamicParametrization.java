package week5.week5homeassignment;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DynamicParametrization extends ProjectSpecificMethod{
@Test(dataProvider ="sendData")
	public void tc1(String companyname) {
	
		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();	
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Legal Entities");
		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();	
		driver.findElement(By.xpath("//div[@title='New']")).click();	
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(companyname);
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
}
	
	@DataProvider(name ="sendData")
	public String[][] sendData()
	{
		String[][] data = new String[1][1];	
		data[0][0] ="Tester1";
		return data;
	}
}
