import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "E:\\Automation\\Selinium\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("#alertbtn")).click();
		
		driver.switchTo().alert().accept();;

		
		driver.findElement(By.id("name")).sendKeys("ankit alert");
		driver.findElement(By.cssSelector("#alertbtn")).click();
		
		System.out.println("Alert text is "+ driver.switchTo().alert().getText() );
		driver.switchTo().alert().accept();
	}

}
