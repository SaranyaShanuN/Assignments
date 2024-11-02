package week2.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonInteraction {

	public static void main(String[] args) throws InterruptedException {

		// Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Confirm if the button is disabled.
//		boolean status = driver.findElement(By.xpath("//div[@class='card']//button//span[text()='Disabled']")).isEnabled();
//		if (status == true) {
//			System.out.println("Checkbox is enabled");
//		}
//		else
//		{
//			System.out.println("Checkbox is Disabled");
//		}
		
		//Confirm if the button is disabled.
		WebElement status = driver.findElement(By.xpath("//div[@class='card']//button//span[text()='Disabled']"));
		String disablestatus = status.getText();
		System.out.println("Checkbox is: "+disablestatus);	
		Thread.sleep(2000);
		
		//Find the position of the Submit button
		WebElement position = driver.findElement(By.xpath("(//div[@class='card']//button//span[text()='Submit'])[1]"));
		Point location = position.getLocation();
		System.out.println("Position of the button is: "+location);
		
		//Background color of the button
		WebElement color = driver.findElement(By.xpath("(//div[@class='card']//button//span[text()='Save'])[1]"));
		String buttoncolor =color.getCssValue("color");
		System.out.println("Background color of the button is: "+buttoncolor);
				
		//Height and Width of the button
		WebElement height = driver.findElement(By.xpath("(//div[@class='card']//button//span[text()='Submit'])[2]"));
		Dimension heightwidth =color.getSize();
		System.out.println("Height and Width of the button: "+heightwidth);
			
		// Click on ‘Click and Confirm title.’
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		
		driver.close();		
	}

}
