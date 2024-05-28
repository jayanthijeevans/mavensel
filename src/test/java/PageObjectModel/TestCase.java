package PageObjectModel;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {
	ContactFormPage cf;
	WebDriver d;
	@BeforeTest
	  public void beforeTest() {
		d=new ChromeDriver();
		d.get("https://practice.expandtesting.com/contact");
		cf=new ContactFormPage(d);
		
	}
  @Test
  public void Tc001_CompleteForm() {
	  
	  cf.enterContactForm("TestAdmin", "Admin@gmail.com", "Test Message1");
	  
  }
  @Test
  public void Tc002_Testing_valiName_and_email() {
	  cf.InputName("QA");
	  cf.InputEmail("QA@test.co.in");
	  

	  
  }
}
