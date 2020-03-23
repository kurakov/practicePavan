package day21;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(day21.CustomListener.class)
public class ListenerTest {
	@Test(priority=1)
	public void test1() {
		System.out.println("This is test1");
		Assert.assertEquals("A", "A");
	}
	@Test(priority = 2)
	public void test2() {
		System.out.println("This is test2");
		Assert.assertEquals("A", "B");
	}
	@Test(priority = 3,dependsOnMethods= {"test2"})
	public void test3() {
		System.out.println("This is test3");
		Assert.assertEquals("A", "B");
	}
}
