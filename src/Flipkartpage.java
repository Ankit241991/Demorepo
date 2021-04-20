import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkartpage {
// this is flipkart page and 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "E:\\Automation\\Selinium\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		WebDriver driver=   new FirefoxDriver();
		
		 driver.get("https://www.flipkart.com/");
		 
		 
		 driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']/input")).sendKeys("ankitmangla003@gmail.com");
		 driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']/input[@type='password']")).sendKeys("flip@7621");
		 
		 driver.findElement(By.cssSelector("[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		 driver.findElement(By.cssSelector("[class='_3OO5Xc']>input")).sendKeys("samsung galaxy f41",Keys.ENTER);
		 
		 //driver.findElement(By.xpath("//div[test()='Samsung Galaxy F41 (Fusion Blue, 128 GB)']")).click();
		 
		 driver.findElement(By.cssSelector("._4rR01T")).click();
		 
		 //driver.findElement(By.xpath("//button[@class='L0Z3Pu']/svg")).click();

	}

}
