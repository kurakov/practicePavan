package day17;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FixedDepositCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		String path = "/Users/denyskurakov/Desktop/caldata.xlsx";
		int rowcount=XLUtils.getRowCount(path, "Sheet1");
		for(int i=1;i<=rowcount;i++) {
			String pric=XLUtils.getCellData(path, "Sheet1", i, 0);
			String ratiofinterest=XLUtils.getCellData(path, "Sheet1", i, 1);
			String per1=XLUtils.getCellData(path, "Sheet1", i, 2);//duration
			String per2=XLUtils.getCellData(path, "Sheet1", i, 3);//years/months/day
			String fre=XLUtils.getCellData(path, "Sheet1", i, 4);
			
			
			Double exp_mvalue=Double.parseDouble(XLUtils.getCellData(path, "Sheet1", i, 5));
			
			driver.findElement(By.id("principal")).sendKeys(pric);
			driver.findElement(By.id("interest")).sendKeys(ratiofinterest);
			driver.findElement(By.id("tenure")).sendKeys(per1);
			
			Select perdrp = new Select (driver.findElement(By.id("tenurePeriod")));
			perdrp.selectByVisibleText(per2);
			
			Select fredrp = new Select(driver.findElement(By.id("frequency")));
			fredrp.selectByVisibleText(fre);
			driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img")).click();
			String act_mvalue=driver.findElement(By.xpath("//*[@id=\"resp_matval\"]/strong")).getText();
			//validation...
			if(exp_mvalue==Double.parseDouble(act_mvalue)) {
				XLUtils.setCellData(path, "Sheet1", i, 7, "PASSED");
				XLUtils.fillGreenColor(path, "Sheet1", i, 7);
			}else {
				XLUtils.setCellData(path, "Sheet1", i, 7, "FAILED");
				XLUtils.fillRedColor(path, "Sheet1", i, 7);
			}
			
			driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[2]/img")).click();//clear textfields
		}
		System.out.println("Test is done succesfully.");
		Thread.sleep(2000);
		driver.close();
	}

}
