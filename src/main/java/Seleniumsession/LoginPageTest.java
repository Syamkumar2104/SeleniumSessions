package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver("chrome");
		
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(brUtil.getPageUrl());
		System.out.println(brUtil.getPageTitle());
		
		By emaiID = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		
		ElementUtil eleutil = new ElementUtil(driver);
		eleutil.doSendkeys(emaiID, "syamkuamrjerra@gmail.com");
		eleutil.doSendkeys(password, "1233444");
		eleutil.doClick(loginBtn);
		
		brUtil.quitbroswer();

	}

}
