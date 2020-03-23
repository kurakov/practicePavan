package day18;

import org.testng.annotations.Test;

public class TestCase2 {
	@Test(priority=1)
	void tm3() {
	System.out.println("This is TM1 form TC2");
}
	@Test(priority=2)
	void tm4() {
	System.out.println("This is TM2 form TC2");
}
}
