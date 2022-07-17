package Seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	private WebDriver driver;
	
	/**
	 * This method is used to initialize the driver on the basis of give name
	 * @param browserName
	 * @return this returns driver
	 */
	public WebDriver initDriver(String browserName) {
		
		System.out.println("Broswer name is:" + browserName);
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();			
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		else {
			System.out.println("Please pass the right browser: " + browserName);
		}
		
		return driver;
	}
	
	public void launchUrl(String url) {
		if(url == null){
			System.out.println("url is Null");
			return;
		}
		if(url.indexOf("http") == -1) {
			System.out.println("url is not valid");
			return;
		}
		if(url.indexOf("https") == -1) {
			System.out.println("url is not valid");
			return;
		}
		driver.get(url);
	}
	
	/**
	 * this method is used to return the page title
	 * @return
	 */
	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("page title is:" + title);
		return title;
	}
	
	public String getPageUrl() {
		String currenttitle = driver.getCurrentUrl();
		System.out.println("page title is:" + currenttitle);
		return currenttitle;
	}
	
	public boolean isUrlFractionExist(String urlFraction) {
		if(getPageUrl().contains(urlFraction)) {
			return true;
		}
		return false;
	}
	public String getPageSource() {
		String pageSource = driver.getPageSource();
		//System.out.println("pageSource is :" + pageSource);
		return pageSource;
		
	}
	
	public boolean isInfoExistInPageSource(String info) {
		if(getPageSource().contains(info)) {
			return true;
		}
		return false;
	}
	
	public void closebroswer() {
		driver.close();
	}
	
	public void quitbroswer() {
		driver.quit();
	}
}
