package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement emailfield = driver.findElement(By.id("email"));
		emailfield.sendKeys("testleaf.2023@gmail.com");
		WebElement passfield = driver.findElement(By.id("pass"));
		passfield.sendKeys("Tuna@321");	
		WebElement loginbutton = driver.findElement(By.name("login"));
		loginbutton.click();
		driver.findElement(By.linkText("Find your account and log in.")).click();	
		String Title = driver.getTitle();
		System.out.print(Title);		
		driver.close();
	}

}
