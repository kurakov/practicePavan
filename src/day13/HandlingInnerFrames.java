package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingInnerFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		Thread.sleep(2000);
		
		WebElement outerframe = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		driver.switchTo().frame(outerframe);
		Thread.sleep(3000);
		
		WebElement innerframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(innerframe);
		
		driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input")).sendKeys("Hello Moon!");

	}

}
