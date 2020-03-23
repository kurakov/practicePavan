package day13;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HadlingAlerts {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
			WebDriver driver = new FirefoxDriver();
			
			
			
			driver.get("http://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();

			driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button")).click();
			
			Thread.sleep(5000);
			Alert alertbox = driver.switchTo().alert();
			//alertbox.accept();//will close box using OK button
			//alertbox.dismiss();//will close box using CANCEL button
			//driver.switchTo().alert().accept();//this also can work
			System.out.println(alertbox.getText());
	}

}
