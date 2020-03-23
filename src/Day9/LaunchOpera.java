package Day9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;


public class LaunchOpera {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.opera.driver", "/Users/denyskurakov/Drivers/operadriver");
		WebDriver driver=new OperaDriver();//OperaDriver driver=new OperaDriver(); //Launch opera browser
		
		//2) Open URL  https://opensource-demo.orangehrmlive.com/
				driver.get("https://opensource-demo.orangehrmlive.com/");
				
				Thread.sleep(3000);
				driver.close();
	}

}
