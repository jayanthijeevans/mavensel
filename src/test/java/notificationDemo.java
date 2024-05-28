import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class notificationDemo {

	public static void main(String[] args) {
		// Create an instance of ChromeOptions
      ChromeOptions options = new ChromeOptions();
       options.addArguments("--disable-notifications"); // Disable notifications
     WebDriver d=new ChromeDriver();
		d.get("https://pushalert.co/demo");

	}

}
