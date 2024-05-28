package TestListener;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
//import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
@Listeners(MyTestListener1.class)
public class TestCode extends Base {
	@BeforeSuite
	public void bfc() {
		Intialise();
	}
	
	 @Test (groups="test1")
	  public void passTC() {
		  System.out.println("This is a passed test Case");
		  Assert.assertTrue(true);
	  }
	  @Test(groups="test2")
	  public void FailedTC(){
		  
		  d.findElement(By.id("source-input")).sendKeys("10");
		  System.out.println("This is a failed testCase");
		
		  Assert.assertTrue(false);//This makes the test assersion  fail
	  }
	  @Test(groups="test3",dependsOnGroups="test2")
	  public void SkippeTC() {
		  System.out.println("skipped test");
	  }
	  
}
