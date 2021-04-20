

	import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class brokenLinks {




	public static void main(String[] args) throws MalformedURLException, IOException {

	// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "E:\\Automation\\Selinium\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	         

	         //broken URL

	         //Step 1 - IS to get all urls tied up to the links using Selenium

	         //  Java methods will call URL's without openning the Browser and gets you the status code

	         //if status code >400 then that url is not working-> link which tied to url is broken

	         //a[href*="soapui"]'

	        

	         

	         

	      List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));

	   SoftAssert a =new SoftAssert();

	     

	      for(WebElement link : links)

	      {

	       

	          String url= link.getAttribute("href");

	         //Open connection is s method present in URL class and openConnection method return type is HTTPURLCOnnection 

	          HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();

	          conn.setRequestMethod("HEAD");

	          conn.connect();

	          int respCode = conn.getResponseCode();

	          System.out.println(respCode);

	          
	          if(respCode>400)
	          {
	        	  System.out.println("The link with Text is "+link.getText() +" is broken with code " +respCode);
	        	  Assert.assertTrue(true);
	          }
	       //  a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);

	         

	     

	      }

	     

	    // a.assertAll();

}
	
}
