package automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ebayclass {
	
	FirefoxDriver driver;	
	String searchfields = "gh-ac";
	//String serchfields = "//gh-tb.ui-autocomplete-input[@type='text']";

	String searchbtn = "gh-btn";
	String link = "lvtitle";
	
	@BeforeMethod
	public void start(){
		driver = new FirefoxDriver();
		}
	
	@Test
	public void test(){
		driver.get("http://www.ebay.co.uk");
		//driver.findElementByClassName("gh-tbl2").sendKeys("abc");
		WebElement searchlink = driver.findElementById(searchfields);
		searchlink.sendKeys("iphone");
		WebElement searchbotton = driver.findElementById(searchbtn);
		searchbotton.click();
		WebElement linkbotton = driver.findElementByClassName(link);
		linkbotton.click();
	}
	
	@AfterMethod
	public void quit(){
		//driver.quit();
		}
}
