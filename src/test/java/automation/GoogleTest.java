package automation;


//import org.testng.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTest {
	FirefoxDriver driver;
	String search = "sbtc";
	
	
	@BeforeMethod
	public void start(){
		driver = new FirefoxDriver();
		
		}
	
	@Test
	public void test(){
		driver.get("http://www.google.com");
		WebElement searchbox = driver.findElementById(search);
		searchbox.sendKeys("iphone");
		}
	
	@AfterMethod
	public void quit(){
		//driver.quit();
		}
	
	
	
	
	
	
	
	
	
	
	

}
