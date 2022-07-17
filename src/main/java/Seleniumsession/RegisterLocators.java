package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterLocators {
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	 
	    //1,Approch
	    
//	    driver.findElement(By.id("input-firstname")).sendKeys("Jerra");
//	    driver.findElement(By.id("input-lastname")).sendKeys("Syamkumar");
//	    driver.findElement(By.id("input-email")).sendKeys("syamkumar2104@gmail.com");
//	    driver.findElement(By.id("input-telephone")).sendKeys("98526413");
//	    driver.findElement(By.id("input-password")).sendKeys("1234");
//	    driver.findElement(By.id("input-confirm")).sendKeys("1234");
	    
	    //2.Aproach
	    
//	    WebElement fsname = driver.findElement(By.id("input-firstname"));
//	    WebElement lsname = driver.findElement(By.id("input-lastname"));
//	    WebElement emailID = driver.findElement(By.id("input-email"));
//	    WebElement telnum = driver.findElement(By.id("input-telephone"));
//	    WebElement password = driver.findElement(By.id("input-password"));
//	    WebElement confpass = driver.findElement(By.id("input-confirm"));
//	    
//	    fsname.sendKeys("Jerra");
//        lsname.sendKeys("Syamkumar");
//        emailID.sendKeys("syamkumar@gmail.com");
//        telnum.sendKeys("985264317");
//        password.sendKeys("1234");
//        confpass.sendKeys("1234");
	    
	    //3rd Approch by locator
        By fsname = By.id("input-firstname");
        By lsname = By.id("input-lastname");
        By emailID = By.id("input-email");
        By telnum = By.id("input-telephone");
        By password = By.id("input-password");
        By confpasss = By.id("input-confirm");
        
        WebElement fsnameele = driver.findElement(fsname);
        WebElement lsnameele = driver.findElement(lsname);
        WebElement emailIDele = driver.findElement(emailID);
        WebElement telnumele = driver.findElement(telnum);
        WebElement passwordele = driver.findElement(password);
        WebElement confpassele = driver.findElement(confpasss);
        
        fsnameele.sendKeys("jerra");
        lsnameele.sendKeys("syamkumar");
        emailIDele.sendKeys("syamkumar@gmail.omc");
        telnumele.sendKeys("456789123");
        passwordele.sendKeys("1234");
        confpassele.sendKeys("1234");
        
	}

}
