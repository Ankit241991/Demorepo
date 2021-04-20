import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class mouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "E:\\Automation\\Selinium\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(10000);
		
		WebElement signup=driver.findElement(By.id("nav-link-accountList"));
	
		Actions act= new Actions(driver);
		
		act.moveToElement(signup).build().perform();
		
	Thread.sleep(10000);
		
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		
		
		driver.findElement(By.id("ap_email")).sendKeys("ankitmangla003@gmail.com",Keys.ENTER);
		Thread.sleep(10000);
		
		driver.findElement(By.id("ap_password")).sendKeys("Ama@7621",Keys.ENTER);
		
		
		
	act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("samsung").build().perform();

	}

}
