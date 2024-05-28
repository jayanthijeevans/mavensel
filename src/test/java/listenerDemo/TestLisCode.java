package listenerDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.*;
public class TestLisCode extends BaseClass {
	// WebDriver d;
  @Test (groups="test1")
  public void passTC() {
	  System.out.println("This is a passed test Case");
	  Assert.assertTrue(true);
  }
  @Test(groups="test2")
  public void FailedTC(){
	  //d=new ChromeDriver();
	 // TestListemer obj=new TestListemer(d);
	  driver.get("https://wise.com/in/currency-converter");
	  driver.findElement(By.id("source-input")).sendKeys("10");
	  System.out.println("This is a failed testCase");
	
	  Assert.assertTrue(false);//This makes the test assersion  fail
  }
  @Test(groups="test3",dependsOnGroups="test2")
  public void SkippeTC() {
	  System.out.println("skipped test");
  }
  
}
