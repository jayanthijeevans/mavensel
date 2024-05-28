package listenerDemo;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import net.bytebuddy.implementation.bind.annotation.Super;

public class TestListemer implements ITestListener{
	
 	public void onTestStart(ITestResult result) {
		System.out.println("Test started "+result.getName());
		
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Sucessful"+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		
		//takTakesScreenshot();
		System.out.println("Test unSucessful"+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped"+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("failed with little sucess");
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("failed with Timeout");
	}

	public void onStart(ITestContext context) {
		System.out.println("Test started");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test Finished");
		System.out.println("Number of testes that passed" +context.getPassedTests().size());
		 System.out.println("Total number of testst that failed  " +context.getFailedTests().size());
		
	}
  
}
