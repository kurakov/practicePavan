package day16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
		WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act = new Actions(driver);
		
		act.contextClick(button).perform();
		
		driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']//span[contains(text(),'Copy')]")).click();
		Thread.sleep(2000);
		
		
		Alert alertbox = driver.switchTo().alert();
		//System.out.println(alertbox.getText());
		String msg = alertbox.getText();
		if(msg.equals("clicked: copy")) {
			System.out.println(msg);
		}else {
			System.out.println("Not expected message");
		}
		alertbox.accept();
		
		Thread.sleep(3000);
		driver.close();
	}

}
