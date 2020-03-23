package AssignmentsDenys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day13Iframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		driver.switchTo().frame(0);
		driver.findElement(By.name("RESULT_TextField-1")).sendKeys("Denys");
		driver.findElement(By.name("RESULT_TextField-2")).sendKeys("Kurakov");
		driver.findElement(By.name("RESULT_TextField-3")).sendKeys("+14094573695");
		driver.findElement(By.name("RESULT_TextField-4")).sendKeys("USA");
		driver.findElement(By.name("RESULT_TextField-5")).sendKeys("Brooklyn");
		driver.findElement(By.name("RESULT_TextField-6")).sendKeys("denysdensy@denys.com");
		
		WebElement rdButton = driver.findElement(By.cssSelector("#q26 > table > tbody > tr:nth-child(1) > td > label"));
		rdButton.click();
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.close();
	}

}
