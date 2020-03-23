package day16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizableDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://jqueryui.com/resizable/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		WebElement corner = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		Actions act = new Actions(driver);
		
		act.moveToElement(corner).dragAndDropBy(corner, 400,-30).perform();
		System.out.println(corner.getLocation());
		Thread.sleep(3000);
		act.moveToElement(corner).dragAndDropBy(corner, -300, 0).perform();
		System.out.println(corner.getLocation());
		Thread.sleep(3000);
		driver.close();
	}

}
