package day16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnteringText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		//1)Using sendKeys();
		//driver.findElement(By.id("tstUsername")).sendKeys("Admin");

		//2)JavascriptExecutor1
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		WebElement txtbox = driver.findElement(By.id("txtUsername"));
//		js.executeScript("arguments[0].value='Admin';", txtbox);
		
		//3)Using JavascriptExecutor2
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('txtUsername').value='Admin';");
		
		Thread.sleep(3000);
		driver.close();
	}

}
