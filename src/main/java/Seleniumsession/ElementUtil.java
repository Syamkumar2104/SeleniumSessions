package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	
	private WebDriver driver;
	
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	public By getBy(String locatorType, String selector) {
		By locator = null;
		
		switch(locatorType.toLowerCase()) {
		case "id":
			locator = By.id(selector);
			break;
		case "name":
			locator = By.name(selector);
			break;
		case "class":
			locator = By.className(selector);
			break;
		case "xpath":
			locator = By.xpath(selector);
			break;
		case "cssselector":
			locator = By.cssSelector(selector);
			break;	
			
		default:
			break;
						
		}
		return locator;
		
	}
	
	public void dosendkeys(String locatorType,String selector, String value) {
		By locator = getBy(locatorType,selector);
		getElement(locator).sendKeys(value);
	}
	public void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	public void doClick(String locatorType, String selector) {
		By locator = getBy(locatorType, selector);
		getElement(locator).click();
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	

}
