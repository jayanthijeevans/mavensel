package listener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReporterDem2 {
  @Test
  public void passed() {
	  System.out.println("Test Passed");
  }
  @Test
  public void Failed() {
	  
	  System.out.println("Test Passed");
	  Assert.assertEquals(2, 3);
  }
  @Test (dependsOnMethods="Failed")
  public void skipped() {
	  System.out.println("method Skipped");
	  
  }
  
}
