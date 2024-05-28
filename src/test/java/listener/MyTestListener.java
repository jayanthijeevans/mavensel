package listener;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener{
	public void onTestStart(ITestResult result) {
		 
		 System.out.println("New Test Started" +result.getName());
		 
		 }
		 
		 public void onTestSuccess(ITestResult result) {
		 
		 System.out.println("Test Successfully Finished " +result.getName());
		 
		 }
		 
		 public void onTestFailure(ITestResult result) {
		 
		 System.out.println("Test Failed " +result.getName());
		 WebDriver d=new ChromeDriver();
			d.get("https://www.ttdconline.com");
		
			File scrFile = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		    try {
				FileUtils.copyFile(scrFile, new File("./image1.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 
		 }
		 
		 public void onTestSkipped(ITestResult result) {
		 
		 System.out.println("Test Skipped " +result.getName());
		 
		 }
		 
		 public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		 
		 System.out.println("Test Failed but within success percentage " +result.getName());
		 
		 }
		 
		 public void onStart(ITestContext context) {
		 
		 
		 System.out.println("This is onStart method  " +context.getOutputDirectory());
		 
		 }
		 
		 public void onFinish(ITestContext context) {
		 
		 System.out.println("This is onFinish method  " +context.getPassedTests());
		 System.out.println("This is onFinish method  " + context.getFailedTests());
		 }
		
}
