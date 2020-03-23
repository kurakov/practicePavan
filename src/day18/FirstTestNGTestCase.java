package day18;
/*testcase1
 * 1)launch browser
 * 2)open url
 * 3)login to application
 * 4)Logout from application
 */


import org.testng.annotations.Test;

public class FirstTestNGTestCase {
	
		@Test(priority=1)
		void launchBroser() {
//		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
//		WebDriver driver = new FirefoxDriver();
		System.out.println("launching browser......");
		}
		@Test(priority=2)
		void openURL() {
//		driver.get("https://newtours.demoaut.com/");
//		
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		
//		driver.manage().window().maximize();
		System.out.println("opening url......");
		}
		@Test(priority=3)
		void loginToApp() {
			System.out.println("loging to  app......");
		}
		@Test(priority=4)
		void logOut(){
			System.out.println("logout from app......");
		}


}
