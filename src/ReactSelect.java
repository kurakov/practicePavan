

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class ReactSelect {
	public static  WebDriver driver;
	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		driver = new FirefoxDriver();
		
		
		driver.get("https://jedwatson.github.io/react-select/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
		//fifth approach
		driver.findElement(By.xpath("//h3[contains(text(),'States')]/..//span[@class='Select-arrow']")).click();
		List<String> options = getAllOptions();
		
		System.out.println(options);
	}
	private static List<String> getAllOptions() {
		List<String> elements = new ArrayList<String>();
		for(int i=1;i<8;i++) {
			String id = "react-select-2--option-"+i+"";
			String element = driver.findElement(By.id(id)).getText();
			elements.add(element);
	}
		return elements;
		
		
		
		//first approach
//		driver.findElement(By.xpath("//h3[contains(text(),'States')]/..//span[@class='Select-arrow']")).click();
//		driver.findElement(By.id("react-select-2--option-3")).click();
		//second approach
//		WebElement el = driver.findElement(By.xpath("//div[@class='Select-control']"));
//        el.click();
//        WebDriverWait wait = new WebDriverWait(driver,10);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='Select-input']/input[@id='state-select']"))).sendKeys("Victoria");
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_ENTER); //press enter key
		
//	
//		 new ReactSelect().selectCombo("Tasmania");
		

	
	//third approach
//	public void selectCombo(String valueText)
//	{
//	
//		driver.findElement(By.cssSelector("div.page-body:nth-child(3) div.container div.section:nth-child(1) div.Select.has-value.is-clearable.is-searchable.Select--single:nth-child(2) div.Select-control:nth-child(2) span.Select-arrow-zone > span.Select-arrow")).click();
//	    WebElement dropdownValue = driver.findElement(By.xpath("//div[contains(text(),'"+valueText+"')]"));
//	    dropdownValue.click();
//	   
//	}
		

}
}


