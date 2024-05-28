import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import java.io.*;
import java.util.Iterator;
public class paramExcel1 {
  @Test
  public void f() throws Exception{
	  File f=new File("C:\\Users\\JAYANTHI\\Documents\\Ness Comm\\Test data.xlsx");
	  FileInputStream fis=new FileInputStream(f);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet   sh=wb.getSheetAt(0);
	 String value= sh.getRow(1).getCell(0).toString();
	 System.out.println(value);
    int rownum=sh.getLastRowNum();
    System.out.println(rownum);
    Iterator<Row> r3=sh.iterator();
    while(r3.hasNext()) {
    	Iterator <Cell>c3=r3.next().cellIterator();
    	 while (c3.hasNext()) {
    		 System.out.print(c3.next().toString()+"\t");
    	 }
    	System.out.println();
    }
    
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
