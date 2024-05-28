package mvnsel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sychroDemo {

	public static void main(String[] args)throws Exception {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("http://demos.telerik.com/aspnet-ajax/ajax/examples/loadingpanel/explicitshowhide/defaultcs.aspx");
		d.findElement(By.linkText("15")).click();
		//Thread.sleep(2000);//explicit wait
		WebDriverWait wt=new WebDriverWait(d,Duration.ofSeconds(150));
		wt.until(ExpectedConditions.elementToBeClickable(d.findElement(By.name("ctl00$ContentPlaceholder1$Button1"))));
		String date=d.findElement(By.id("ctl00_ContentPlaceholder1_ctl00_ContentPlaceholder1_Label1Panel")).getText();
		System.out.println("The selected date is "+date);
	}

}
