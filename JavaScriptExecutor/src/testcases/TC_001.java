package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_001 {
	
	public ChromeDriver driver;
	@BeforeMethod
	public void createDriverInstance() 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void tcase1() throws Exception
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scrolling
		//js.executeScript("window.scrollBy(0,200)", "");   
		
		//alert pop-up
		js.executeScript("alert('Testing');", "");
	}
	
	@AfterMethod
	public void dropDriverInstance() 
	{
		//driver.quit();
	}
	

	

}
