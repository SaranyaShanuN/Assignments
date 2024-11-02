package week2.homeassignment;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Select the options
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		Thread.sleep(2000);
		System.out.println("Basic Checkbox is selected");
		
		//Notification Checkbox
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		Thread.sleep(5000);
		WebElement notification =driver.findElement(By.className("ui-growl-title"));
		String titletext= notification.getText();
		System.out.println("Notification checkbox status is "+titletext);
		Thread.sleep(2000);
		
		//Fav language
		WebElement language = driver.findElement(By.xpath("//label[text()='Python']"));
		language.click();
		String languageselected =language.getText();
		System.out.println("Language selected is "+languageselected);
		Thread.sleep(2000);
		
		//TriState option
		driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']//div)[2]")).click();	
		System.out.println("TriState Checkbox is selected");
		Thread.sleep(2000);
		
		//Toggle Switch
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		Thread.sleep(2000);
		WebElement message =driver.findElement(By.className("ui-growl-title"));
		String Toggleswitch = message.getText();
		System.out.println("Toggle Switch status is "+Toggleswitch);
		
		//Check box status check
		Thread.sleep(2000);
		WebElement status = driver.findElement(By.xpath("//span[@class='ui-chkbox-label ui-state-disabled']"));
		String checkboxstatus = status.getText();
		System.out.println("Checkbox is "+checkboxstatus);	
		Thread.sleep(2000);
				
		//Multiple city selection
//		WebElement cityDD = driver.findElement(By.xpath("//li/div/div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-hover']"));
//		Select cityDW = new Select(cityDD);
//		cityDW.selectByVisibleText("London");
		
//		WebElement city = driver.findElement(By.xpath("//ul[@data-label='Cities']"));
//		city.click();
//		WebElement london = (WebElement) driver.findElements(By.xpath("//li[@data-item-value='London']"));
//		london.click();
		
		
//		WebElement cityWB = driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']"));
//		WebElement cityWB = driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-multiple ui-selectcheckboxmenu ui-widget ui-state-default ui-corner-all']"));
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Filter Input']")).sendKeys("Miami");
		driver.findElement(By.xpath("//input[@aria-label='Select All'and@type='checkbox']/following::div")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
		System.out.println("City selected is Miami");
		
//		WebElement cityWB = driver.findElement(By.xpath("//ul[@data-label='Cities']"));
//		cityWB.click();
//		Select cityDD = new Select(cityWB);
//		cityDD.selectByVisibleText("London");
	
		//Close browser
		driver.close();
}
}
