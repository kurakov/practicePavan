package day13;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleMultipleBrowserWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();

		
		
//		String handlevalue = driver.getWindowHandle();
//		System.out.println(handlevalue);//17
		
		
		driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")).click();
		Set<String> handlevalues = driver.getWindowHandles();
		//System.out.println(handlevalues);
		for(String h:handlevalues) {
			//System.out.println(h);
			String title = driver.switchTo().window(h).getTitle();
			System.out.println(title);
			if(title.equals("Sakinalium | Home")) {
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"container\"]/header/div/div/div[2]/ul/li[4]/a")).click();
			}
		}
		
	}

}
