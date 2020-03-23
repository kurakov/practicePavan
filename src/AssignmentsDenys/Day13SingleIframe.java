package AssignmentsDenys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day13SingleIframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Single Iframe')]")).click();
		
		driver.switchTo().frame("SingleFrame");
		driver.findElement(By.cssSelector("body > section > div > div > div > input[type=text]")).sendKeys("Hello MOON!!!");
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		driver.close();

	}

}
