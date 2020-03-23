package day19.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	@Test(priority = 1)
	void m1() {
		System.out.println("This is m1 method from Test1....");
	}
	@Test(priority = 2)
	void m2() {
		System.out.println("This is m2 method from Test1....");
	}
	
	@BeforeTest
	public void m() {
		System.out.println("This is m method....");
	}
}
