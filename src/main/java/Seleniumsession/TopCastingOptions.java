package Seleniumsession;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		
		//1.cross browser
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver1 = new FirefoxDriver();
		
		//2.cannot do cross browser,chrome specfic
		//ChromeDriver d1 = new ChromeDriver();
		
		//3.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHYAM\\eclipse-workspace\\April2022SeleniumSessions\\Browsers\\chromedriver.exe");
		RemoteWebDriver d2 = new ChromeDriver();
		d2.get("https://www.google.com");
		
		
		//4.Webdriver --  remote Webdriver
		//WebDriver driver  = new RemoteWebDriver(remoteAddress, capabilites);
		
		//5. SC --- CD valid topcasting, but not applicable 
	    SearchContext driver = new ChromeDriver();
	    driver.equals(driver);
	    
		d2.quit();
	}

}
