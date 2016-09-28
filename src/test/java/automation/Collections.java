package automation;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Collections {
	
	FirefoxDriver driver;
	String searchbtn = "input#twotabsearchtextbox";
	String headerLinks = "div#nav-xshop a";
	
	@BeforeMethod
	public void start(){
		driver = new FirefoxDriver();
		}
	
	@Test
	public void test(){
		driver.get("http://www.amazon.co.uk");
		Assert.assertEquals("Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more", driver.getTitle());
		List<WebElement> links = new ArrayList<WebElement>();
		links = driver.findElementsByCssSelector(headerLinks);
		Integer size = links.size();
		String mystr = size.toString();
		Assert.assertEquals("5", mystr);
		for(WebElement element: links){
			System.out.println("link text value :"+element.getText());
		}	
	}
	
	@AfterMethod
	public void quit(){
		driver.quit();
		}


}
