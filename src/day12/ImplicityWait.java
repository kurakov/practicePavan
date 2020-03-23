package day12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicityWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//implicit wait
		
		driver.get("http://google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.RETURN);//pressing Return key on your keyboard
		
		//driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click();
		
//		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//h3[contains(text(), 'Selenium')]")).click();
		
		
	}

}
 