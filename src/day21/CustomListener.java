package day21;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed..."+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed..."+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped..."+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	


}
