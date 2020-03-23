package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DataProviderDemo {
	WebDriver driver;
	@BeforeClass
	void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/denyskurakov/Drivers/chromedriver");
		driver = new ChromeDriver();
		
	}
	@Test(dataProvider="dp")
	void login(String uname, String pwd) {
		driver.get("https://demo.nopcommerce.com/login");
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.className("button-1 login-button")).click();
		
		String exp_title = "nopCommerce demo store";
		String act_title=driver.getTitle();
		Assert.assertEquals(exp_title, act_title);
	}
	@DataProvider(name="dp")
	Object[][] loginData(){
		Object data [][]= {{"pavanoltraininng@gmail.com", "Test@123"},
					 	   {"pavan@gmail.com", "Test@123"},
					 	   {"pavanoatrainining@gmail.com", "Test@1"}
		};
		return data;
	}
	
	
	@AfterClass
	void tarDown() {
		driver.quit();
	}
}
