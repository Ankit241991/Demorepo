import java.util.Iterator;
import java.util.Set;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Automation\\Selinium\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
		Set<String>  windows=driver.getWindowHandles();
		
		Iterator<String> it=windows.iterator();
		
		String parent_id=it.next();
		
		String child_id=it.next();
		
		driver.switchTo().window(child_id);
		Thread.sleep(10000);
		System.out.println(driver.findElement(By.cssSelector(".im-para")).getText());
		
		driver.switchTo().window(parent_id);
		driver.close();
		
	}

}
