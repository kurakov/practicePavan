package Day9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/denyskurakov/Drivers/chromedriver");
		WebDriver driver=new ChromeDriver();//ChromeDriver driver=new ChromeDriver(); //Lauch chrome browser
		
		//2) Open URL  https://opensource-demo.orangehrmlive.com/
				driver.get("https://opensource-demo.orangehrmlive.com/");
	}

}
