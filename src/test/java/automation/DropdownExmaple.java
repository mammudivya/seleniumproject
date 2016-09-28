package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownExmaple {
	
	FirefoxDriver driver;
	String btn = "input#gh-btn";
	String searchfield = "gh-ac";
	String selectBox = "select#gh-cat";
	
	
	@BeforeMethod
	public void start(){
		driver = new FirefoxDriver();
		}
	
	@Test
	public void test(){
		
		driver.get("http://www.ebay.co.uk");
		
		WebElement searchlink = driver.findElementById(searchfield);
		searchlink.sendKeys("iphone");
		
		WebElement searchButton = driver.findElement(By.cssSelector(btn));
		Select selectDropdown = new Select(driver.findElement(By.cssSelector(selectBox)));
		selectDropdown.selectByVisibleText("Art");
		
		searchButton.click();	
	}
	
	@AfterMethod
	public void quit(){
		driver.quit();
		}

}
