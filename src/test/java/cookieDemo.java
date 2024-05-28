import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class cookieDemo {
  @Test
  public void f() {
	  WebDriver d=new ChromeDriver();
	  d.get("https://practice.expandtesting.com/contact");
	 Set <Cookie>ck= d.manage().getCookies();
	 System.out.println(ck);
	 
	 d.manage().addCookie(new Cookie("mycookie","testvalue"));
	 Cookie c=d.manage().getCookieNamed("mycookie");

	System.out.println(c);
  }



}
