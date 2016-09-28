package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownAmazon {
	FirefoxDriver driver;
	String searchbtn = "input#twotabsearchtextbox";
	String selectbox = "select#searchDropdownBox";
	String btn = "input.nav-input";
	
	@BeforeMethod
	public void start(){
		driver = new FirefoxDriver();
		}
	
	@Test
	public void test(){
		
		driver.get("http://www.amazon.co.uk");
		WebElement searchlink = driver.findElementByCssSelector(searchbtn);
		searchlink.sendKeys("painting");
		Select selectDropdown = new Select(driver.findElement(By.cssSelector(selectbox)));
		selectDropdown.selectByVisibleText("Books");
		WebElement searchbtn = driver.findElementByCssSelector(btn);
		searchbtn.click();
		
	}
	
	@AfterMethod
	public void quit(){
		//driver.quit();
		}

}
