import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Screenshot {
WebDriver driver;

@Test(description ="Screenshot of section of a page")
	public void ScreenShotOfaSectionInaPage() throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(3000);
		
		WebElement pageSection = driver.findElement(By.xpath("//*[@id=\"nopcommerce-common-statistics-box\"]"));
		highlightElement(pageSection, driver);
		File src=pageSection.getScreenshotAs(OutputType.FILE);
		File trg=new File("Statisticbox1.png");
		FileUtils.copyFile(src, trg);
		
		driver.close();
		
}
	void highlightElement(WebElement ele, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid green'", ele);
	}
}
