package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ContactFormPage {
	WebDriver d;
	By name=By.xpath("(//input[@type='text'])[1]");
	By email=By.xpath("(//input[@type='text'])[2]");;
	By message=By.name("address");
	ContactFormPage(WebDriver drv){
		d=drv;
	}
  @Test
  public void InputName(String na) {
	  
	  d.findElement(name).sendKeys(na);
  }
public void InputEmail(String em) {
	  
	  d.findElement(email).sendKeys(em);
  }
public void InputMessage(String msg) {
	  
	  d.findElement(message).sendKeys(msg);
}
public void enterContactForm(String n,String em, String ms) {
	InputName(n);
	InputEmail(em);
	InputMessage(ms);
}
}
