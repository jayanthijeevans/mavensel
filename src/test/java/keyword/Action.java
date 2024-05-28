package keyword;


import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action {
	  WebDriver d;
Action(WebDriver d){
	this.d=d;
}

  @Test
  public void Open() {
	  // d=new ChromeDriver();
	  d.get("https://practice.expandtesting.com/contact");
	 
  }
  @Test
  public void InputName() {
	 

	  WebElement name=d.findElement(By.xpath("(//input[@type='text'])[1]"));
	  if(name.isEnabled()) {
			name.clear();
			name.sendKeys("name1");
			
		}
	 
  }
  @Test
  public void InputEmail() {
	  WebElement Email=d.findElement(By.xpath("(//input[@type='text'])[2]"));
	  Email.sendKeys("name1@gmail.com");
  }@Test
  public void InputMessage() {
	  WebElement message=d.findElement(By.name("address"));
	  message.clear();
		message.sendKeys("msg");
  }@Test
  public void Close() {
	  d.close();
  }
}
