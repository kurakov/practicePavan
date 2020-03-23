package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.chrome.ChromeDriver;



//1) Open Web Browser(Chrome/firefox/IE).
//2) Open URL  https://opensource-demo.orangehrmlive.com/
//3) Enter username  (Admin).
//4) Enter password  (admin123).   
//5) Click on Login.
//6) Capture title of the home page.(Actual title)
//7) Verify title of the page: OrangeHRM    (Expected)
//8) close browser


public class FirstTestCase {

	public static void main(String[] args) {
		
		//Firefox
		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		WebDriver driver=new FirefoxDriver();//	WebDriver driver=new FirefoxDriver();
	//
		
		

		
		
		//2) Open URL  https://opensource-demo.orangehrmlive.com/
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//3) Enter username  (Admin).
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
				
		//4) Enter password  (admin123).   
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		
//		//5) Click on Login.
		driver.findElement(By.id("btnLogin")).click();
//		
//		//6) Capture title of the home page.(Actual title)
		String act_title=driver.getTitle();
//		
//		//7) Verify title of the page: OrangeHRM    (Expected)
		String exp_title="OrangeHRM";
//		
		if(act_title.equals(exp_title))
		{
			System.out.println("Test is Passed...");
		}
		else
		{
			System.out.println("Test is Failed...");
		}
		
		//8) close browser
		driver.close();
	}

}