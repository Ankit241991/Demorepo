import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "E:\\Automation\\Selinium\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("in");
		Thread.sleep(20000);
		
		List<WebElement> menuitems=driver.findElements(By.cssSelector(".ui-menu-item"));
		
		for(WebElement menuitem:menuitems)
		{
			System.out.println(menuitem.getText());
			
			if 
			
				(menuitem.getText().equalsIgnoreCase("Benin"))
				
			{
			
			menuitem.click();
			break;
			
			}
		}
/*		
		
		
		//checkboxes
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
		
		// From city and to city 
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		
driver.findElement(By.xpath("//a[@value='BLR']")).click();

driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();


driver.findElement(By.id("ctl00_mainContent_view_date1")).click();*/

/*// select from date need to ask from abhishek
driver.findElement(By.xpath("//span[text(),'Sun, May 05 2019']")).click();*/


driver.findElement(By.id("divpaxinfo")).click();
//it will click on add adult button
for (int i=0;i<=5;i++) {
	driver.findElement(By.id("hrefIncAdt")).click();
	
}

driver.findElement(By.id("btnclosepaxoption")).click();

String value=driver.findElement(By.id("divpaxinfo")).getText();
System.out.println("selected adult bvalue are "+value);



WebElement Cdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
Cdropdown.click();
Select sct=new Select(Cdropdown);
sct.selectByIndex(1);

sct.selectByValue("AED");

sct.selectByVisibleText("USD");

String drop=sct.getFirstSelectedOption().getText();


	}

}
