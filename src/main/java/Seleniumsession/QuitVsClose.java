package Seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHYAM\\eclipse-workspace\\April2022SeleniumSessions\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		String title = driver.getTitle();
		System.out.println("Title of the page is :" + title);
		
		//driver.quit();
		
		//String title1 = driver.getTitle(); //Exception in thread "main" org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		//driver = new ChromeDriver();  //Same Session ID after driver.quit()
		//driver.get("https://www.google.com");//Same Session ID
		//String title1 = driver.getTitle(); //Same Session ID
		
		driver.close();// Same session id as above fro close as well.
		//String title1 = driver.getTitle(); //Exception in thread "main" org.openqa.selenium.NoSuchSessionException: invalid session id fro dirver.close
		
		
		
		//quit -- cloase all the broswers
		//close --  close only specific browser
		driver = new ChromeDriver(); //Session id will be different when using close()
		driver.get("https://naveenautomationlabs.com/opencart/"); //Session id will be different when using close() 
		String title1 = driver.getTitle();//session id remains same but it is invalid
		System.out.println("Title of the page is :" + title); //session id will be same but invalid or expired

	}

}
