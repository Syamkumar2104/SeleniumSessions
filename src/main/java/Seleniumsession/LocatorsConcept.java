package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//Webelement + actions(clicks,sendkeys,gettext,isDisplayes..)
		
		//1.id Locator
		//1st Approch
//		driver.findElement(By.id("input-email")).sendKeys("syamkuamrjerra@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("123456");
		
		//2nd Approch
//		WebElement emailID = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		emailID.sendKeys("syamkuamrjerra@gmail.com");
//		password.sendKeys("123456");
		
		//3r Approch -- By locator : Object Repository(OR)
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		WebElement emailele = driver.findElement(emailId);
//		WebElement pwdele = driver.findElement(password);
//		
//		emailele.sendKeys("syamkuamrjerra@gmail.com");
//		pwdele.sendKeys("1234");
		
		//4.By locator + generic fuction
//		By emaiID = By.id("input-email");
//		By password = By.id("input-password");
//		getElement(emaiID).sendKeys("syamkuamrjerra@gmail.com");
//		getElement(password).sendKeys("12345");
		
		
		//5.By Locator + generci Funtions for element and actions
//		By emaiID = By.id("input-email");
//		By password = By.id("input-password");
//		
//		dosendkeys(emaiID,"syamkuamr@gmail.com");
//		dosendkeys(password,"1234");
		
		//6. By locator + generic function for element and actions in some util class
//		By emaiID = By.id("input-email");
//		By password = By.id("input-password");
//		
//		ElementUtil eleutil = new ElementUtil(driver);
//		eleutil.doSendkeys(emaiID, "syamkuamrjerra@gmail.com");
//		eleutil.doSendkeys(password, "1233444");
		
		//7.Utils in different class
		//8.String locators + generic functions for element and actions in som util class
		String email_id = "input-email";
		String password_id = "input-password";
		
		By email = By.id(email_id);
		By password = By.id(password_id);
		
//		dosendkeys(email,"syamkuamr@gmail.com");
//		dosendkeys(password,"1234");
		
		dosendkeys("by",email_id,"syamkuamr@gmail.com");
		dosendkeys("by",password_id,"1234");
	}
	
	public static By getBy(String locatorType, String selector) {
//		By locator = By.id(selector);
//		return locator;
		
		By locator = null;
		
		switch(locatorType.toLowerCase()) {
		case "id":
			locator = By.id(selector);
			break;
			
		default:
			break;
						
		}
		return locator;
		
	}
	
	public static void dosendkeys(String locatorType,String selector, String value) {
		By locator = getBy(locatorType,selector);
		getElement(locator).sendKeys(value);
	}
	
	public static void dosendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	

}
