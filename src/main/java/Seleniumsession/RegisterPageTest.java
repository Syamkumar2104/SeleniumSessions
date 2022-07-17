package Seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPageTest {

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver("chrome");
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		System.out.println(brUtil.getPageUrl());
		System.out.println(brUtil.getPageTitle());

		By fsname = By.id("input-firstname");
	    By lsname = By.id("input-lastname");
	    By emailID = By.id("input-email");
	    By telnum = By.id("input-telephone");
	    By password = By.id("input-password");
	    By confpasss = By.id("input-confirm");
		
		
	    ElementUtil eleutil = new ElementUtil(driver);
	    eleutil.doSendkeys(fsname, "jerra");
	    eleutil.doSendkeys(lsname, "Syamkumar");
	    eleutil.doSendkeys(emailID, "syamkuamrjerra@gmail.com");
	    eleutil.doSendkeys(telnum, "564513567");
		eleutil.doSendkeys(password, "1233444");
		eleutil.doSendkeys(confpasss, "123444");
		
		
		brUtil.quitbroswer();
	}

}
