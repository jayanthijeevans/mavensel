package keyword;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	 FileInputStream fis;
	 XSSFWorkbook wb;
	  XSSFSheet   sh;
	  @Test
	  public void openxl() throws IOException {
		  File f=new File("C:\\Users\\JAYANTHI\\Documents\\Ness Comm\\Test data.xlsx");
		   fis=new FileInputStream(f);
		   wb=new XSSFWorkbook(fis);
	     sh=wb.getSheetAt(1);
	  }
  @Test
  public String readexl(int r,int c) throws IOException {
	 
	 String Keyword= sh.getRow(r).getCell(c).toString();
	 //System.out.println(Keyword);
	 return(Keyword);
  }
  @Test
  public int rowcount() {
	 return(sh.getLastRowNum()); 
		  
}
  
}
