import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scrollDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		// driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("._2QfC02>button")).click();
		
		String scrolldown="window.scroll(0,5000)";
		
		JavascriptExecutor scriptexecutor= (JavascriptExecutor) driver;
		scriptexecutor.executeScript(scrolldown, "");
		
		System.out.println("first scrol down operation done");
		Thread.sleep(30000);
		String scrollup="window.scroll(2000,0)";
		
		JavascriptExecutor scriptexecutor1= (JavascriptExecutor) driver;
		scriptexecutor1.executeScript(scrollup, "");
	}

}
