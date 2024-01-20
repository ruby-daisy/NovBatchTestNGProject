package ins.aiite.extentreport;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportListener implements ITestListener{
	
	private ExtentReports extent;
	private ExtentTest test;
	
	
	public void onStart(ITestContext context) {
		System.out.println("On starting Testing All Scenatios");
		extent= new ExtentReports();//if not u get null pointer exception
		ExtentSparkReporter htmlReporter=new ExtentSparkReporter("test-output/er.html");
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("User", "Daisy");		

	}

	public void onFinish(ITestContext context) {
		System.out.println("On completing Testing All Scenatios");
		extent.flush();

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed");
		test.log(Status.PASS, "Test Passed");

	}

	public void onTestStart(ITestResult result) {
		System.out.println("On the Start of a testcase");
		test=extent.createTest(result.getMethod().getMethodName());

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed");
		test.log(Status.FAIL, "Test failed");

	}

}
