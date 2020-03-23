package AssignmentsDenys;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day13Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();

		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		Alert alertbox = driver.switchTo().alert();
		System.out.println(alertbox.getText());
		alertbox.accept();
		
		driver.close();
	}

}
