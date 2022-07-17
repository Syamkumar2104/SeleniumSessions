package Seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//WebDriver driver = new WebDriver();
		//TopCasting the chromDriver
		//Start the server with binary /,exe file
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHYAM\\eclipse-workspace\\April2022SeleniumSessions\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		//driver.get("https://www.google.com"); // enter url
		//driver.get("www.google.com"); // enter url  Exception in thread "main" org.openqa.selenium.InvalidArgumentException: invalid argument
		//(Session info: chrome=103.0.5060.114)
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("Title of the page is :" + title);
		
		
		//Verification point/checkpoint/assertion/actual vsp expected result
		if(title.equals("Google")){
			System.out.println("Title is correct");
		}
			
		else {
				System.out.println("Incorrect title");
			}
		
		
		String Currecturl = driver.getCurrentUrl();
		System.out.println("Current url:" + Currecturl);
	    
		
		//String Source = driver.getPageSource();
		//		System.out.println(Source);
		
		driver.quit();
	}
	
}
