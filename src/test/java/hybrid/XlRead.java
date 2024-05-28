package hybrid;
import java.io.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class XlRead {
	XSSFWorkbook wb;
	  XSSFSheet sht;
  @Test
  public void openxl() throws Exception {
	  File f=new File("C:\\Users\\JAYANTHI\\Documents\\Ness Comm\\Test data.xlsx");
	  FileInputStream fis=new FileInputStream(f);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  sht=wb.getSheetAt(2);
	  
  }
  @Test
  public String readCell(int r,int c) {
	  String kwd=sht.getRow(r).getCell(c).toString();
	  return(kwd);
  }
  
}
