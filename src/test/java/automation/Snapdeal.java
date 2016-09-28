package automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Snapdeal {
	FirefoxDriver driver;
	String btn = "input#inputValEnter";
	@BeforeMethod
	public void start(){
		driver = new FirefoxDriver();
	}
	@Test
	public void test(){
		driver.get("http://www.snapdeal.com");
		WebElement searchbtn = driver.findElementByCssSelector(btn);
		searchbtn.sendKeys(" ");
		//searchbtn.click();
	}
	@AfterMethod
	public void quit(){
		//driver.quit();
	}

}
