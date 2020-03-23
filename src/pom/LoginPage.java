package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	
	LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	//locators
	
	@FindBy(id="txtUsername")
	WebElement txtuserName;
	
	@FindBy(id="txtPassword")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	WebElement btnlogin;
	
	//action methods
	void setUserName(String uname) {
		txtuserName.sendKeys(uname);
	}
	void setPassword(String password) {
		txtpassword.sendKeys(password);
	}
	void clickLogin(){
		btnlogin.click();
	}
	
}
