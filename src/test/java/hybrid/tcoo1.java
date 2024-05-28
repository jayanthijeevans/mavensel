package hybrid;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tcoo1 {
	WebDriver d;
	  XlRead rd;
	  mapping mp;
	@BeforeTest
	  public void beforeTest() throws Exception {
		 d=new ChromeDriver();
		 rd=new XlRead();
		 mp=new mapping();
		  rd.openxl();
	  }

	
  @Test
  public void tc001_valid() throws Exception {
	  
	  for(int i=1;i<5;i++) {
		 String kwd= rd.readCell(i,3);
		 String data=rd.readCell(i, 4);
		// System.out.println(kwd);
		 mp.actionmap(kwd,data,d);
		 
	  }
  }
	  @Test	
	  public void tc002_valid() throws Exception {
		  
		  for(int i=6;i<=7;i++) {
			 String kwd= rd.readCell(i,3);
			 String data=rd.readCell(i,4);
			// System.out.println(kwd);
			 mp.actionmap(kwd,data,d);
			 
		  }
  }
}
