package day11;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.nopcommerce.com/");

		List<WebElement>links= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		//printing all links from webpage
		
		for(WebElement l:links) {
			System.out.println(l.getText());
		}
		driver.findElement(By.xpath("//div[@class='developer-link-wrapper']//a")).click();
	}

}
