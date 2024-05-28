package hybrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ActionLib {
	WebDriver d;
	ActionLib(WebDriver drv){
		d=drv;
	}
  @Test
  public void Open(String url) {
	 d.get(url);
  }
  @Test
  public void enterName(String na) {
	  WebElement name=d.findElement(By.xpath("(//input[@type='text'])[1]"));
	  if(name.isEnabled()) {
			name.clear();
			name.sendKeys(na);
			
		}
  }
  @Test
  public void enterEmail(String email) {
	  WebElement Email=d.findElement(By.xpath("(//input[@type='text'])[2]"));
	  Email.sendKeys(email);
  }
  public void enterMessage(String msg) {
	  WebElement message=d.findElement(By.name("address"));
	  message.clear();
		message.sendKeys(msg);
  }@Test
  public void close() {
	  d.close();
  }
}
