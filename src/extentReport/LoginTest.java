package extentReport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
WebDriver driver;
	
	@BeforeClass
	public void setup()
	{	
		System.setProperty("webdriver.chrome.driver", "/Users/denyskurakov/Drivers/chromedriver");
		driver = new ChromeDriver();
	
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
	
	}
	@Test(priority=1)
	public void logoTest()
	{
		Assert.assertEquals("A","B");
	}
	
	
	@Test(priority=2)
	public void loginTest() throws InterruptedException
	{
//		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("denys@higservices.com");
		driver.findElement(By.id("Password")).sendKeys("test@123");
		
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "nopCommerce demo store");
					
	}
	
	@Test(priority=3,dependsOnMethods= {"loginTest"})
	public void logoutTest() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"nopCommerce demo store");
	
		driver.close();
	}
}
