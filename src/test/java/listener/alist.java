package listener;
import org.testng.annotations.Test;

public class alist {
	//myinvocationListener obj=new myinvocationListener();
  @Test(invocationCount=5)
  public void finv() {
	  System.out.println("running multiple times");
  }
}
