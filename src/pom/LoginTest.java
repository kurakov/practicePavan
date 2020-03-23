package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;





public class LoginTest {
	public WebDriver driver;
	
	@BeforeClass
	void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/denyskurakov/Drivers/chromedriver");
		driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@Test
	void loginTest() {
		LoginPage lp=new LoginPage(driver);
		lp.setUserName("Admin");
		lp.setPassword("admin123");
		lp.clickLogin();
		
		//validation
		Assert.assertEquals("OrangeHRM", driver.getTitle());
		
		driver.close();
	}
}
