package hybrid;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class mapping {
	
  @Test
  public void actionmap(String kwd,String data,WebDriver d) {
	  ActionLib al=new ActionLib(d);
	    //String kwd="Open";
	  if(kwd.contentEquals("Open")) {
		   al.Open(data);
		  
	  }else if(kwd.contentEquals("InputName")) {
		  al.enterName(data);
	  }else if(kwd.contentEquals("InputEmail")) {
		  al.enterEmail(data);
	  }else if(kwd.contentEquals("InputMessage")) {
		  al.enterMessage(data);
	  }else if(kwd.contentEquals("Close")) {
		  al.close();
	  }
	  
  }
}
