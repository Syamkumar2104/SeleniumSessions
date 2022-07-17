package Seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHYAM\\eclipse-workspace\\April2022SeleniumSessions\\Browsers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		String title = driver.getTitle();
		System.out.println("Title of the page is :" + title);
		
		driver.quit();

	}

}
