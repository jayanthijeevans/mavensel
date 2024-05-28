package listenerDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest implements ITestListener {
  public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		
	}

	public void onTestFailure(ITestResult result) {
		ITestContext context = result.getTestContext();
		System.out.println("Taking screenShot");
		 Set<String> st = context.getAttributeNames();
		// Iterator it=st.iterator();
		 System.out.println(st);
		 //WebDriver d = super.driver;
		// System.out.println(driver.getTitle());
		 
		/*TakesScreenshot scrShot =((TakesScreenshot)d);

		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(SrcFile, new File("./sreenshot1234.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
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
