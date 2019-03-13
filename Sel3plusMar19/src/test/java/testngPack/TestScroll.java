package testngPack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestScroll {
	
	
	@Test
	public void scrollPage() throws Exception {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suman.palle\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");
			driver=new ChromeDriver();		
			driver.get("http://jqueryui.com/");
			//to maximize the browser window
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());	
			Thread.sleep(3000);
			
			((JavascriptExecutor)driver).executeScript("scroll(0,500)");
			
		
	}

}
