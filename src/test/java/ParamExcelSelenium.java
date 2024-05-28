import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParamExcelSelenium {
	WebDriver d;
  @Test
  public void f() throws Exception {
	  File f=new File("C:\\Users\\JAYANTHI\\Documents\\Ness Comm\\Test data.xlsx");
	  FileInputStream fis=new FileInputStream(f);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet   sh=wb.getSheetAt(0);
	Iterator <Row> rws=  sh.iterator();
	WebElement name=d.findElement(By.xpath("(//input[@type='text'])[1]"));
	WebElement Email=d.findElement(By.xpath("(//input[@type='text'])[2]"));
	WebElement message=d.findElement(By.name("address"));
	WebElement send=d.findElement(By.linkText("Send"));
	rws.next();
	while(rws.hasNext()) {
		Row Rowcur = rws.next();
		String na=Rowcur.getCell(0).toString();
		String em=Rowcur.getCell(1).toString();
		String msg=Rowcur.getCell(2).toString();
		
    		

	if(name.isEnabled()) {
		name.clear();
		name.sendKeys(na);
		
	}
	Email.sendKeys(em);
	message.clear();
	message.sendKeys(msg);
	}
  }
  @BeforeTest
  public void beforeTest() {
	   d=new ChromeDriver();
		d.get("https://practice.expandtesting.com/contact");
  }

  @AfterTest
  public void afterTest() {
	  d.close();
  }
}
