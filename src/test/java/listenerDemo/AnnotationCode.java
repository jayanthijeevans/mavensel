package listenerDemo;

import org.testng.annotations.Test;

public class AnnotationCode {
	
  @Test (priority=10)
  public void first() {
	  System.out.println("Test with Priority 10 ,name First");
  }
  @Test (priority=5)
  public void second() {
	  System.out.println("Test with Priority 5 ,name Second");
  }
  @Test (priority=1)
  public void Third() {
	  System.out.println("Test with Priority 1 ,name Third");
  }
}
