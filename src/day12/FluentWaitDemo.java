package day12;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import com.google.common.base.Function;

public class FluentWaitDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		
		
		driver.get("http://google.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.RETURN);
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
			    .pollingEvery(5, TimeUnit.SECONDS)
			    .ignoring(NoSuchElementException.class);
				
		WebElement ele = wait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//h3[contains(text(), 'Selenium')]"));
			}
		});
		
		ele.click();
		
		
	}

}
