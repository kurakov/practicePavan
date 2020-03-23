package day15;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileInChrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/denyskurakov/Drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		driver.manage().window().maximize();
		
		
		//txt files
		driver.findElement(By.id("textbox")).sendKeys("Welcome on Moon");
		driver.findElement(By.id("createTxt")).click();
		driver.findElement(By.id("link-to-download")).click();
		Thread.sleep(5000);
		if(isFileExist("/Users/denyskurakov/Downloads/info.txt")==true) {
			System.out.println("text file exists");
		}else {
			System.out.println("text file not exists");
		}
		
		//PDF file
		driver.findElement(By.id("pdfbox")).sendKeys("Welcome from Mars");
		driver.findElement(By.id("createPdf")).click();
		driver.findElement(By.id("pdf-link-to-download")).click();
		Thread.sleep(5000);
		if(isFileExist("/Users/denyskurakov/Downloads/info.pdf")==true) {
			System.out.println("pdf file exists");
		}else {
			System.out.println("pdf file not exists");
		}
		
		driver.close();
	}
	
	
	
	
	
	
	public static boolean isFileExist(String loc) {
		File f= new File(loc);
		if(f.exists()) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
}
