package testingPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import test.pages.LoginPage;



public class ExeTest {
	
	@Test
	public void verifyLogin() {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suman.palle\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		LoginPage lp=new LoginPage(driver);
	
		
		lp.setUser("mary");
		lp.setPass("jane");
		lp.clickLogin();
		lp.clickHome();
		
		
	}

	
	
}
