package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CFWithPageFactory {
 
		WebDriver d;
		@FindBy(xpath="(//input[@type='text'])[1]")
		WebElement name;
		@FindBy(xpath="(//input[@type='text'])[2]")
		WebElement email;
		
		@FindBy(name="address")
		WebElement message;
		
		
		CFWithPageFactory(WebDriver drv){
			
			PageFactory.initElements(drv, this);
		}
	  @Test
	  public void InputName(String na) {
		  name.clear();
		  name.sendKeys(na);
		  
		  
	  }
	public void InputEmail(String em) {
		email.clear();
		  email.sendKeys(em);
		  
	  }
	public void InputMessage(String msg) {
		message.clear();
		  message.sendKeys(msg);
		 
	}
	public void enterContactForm(String n,String em, String ms) {
		InputName(n);
		InputEmail(em);
		InputMessage(ms);
	}
}
