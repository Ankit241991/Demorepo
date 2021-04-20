import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class window2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Automation\\Selinium\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("openwindow")).click();
		
		Set <String>windows=driver.getWindowHandles();
		
		Iterator <String>it =windows.iterator();
		
		String parent_id= it.next();
		
		String child_id=it.next();
		
		driver.switchTo().window(child_id);
		
		Thread.sleep(30000);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ankitmangla");
		
		driver.switchTo().window(parent_id);
		
		driver.findElement(By.xpath("//button[contains(text(),'Login')")).click();;
		
		

	}

}
