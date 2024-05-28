package TestListener;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
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
public class Base {
	public static WebDriver d;
  @Test
  public void Intialise() {
	  d= new ChromeDriver();
	  d.get("https://wise.com/us/currency-converter/");
	  //d.findElement(By.xpath("//input[@id='source-input']")).clear();
	//  d.findElement(By.xpath("//input[@id='source-input']")).sendKeys("3478");
  }
  
  
   public void takTakesScreenshot(String MethodName){
	  
	 

		
		TakesScreenshot scrShot = ((TakesScreenshot)d);
  

	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	try {
		long time = System.currentTimeMillis();
		String folderpath="C:\\Users\\JAYANTHI\\eclipse-workspace\\mvnsel\\screenshot\\";
		String Filepath=MethodName+".png";
		System.currentTimeMillis();
		FileUtils.copyFile(SrcFile, new File(Filepath));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
}
