package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.practiceselenium.com/practice-form.html");
		
		//**************INput box/text box***************8
		
		WebElement firstnametext=driver.findElement(By.name("firstname"));
		//conditional commands always return a boolean value
		
		System.out.println("Display status of element is - "+firstnametext.isDisplayed());
		System.out.println("Enable status of element is - "+firstnametext.isEnabled());
		
		firstnametext.sendKeys("Denys");
		//firstnametext.clear(); //if you want to clear data in the field
		
		//************radio button****************
		WebElement rdButton = driver.findElement(By.cssSelector("input[value=Male]"));
		
		//conditional commands always return a boolean value

		
		System.out.println("Dispaly  status of radio Button is - "+rdButton.isDisplayed());
		System.out.println("Enable  status of radio Button is - "+rdButton.isEnabled());
		System.out.println("Select  status of radio Button is - "+rdButton.isSelected());
		rdButton.click();
		System.out.println("Select  status of radio Button is - "+rdButton.isSelected());
		
		
		
		//****************8check box********************
		
		WebElement chbox= driver.findElement(By.xpath("//input[@id='tea1']"));
		System.out.println("Dispaly  status of check box  is - "+chbox.isDisplayed());
		System.out.println("Enable  status of check box  is - "+chbox.isEnabled());
		System.out.println("Select status of check box  is - "+chbox.isSelected());
		chbox.click();
		System.out.println("Select status of check box  is - "+chbox.isSelected());
		
		
		
		
		
		//driver.close();
	}

}
