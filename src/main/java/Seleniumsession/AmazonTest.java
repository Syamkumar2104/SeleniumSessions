package Seleniumsession;

public class AmazonTest {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initDriver("opera");
		//brUtil.launchUrl("null");
		brUtil.launchUrl("https://www.amazon.com");
		
		if(brUtil.isUrlFractionExist("amazon")) {
			System.out.println("Url is correct with amazon ..............Pass");
		}
		else {
			System.out.println("Fail");
		}
		if (brUtil.isInfoExistInPageSource("https://completion.amazon.com")){
			System.out.println("Page source is correct with fraction url......pass");
		} 
		else {
			System.out.println("Fail");
		}
		
		if (brUtil.getPageTitle().contains("Amazon.com. Spend less. Smile more.")) {
			System.out.println("Correct Title ....PASS");
		}
		else {
			System.out.println("Fail");
		}
		
		brUtil.quitbroswer();
		
		
		

	}

}
