package Excel_utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FlipkartLogin {
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Automation\\Selinium\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		 driver = new FirefoxDriver();
		
		 driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		
			
	}
	
	@DataProvider
	
	public Object[][] getdatapro() throws IOException
	{
		Object[][] data=ReadUtility.readData("Login");
		return data;
	}
	
	
	@Test (dataProvider="getdatapro")
	public void loginTest(String username,String password)
	{
		 driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']/input")).sendKeys(username);
		 driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']/input[@type='password']")).sendKeys(password);
		 
		 driver.findElement(By.cssSelector("[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	}

	
	@AfterMethod
	
	public void teardown()
	{
		driver.quit();
	}
}
