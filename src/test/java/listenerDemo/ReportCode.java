package listenerDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReportCode {
  @Test
  public void passed() {
	  Assert.assertTrue(true);
  }
  @Test
  public void failed() {
	  Assert.assertTrue(false);
  }
  @Test(dependsOnMethods="failed")
  public void skipped() {
	  Assert.assertTrue(true);
  }
}
