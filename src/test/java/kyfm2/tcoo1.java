package kyfm2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;

public class tcoo1 {
  @Test
  public void tc001_valid() throws Exception {
	  WebDriver d=new ChromeDriver();
	  XlRead rd=new XlRead();
	  mapping mp=new mapping();
	  rd.openxl();
	  for(int i=1;i<5;i++) {
		 String kwd= rd.readCell(i,3);
		// System.out.println(kwd);
		 mp.actionmap(kwd,d);
		 
	  }
  }
	  @Test	
	  public void tc002_valid() throws Exception {
		  WebDriver d=new ChromeDriver();
		  XlRead rd=new XlRead();
		  mapping mp=new mapping();
		  rd.openxl();
		  for(int i=6;i<=7;i++) {
			 String kwd= rd.readCell(i,3);
			// System.out.println(kwd);
			 mp.actionmap(kwd,d);
			 
		  }
  }
}
