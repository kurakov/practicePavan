package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1)how many rows in table
		
	
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr")).size();
		System.out.println("table has this amount of rows...."+rows);
		
		//int row2 = driver.findElements(By.tagName("tr")).size();//not preferable
		
		//2)how many columns in table
		
		int columns = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th")).size();
		
		System.out.println("number of columns ....."+columns);
		
		
		//3) Retrieve the specific tow/column data
		
		String value=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[5]/td[1]")).getText();
		System.out.println(value);
		
		//4) retrieve all data from table
		System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
		for(int row=2; row<=rows; row++) {
			for(int c=1; c<=columns;c++) {
				String tbox=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+row+"]/td["+c+"]")).getText();
				System.out.print(tbox+"\t");
			}
			System.out.println();
		}
		
		//5 print book names whose author is Mukesh(conditional based retrieval of row)
		for(int r=2; r<=rows; r++) {
			String author = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td[2]")).getText();
			if(author.equals("Mukesh")) {
				{
					String bookname = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td[1]")).getText();
					System.out.println(bookname+"   "+author);
				}
			}
		}
		
		//6) find sum of cost
//		
		int total=0;
		for(int r=2;r<=rows;r++)  
		{
			String price=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td[4]")).getText();
			
			total=total+Integer.parseInt(price);
		}
		
		System.out.println("Total Price of the books:"+total);
		
		
		driver.close();
		
	} 

}
