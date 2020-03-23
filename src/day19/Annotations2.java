package day19;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations2 {
	@BeforeClass
	void login() {
		System.out.println("ths is login..");
	}
	@AfterClass
	void logOut() {
		System.out.println("this is logout....");
	}
	@Test(priority = 1)
	void search() {
		System.out.println("search test....");
	}
	@Test(priority = 2)
	void advancedSearch() {
		System.out.println("Advanced search test....");
	}
	@Test(priority = 3)
	void recharge() {
		System.out.println("recharge test....");
	}
}
