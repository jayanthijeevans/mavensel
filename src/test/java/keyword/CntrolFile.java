package keyword;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

//import io.cucumber.messages.types.Exception;

public class CntrolFile {
  @Test
  public void DrvKwd(String k,Action a) throws IOException {
	 
	  
	 // Action a=new Action();
	  
		  
		  //String kwd=rd.readexl(1, 3);
		 //System.out.println(rd.readexl(2, 3));
		if(k.contentEquals("Open")){
		  a.Open();
		}else if(k.contentEquals("InputName")){
		 		  a.InputName();
		}else if(k.contentEquals("InputEmail")) {		  
				a.InputEmail();
  		}else if(k.contentEquals("InputMessage")) {
		 		 a.InputMessage();
  		}else if(k.contentEquals("Close")) {
  			a.Close();
  		}
		  				
	  }
	
  
}
