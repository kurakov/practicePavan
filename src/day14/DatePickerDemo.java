package day14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePickerDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();

		driver.switchTo().frame(0);
		
		//driver.findElement(By.id("datepicker")).sendKeys("02/16/2020");
		
		String year = "2020";
		String month = "April";
		String date = "5";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		while(true) {
			String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yer = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(mon.equals(month)&& yer.equals(year)) {
				break;
			}else {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td"));
		
		for(WebElement ele:alldates) {
			String dt = ele.getText();
			if(dt.equals(date)) {
				ele.click();
				break;
			}
		}
		
		driver.close();
	}

}
