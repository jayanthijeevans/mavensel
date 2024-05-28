package keyword;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc001 {
  @Test
  public void Check_for_ValidDetails() throws Exception{
	  WebDriver d=new ChromeDriver();
	  Action a=new Action(d);
	  ReadExcel rd=new ReadExcel();
	  CntrolFile cf=new CntrolFile();
	  rd.openxl();
	  System.out.println(rd.rowcount());
	  for(int i=1;i<5;i++) {
		  cf.DrvKwd(rd.readexl(i, 3),a);
		// System.out.println(rd.readexl(i, 3));
		  
	  }
	  
	  
  }
}
