package kyfm2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class mapping {
	
  @Test
  public void actionmap(String kwd,WebDriver d) {
	  ActionLib al=new ActionLib(d);
	  //String kwd="Open";
	  if(kwd.contentEquals("Open")) {
		  al.Open();
		  
	  }else if(kwd.contentEquals("InputName")) {
		  al.enterName();
	  }else if(kwd.contentEquals("InputEmail")) {
		  al.enterEmail();
	  }else if(kwd.contentEquals("InputMessage")) {
		  al.enterMessage();
	  }else if(kwd.contentEquals("Close")) {
		  al.close();
	  }
	  
  }
}
