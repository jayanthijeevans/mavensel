package TestListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class MyTestListener1 extends Base implements ITestListener {

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
	
	}

	public void onTestFailure(ITestResult result) {
		String name=result.getClass().getName();
		System.out.println(name);
		//takTakesScreenshot(name);
		
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
	
	}

	public void onFinish(ITestContext context) {
	
	}
	
 
}
