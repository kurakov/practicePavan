package day16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("http://jqueryui.com/slider");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		Actions act = new Actions(driver);
		
		act.moveToElement(slider).dragAndDropBy(slider, 300, 0).perform();
		System.out.println(slider.getLocation());
		Thread.sleep(3000);
		act.moveToElement(slider).dragAndDropBy(slider, -300, 0).perform();
		System.out.println(slider.getLocation());
		Thread.sleep(3000);
		driver.close();

	}

}
