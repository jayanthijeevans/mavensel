package listenerDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.IAttributes;
import org.testng.ITestContext;

public class newTestListener implements ITestListener {

	

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestContext context = result.getTestContext();
		System.out.println(context.getAttribute("driver"));
		 WebDriver driver = (WebDriver)context.getAttribute("driver");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    try {
			FileUtils.copyFile(scrFile, new File("C:\\Users\\JAYANTHI\\eclipse-workspace\\mvnsel\\curr.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block2
			e.printStackTrace();
		}
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestStart(result);
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSuccess(result);
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSkipped(result);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedWithTimeout(result);
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onStart(context);
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onFinish(context);
	}
 
}
