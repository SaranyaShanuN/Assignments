package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumSetup {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		EdgeDriver ed = new EdgeDriver();
		ed.get("http://leaftaps.com/opentaps/control/main");
		FirefoxDriver fd = new FirefoxDriver();
		fd.get("http://leaftaps.com/opentaps/control/main");
		}

}
