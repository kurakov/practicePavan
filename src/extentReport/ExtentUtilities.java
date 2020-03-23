package extentReport;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ExtentUtilities  implements ITestListener{
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	public String suiteName;

	public void onStart(ITestContext context) {
		
		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+ "/test-output/myReport.html");//specify location of the report
		
		htmlReporter.config().setDocumentTitle("Automation Report"); // TiTle of report
		htmlReporter.config().setReportName("Functional Testing"); // name of the report  
		htmlReporter.config().setTheme(Theme.STANDARD);//DARk theme also present
		
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host name","localhost");
		extent.setSystemInfo("Environemnt","QA");
		extent.setSystemInfo("user","denys");
		extent.setSystemInfo("os","MacOS");
		extent.setSystemInfo("Browser name","Chrome,Firefox,Opera"); 
	}

	
	public void onTestStart(ITestResult result) {
		
		
	}

	
	public void onTestSuccess(ITestResult result) {
		
		test=extent.createTest(result.getName()); // create new entry in th report
		test.log(Status.PASS, "Test Case PASSED IS " + result.getName());
	}

	
	public void onTestFailure(ITestResult result) {
		test=extent.createTest(result.getName()); // create new entry in th report
		test.log(Status.FAIL, "Test Case Failed IS " + result.getName());
		
	}

	
	public void onTestSkipped(ITestResult result) {
		
		test=extent.createTest(result.getName()); // create new entry in th report
		test.log(Status.SKIP, "Test Case Skipped IS " + result.getName());
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

		
	public void onFinish(ITestContext context) {
		
		extent.flush();
	}

	
	
	
}
