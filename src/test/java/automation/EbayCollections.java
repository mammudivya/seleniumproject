package automation;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;  
import org.testng.annotations.Test;

public class EbayCollections {
	
	FirefoxDriver driver;
	String headerlinks = "div#navigationFragment td[role='listitem']";
	String title = "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay";
	
	
	@BeforeMethod
	public void start(){
	driver = new FirefoxDriver();
	}
	
	@Test
	public void test(){
		driver.get("http://www.ebay.co.uk");
		Assert.assertEquals(title, driver.getTitle());
		List<WebElement> links = new ArrayList<WebElement>();
		links = driver.findElementsByCssSelector(headerlinks);
		int size = links.size();
		Assert.assertEquals(12,  size);
		for(WebElement element:links){
			System.out.println("link text value :"+element.getText());
		}
	}
	
	@AfterMethod
	public void quit(){
		driver.quit();
	}

}
