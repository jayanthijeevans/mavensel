package listener;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ireporterlistener {
	 @Test
	   public void testMethodOne() {
	      Assert.assertTrue(true);
	   }

	   @Test
	   public void testMethodTwo() {
	      Assert.assertTrue(false);
	   }

	   @Test(dependsOnMethods = {"testMethodTwo"})
	   public void testMethodThree() {
	      Assert.assertTrue(true);
	   }
}
