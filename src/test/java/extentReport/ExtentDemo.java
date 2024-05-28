package extentReport;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
class ExtentDemo{
	WebDriver d;
	static ExtentTest test;
	static ExtentReports report;
  @Test
  public void f() {
	   report =new ExtentReports("C:\\Users\\JAYANTHI\\eclipse-workspace\\mvnsel\\ExtentReportResults.html");
	  //ExtentTest test;
	        // start reporters
	        
	      test = report.startTest("ExtentDemo");
	        // create ExtentReports and attach reporter(s)
	        
	  
	  d.get("https://www.google.com/");
	  
	  if(d.getTitle().equals("Google"))
	  {
		  test.log(LogStatus.INFO, "Navigated to Google");
	  test.log(LogStatus.PASS, "Navigated to the specified URL");
	  }
	  else
	  {
	  test.log(LogStatus.FAIL, "Test Failed");
	  }
	 d.findElement(By.name("q")).sendKeys("extentReports");
	 d.findElement(By.name("q")).submit();
	 test.log(LogStatus.INFO, "Searched for ExtentReports in the search box");
	 
  }
  @BeforeTest
  public void beforeTest() {
	  d=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  
	  d.close();
	  test.log(LogStatus.INFO, "Browser closed");
	  report.endTest(test);
	  report.flush();
  }

}
