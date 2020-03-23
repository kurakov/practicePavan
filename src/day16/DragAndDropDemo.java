package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		//element which need to drag
		WebElement from=driver.findElement(By.id("box1"));
		WebElement from1=driver.findElement(By.id("box2"));
		//element  on which need to drop
		WebElement to = driver.findElement(By.id("box101"));
		WebElement to1 = driver.findElement(By.id("box102"));
		
		//using action class for drag and drop
		Actions act=new Actions(driver);
		
		//dragged and dropped
		
		act.dragAndDrop(from, to).perform();
		act.dragAndDrop(from1, to1).perform();
		Thread.sleep(3000);

		driver.close();
	}

}
