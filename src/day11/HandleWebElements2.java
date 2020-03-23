package day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleWebElements2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.practiceselenium.com/practice-form.html");
		
		//*******drop-down list**********
		
		//WebElement dropdown=driver.findElement(By.id("continents"));
		Select dropselect=new Select(driver.findElement(By.id("continents")));
		driver.switchTo().frame(0);
		//count number if options presenting in drop down
		int NumberOfOprion=dropselect.getOptions().size();
		System.out.println(NumberOfOprion);
		
		//capture all the options
		List<WebElement> options=dropselect.getOptions();
		for(WebElement e:options) {
			System.out.println(e.getText());
		}
		//select option from dropdown lis
		//dropselect.selectByIndex(6);
		dropselect.selectByVisibleText("Asia");//second approach to select
		//dropselect.deselectByValue(value);// value is attributer of the option tag
		
		
		//*******List box******
		
		WebElement listbox = driver.findElement(By.id("selenium_commands"));
		Select lstbox = new Select(listbox);
		lstbox.selectByVisibleText("Browser Commands");
		lstbox.selectByVisibleText("Wait Commands");
		lstbox.selectByVisibleText("WebElement Commands");
		
		
		
	}

}
