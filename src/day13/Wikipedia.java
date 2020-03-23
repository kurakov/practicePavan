package day13;


import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wikipedia {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("http://testautomationpractice.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");
		
		driver.findElement(By.className("wikipedia-search-button")).click();
		
		Thread.sleep(3000);
		
		List <WebElement>search_results=driver.findElements(By.xpath("//*[@id='wikipedia-search-result-link']/a"));
		System.out.println(search_results.size());
		
		for(WebElement e:search_results) {
			String link=e.getText();
			driver.findElement(By.linkText(link)).click();
		}
		
		Set<String>handles=driver.getWindowHandles();
		for(String handle:handles) {
			String title=driver.switchTo().window(handle).getTitle();
			System.out.println(title);
		}
		
		Thread.sleep(3000);
		driver.quit();
	}

}
