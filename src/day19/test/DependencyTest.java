package day19.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {
@Test(priority = 1)
void openURL() {
	System.out.println("Open url...");
	Assert.assertTrue(true);
}

@Test(priority = 2, dependsOnMethods= {"openURL"})
void login() {
	System.out.println("Login test...");
	Assert.assertTrue(false);
}
@Test(priority = 3, dependsOnMethods= {"login", "openURL"})
void search() {
	System.out.println("Searching...");
	Assert.assertTrue(true);
}
@Test(priority = 4, dependsOnMethods= {"search"})
void advsearch() {
	System.out.println("Advanced Searching...");
	Assert.assertTrue(true);
}
@Test(priority = 5,dependsOnMethods= {"login"})
void logOut() {
	System.out.println("LogOut...");
	Assert.assertTrue(true);
}
}
