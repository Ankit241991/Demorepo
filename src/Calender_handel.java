import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calender_handel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Automation\\Selinium\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April"))
		  {
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
			}
		List<WebElement> element =driver.findElements(By.className("day"));
      
		
		int count=driver.findElements(By.className("day")).size();
		
		for(int i=0;i<count;i++)
		{
			String date=driver.findElements(By.className("day")).get(i).getText();
			
			if (date.equalsIgnoreCase("23"))
			{
				driver.findElements(By.className("day")).get(i).click();
			}
			
		}
	}

}
