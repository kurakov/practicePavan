package day18;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NopCommerceLogin {
WebDriver driver;
	
	@Test(priority=1)
	void setup()
	{
		
		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://admin-demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
	}
	
	//@Test(priority=2, description="Screenshot of a complete Page")
	void login() throws InterruptedException, IOException
	{
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(3000);
		
//		WebDriverManager.firefoxdriver().setup();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("HomePage.png");
		
		FileUtils.copyFile(src, trg);
		
		
		
		String exp_title="Dashboard / nopCommerce administration";
		String act_title=driver.getTitle();
		
//		if(exp_title.equals(act_title))
//		{
//			System.out.println("Test is passed..........");
//		}
//		else
//		{
//			System.out.println("Test is failed..........");
//		}
		
		Assert.assertEquals(exp_title, act_title);
	}
	
	
	

	@Test(priority=3)
	void tearDown()
	{
		driver.close();
	}
	
}
