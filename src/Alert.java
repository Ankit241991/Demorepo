import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "E:\\Automation\\Selinium\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println("This is push example i have added");
		driver.findElement(By.cssSelector("#alertbtn")).click();
		
		driver.switchTo().alert().accept();;
		// this will add impliclit wait
		driver.manage().timeouts().implicitlyWait(TimeUnit.SECONDS, 30);

		
		driver.findElement(By.id("name")).sendKeys("ankit alert");
		driver.findElement(By.cssSelector("#alertbtn")).click();
		
		System.out.println("Alert text is "+ driver.switchTo().alert().getText() );
		driver.switchTo().alert().accept();
	}

}
