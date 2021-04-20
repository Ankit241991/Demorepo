import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "E:\\Automation\\Selinium\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		// bank option drap option
		WebElement src=driver.findElement(By.xpath("//li[@id='credit2']/a"));
		
		System.out.println(driver.findElement(By.xpath("//li[@id='credit2']/a")).getText());
		
		// debit left side account target 
		WebElement trg=driver.findElement(By.cssSelector("#bank>li"));
		
		System.out.println(driver.findElement(By.cssSelector("#bank>li")).getText());
		
		Actions act= new Actions(driver);
		
		act.dragAndDrop(src, trg).perform();
		
		// 5000 option drap option
				WebElement src1=driver.findElement(By.cssSelector("#fourth>a"));
				
				
				// debit rigth side account target 
				WebElement trg1=driver.findElement(By.cssSelector("#amt7>li"));
			
				
				act.dragAndDrop(src1, trg1).build().perform();;
				
				//act.moveToElement(src1).clickAndHold().moveToElement(trg1).release().build().perform();
		
	}

}
