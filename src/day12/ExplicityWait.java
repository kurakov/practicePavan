package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		
		
		driver.get("http://google.com/");
		driver.manage().window().maximize();
		
		WebDriverWait mywait=new WebDriverWait(driver,30);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.RETURN);
		
		
		WebElement ele=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(), 'Selenium')]")));
		ele.click();
		
	}

}
