package week2.homeassignment;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
	// Launch Browser
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.leafground.com/radio.xhtml");
	driver.manage().window().maximize();
		
	//select the favorite browser		
	driver.findElement(By.xpath("//div[@class='col-12']/table/tbody/tr/td[2]/div/div[2]/span")).click();
	System.out.println("firefox is selected");
	Thread.sleep(2000);
	
	//select & Unselect the city and verify if the option is unselected	
	WebElement select = driver.findElement(By.xpath("//div[@class='ui-g']/div[2]/div/div[2]/span"));
	select.click();
	select.click();
	boolean selectoption =select.isSelected();
	if (selectoption == true) {
	System.out.println("Unselectable field is selected");
	}
	else
	{
		System.out.println("Unselectable field is Unselected");	
	}
	Thread.sleep(2000);
	
	//Identify the default selected radio button
	WebElement chrome = driver.findElement(By.xpath("//input[@id='j_idt87:console2:0']"));
	WebElement firefox = driver.findElement(By.xpath("//input[@id='j_idt87:console2:1']"));
	WebElement safari = driver.findElement(By.xpath("//input[@id='j_idt87:console2:2']"));
	WebElement edge = driver.findElement(By.xpath("//input[@id='j_idt87:console2:3']"));
	
	boolean defaultchrome =chrome.isSelected();
	boolean defaultfirefox =firefox.isSelected();
	boolean defaultsafari =safari.isSelected();
	boolean defaultedge =edge.isSelected();
	
	if (defaultchrome == true)
	{
		System.out.println("Default browser selected is: chrome");	
	}
	
	else if (defaultfirefox == true)
	{
		System.out.println("Default browser selected is: firefox");	
	}
	else if (defaultsafari == true)
	{
		System.out.println("Default browser selected is: safari");	
	}
	else if (defaultedge == true)
	{
		System.out.println("Default browser selected is: edge");	
	}
	else
	{
		System.out.println("No default browser selected");
	}
	
	//Check if radio button that is initially selected by default
	WebElement defaultcheck = driver.findElement(By.xpath("(//input[contains(@checked,'checked')])[5]"));
	boolean defaultconfirm = defaultcheck.isSelected();
	if (defaultconfirm == true)
	{
		System.out.println("Option is selected by default");	
	}
	else
	{
		System.out.println("Option is not selected by default");
		defaultcheck.click();
	}

	//Close browser
	driver.close();
}
}