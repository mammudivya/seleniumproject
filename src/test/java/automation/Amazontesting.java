package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazontesting {
	
	
FirefoxDriver driver;

String search = "twotabsearchtextbox";
//String searchBtnTxt = "nav-input";
	
	@BeforeMethod
	public void start(){
		driver = new FirefoxDriver();
		}
	
	@Test
	public void test(){
		driver.get("http://www.amazon.com");
		
		WebElement searchbox = driver.findElementById(search);
		searchbox.sendKeys("iPhone");
		//WebElement searchBtn = driver.findElement(By.className(searchBtnTxt));
		//searchBtn.click();
		//WebElement searchResult = driver.findElement(By.tagName("h2"));
		//System.out.println("Search results: "+searchResult.getText());
		}
	
	@AfterMethod
	public void quit(){
		//driver.quit();
		}

}
