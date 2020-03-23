package day18;

import org.testng.annotations.Test;

public class TestCase1 {
	@Test(priority=1)
	void tm1() {
	System.out.println("This is TM1 form TC1");
}
	@Test(priority=2)
	void tm2() {
	System.out.println("This is TM2 form TC1");
}
}
