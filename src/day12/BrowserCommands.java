package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();

		Thread.sleep(5000);
		
		driver.close(); //closes single page
		//driver.quit();//closes multiple pages
	}

}
