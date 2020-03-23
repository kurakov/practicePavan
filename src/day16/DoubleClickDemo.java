package day16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("http://testautomationpractice.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
		Actions act = new Actions(driver);
		act.doubleClick(button).perform();
		Thread.sleep(3000);
		
		driver.close();
	}

}
