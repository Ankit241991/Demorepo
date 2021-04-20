import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class window_assigment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Automation\\Selinium\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> it=windows.iterator();
		
		String parent_id=it.next();
		
		String child_id=it.next();;
		Thread.sleep(10000);
		driver.switchTo().window(child_id);
		
		Thread.sleep(10000);
		
		//System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3)")).getText());
		
		System.out.println(driver.findElement(By.cssSelector(".example>h3")).getText());
		
		driver.switchTo().window(parent_id);
		
		System.out.println(driver.findElement(By.cssSelector("#content>div>h3")).getText());
	}

}
