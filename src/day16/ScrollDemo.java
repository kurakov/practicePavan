package day16;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//approach # 1 scroll down page by pixel
//		js.executeScript("window.scrollBy(0,5000)", "");//window.scrollBy - constant
//		Long value=(Long)js.executeScript("return window.pageYOffset;");
//		System.out.println(value);
		
		//2. scroll down page till the element is visible
//		WebElement flag=driver.findElement(By.xpath("//div[78]//div[1]//a[1]//img[1]"));
//		js.executeScript("arguments[0].scrollIntoView()", flag);
		
		//3. scroll down till end of page
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Long value=(Long)js.executeScript("return window.pageYOffset;");
		System.out.println(value);
		
		//4. for to initial point
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		value=(Long)js.executeScript("return window.pageYOffset;");
		System.out.println(value);
		Thread.sleep(3000);
		driver.close();
	}

}
