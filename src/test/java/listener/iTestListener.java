package listener;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
public class iTestListener {
  @Test
  public void testPass() {
	  System.out.println("Passed test");
  }
  @Test
  public void testFail() {
	  Assert.assertTrue(false);
	  System.out.println("failed test");
  }
}
