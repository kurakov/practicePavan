package day19.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test2 {
	@Test(priority = 3)
	void m3() {
		System.out.println("This is m3 method from Test2....");
	}
	@Test(priority = 4)
	void m4() {
		System.out.println("This is m3 method from Test2....");
	}
	@AfterTest
	public void n() {
		System.out.println("This is n method....");
	}
}
