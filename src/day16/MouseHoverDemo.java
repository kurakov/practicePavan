package day16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		//Login
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
			
		Thread.sleep(3000);

//		driver.findElement(By.id("menu_admin_viewAdminModule")).click();//admin
//		driver.findElement(By.id("menu_admin_UserManagement")).click();//user management
//		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();//users
		
		
		WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));//admin
		WebElement usermgnt = driver.findElement(By.id("menu_admin_UserManagement"));//user management
		WebElement users = driver.findElement(By.id("menu_admin_viewSystemUsers"));//users
		
		
		Actions act = new Actions(driver);
		act.moveToElement(admin).moveToElement(usermgnt).moveToElement(users).click().perform();
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
