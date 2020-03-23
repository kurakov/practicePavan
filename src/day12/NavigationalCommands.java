package day12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://snapdeal.com/");//this command wait till all the elements loaded on the page
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		driver.navigate().to("http://amazon.com/");//this command will not wait till all elements loaded on the page
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		driver.navigate().back();//snapdeal
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		driver.navigate().forward();//aamzon
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();

	}

}
