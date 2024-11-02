package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchbrowser {
	public static void main(String[] args) {
//		ChromeDriver cd=new ChromeDriver();
//		cd.get("https://www.google.com/");
//		EdgeDriver ed = new EdgeDriver();
//		ed.get("https://www.google.com/");
//		FirefoxDriver fd = new FirefoxDriver();
//		fd.get("https://www.google.com/");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		}

}
