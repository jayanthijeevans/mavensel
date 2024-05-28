import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.util.*;
import java.util.Iterator; 
public class exl {
	 XSSFSheet sh;
	 FileInputStream fis;
  @Test
  //(dataProvider = "dp")
  public void f() throws Exception {
	  File f=new File("C:\\Users\\JAYANTHI\\Documents\\Ness Comm\\Test data.xlsx");
		 fis=new FileInputStream(f);
		 XSSFWorkbook wb=new XSSFWorkbook(fis);
		 sh=wb.getSheetAt(0);
		int  RowCount=sh.getLastRowNum();
		/*Iterator<Row>  rws=sh.iterator();
		while(rws.hasNext()) {
			Iterator cells=rws.next().cellIterator();
			while (cells.hasNext()) {
				
			System.out.print(cells.next().toString()+"\t");
			}
			System.out.println();
			}*/
			
		Iterator<Row>  rws=sh.iterator();
		rws.next();
		WebDriver d=new EdgeDriver();
		d.get("https://practice.expandtesting.com/contact");
		while(rws.hasNext()) {
		Row currow = rws.next();
			String nn=currow.getCell(0).toString();
			String e=currow.getCell(1).toString();
			String msg=currow.getCell(2).toString();
			WebElement name=d.findElement(By.xpath("(//input[@type='text'])[1]"));
			WebElement Email=d.findElement(By.xpath("(//input[@type='text'])[2]"));
			WebElement message=d.findElement(By.name("address"));
			//WebElement send=d.findElement(By.linkText("Send"));
			if(name.isEnabled()) {
				name.clear();
				name.sendKeys(nn);
				
			}
			Email.sendKeys(e);
			message.clear();
			message.sendKeys("This is a trial message from the user "+msg);
			}
		
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
