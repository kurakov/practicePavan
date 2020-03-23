package day19;

import org.testng.annotations.Test;

public class Grouping {
@Test(priority = 1, groups = {"sanity","regression"})
public void loginByEmail() {
	System.out.println("this is login by email");
}
@Test(priority = 2,groups = {"sanity"})
public void loginByFacebook() {
	System.out.println("this is login by facebook");
}
@Test(priority = 3,groups = {"sanity"})
public void loginByTwitter() {
	System.out.println("this is login by twitter");
}
@Test(priority = 4,groups = {"sanity","regression"})
public void signUpByEmail() {
	System.out.println("this is signUp in email");
}
@Test(priority = 5,groups = {"regression"})
public void signUpByFAcebook() {
	System.out.println("this is signUp in facebook");
}
@Test(priority = 6,groups = {"regression"})
public void signUpByTwitter() {
	System.out.println("this is sognUp in twitter");
}
@Test(priority = 7,groups = {"regression"})
public void paymentREturnByBank() {
	System.out.println("this is payment return bby bank");
}
@Test(priority = 8,groups = {"regression"})
public void paymentInDollar() {
	System.out.println("this is payment in DOLLAR");
}
@Test(priority = 9,groups = {"regression"})
public void paymentInnRuppes() {
	System.out.println("this is payment in RUPEES");
}


}
