package day20;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;


public class ParametersDemo {
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String br, String app) throws InterruptedException {
		if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "/Users/denyskurakov/Drivers/chromedriver");
		driver = new ChromeDriver();
		}else if(br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
			driver = new FirefoxDriver();
		}else if(br.contentEquals("opera")){
			System.setProperty("webdriver.opera.driver", "/Users/denyskurakov/Drivers/operadriver");
			driver= new OperaDriver();
		}
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.get(app);
		Thread.sleep(3000);
	}
	
	@Test(priority=1)
	void testLogoPresete() {
		boolean status = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
		Assert.assertEquals(status, true);
	}
	@Test(priority = 2)
	void homePageTitle(){
		String title = driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM");
	}
	@AfterClass
	void tearDown() {
		driver.close();
	}
}
