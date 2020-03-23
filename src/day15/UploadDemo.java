package day15;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;


public class UploadDemo {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		//System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32/chromedriver.exe");
				//WebDriver driver = new ChromeDriver(); 
				
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
				
				//PIM-->Add Employeere
				driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"menu_pim_addEmployee\"]")).click();
				
					
//				File upload using sendKeys()
				driver.findElement(By.id("photofile")).sendKeys("C:\\SeleniumPractice\\sikulifiles\\profilepic.jpg");
				
				
//				WebElement box=driver.findElement(By.id("photofile")); //opens window
//				JavascriptExecutor js=(JavascriptExecutor)driver;
//				js.executeScript("arguments[0].click();", box);
//				
//				
//				//Sikuli
//				
//				Pattern fileInputTextBox=new Pattern("/Users/denyskurakov/Desktop/sikuli/filetxtbox.png");
//				Pattern openButton=new Pattern("/Users/denyskurakov/Desktop/sikuli/openbtn.png");
//				
//				
//				
//				Screen s=new Screen();
//				
//				
//				s.wait(fileInputTextBox,15);
//				s.type(fileInputTextBox,"DSC_6418.jpg");
//				s.click(openButton);

	}

}
