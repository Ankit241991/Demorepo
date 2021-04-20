import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class firstday {

	public static  void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "E:\\Automation\\Selinium\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		WebDriver driver=   new FirefoxDriver();
		
		 driver.get("https://www.spicejet.com/");
		 
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		 
		driver.findElement(By.xpath("//a[@value='ATQ']")).click();
		 System.out.println("String value are ");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[@value='DEL']")).click();
		 
		 
		 
		 
		 driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
	}

}
