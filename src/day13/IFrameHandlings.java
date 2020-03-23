package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IFrameHandlings {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://selenium.dev/selenium/docs/api/java/index");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("WebDriver")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("/html/body/div[1]/ul/li[6]/a")).click();
		driver.switchTo().defaultContent();
		
		
	}

}
