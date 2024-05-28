package kyfm2;

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
  public void Open() {
	 d.get("https://practice.expandtesting.com/contact");
  }
  @Test
  public void enterName() {
	  WebElement name=d.findElement(By.xpath("(//input[@type='text'])[1]"));
	  if(name.isEnabled()) {
			name.clear();
			name.sendKeys("name1");
			
		}
  }
  @Test
  public void enterEmail() {
	  WebElement Email=d.findElement(By.xpath("(//input[@type='text'])[2]"));
	  Email.sendKeys("name1@gmail.com");
  }
  public void enterMessage() {
	  WebElement message=d.findElement(By.name("address"));
	  message.clear();
		message.sendKeys("msg");
  }@Test
  public void close() {
	  d.close();
  }
}
