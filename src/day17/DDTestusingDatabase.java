package day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.mysql.cj.xdevapi.Statement;

public class DDTestusingDatabase {

	public static void main(String[] args) throws SQLException {
		System.setProperty("webdriver.gecko.driver", "/Users/denyskurakov/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://newtours.demoaut.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		//1) Establish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");

		//2 & 3) Statement - create & execute execute statement(query)
		Statement stmt=(Statement) con.createStatement();
		
		//4)Execute query
		ResultSet rs=((java.sql.Statement) stmt).executeQuery("select * from users;");
		
		//5) Reading records from resultset
		while(rs.next()) //1
		{
			String uname=rs.getString("USERNAME");
			String pwd=rs.getString("USERPASSWORD");
			
			driver.findElement(By.name("userName")).sendKeys(uname);
			driver.findElement(By.name("password")).sendKeys(pwd);
			
			driver.findElement(By.name("login")).click();
			
			String exp_title="Find a Flight: Mercury Tours:";
			String act_title=driver.getTitle();
			
			if(exp_title.equals(act_title))
			{
				System.out.println("Test Passed");
			}
			else
			{
				System.out.println("Test failed");
			}
			
			driver.findElement(By.linkText("Home")).click();
			
		}
		
		//6) closing connection
		rs.close();
		con.close();
		driver.close();
	}

}
