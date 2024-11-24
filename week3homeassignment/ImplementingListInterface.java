package week3.week3homeassignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplementingListInterface {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://ajio.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search Ajio']")).sendKeys("Bags");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		Thread.sleep(5000);
		WebElement count = driver.findElement(By.xpath("//div[@class=' filter-container']/div/div"));
		String totalcount = count.getText();
		System.out.println(totalcount);
		

		List<WebElement> allbrand = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println("Brands available are:");	
		for(int i=0; i<allbrand.size()-1; i++) {
		String brandText =allbrand.get(i).getText();
		System.out.print(brandText+"  ");	
		
		List<WebElement> allbagname = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println("Bag names available are:");	
		for(int j=0; j<allbagname.size()-1; j++) {
		String nameText =allbagname.get(i).getText();
		System.out.print(nameText+"  ");	
		}
	}
	}
}
