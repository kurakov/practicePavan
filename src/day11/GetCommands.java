package day11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		System.out.println("Title of the web page: "+driver.getTitle());
		System.out.println("url of the web page is: "+driver.getCurrentUrl());
		
		
		System.out.println(driver.getPageSource());
		
		driver.close();
		
	}

}
