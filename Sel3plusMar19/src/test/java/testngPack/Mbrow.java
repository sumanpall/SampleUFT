package testngPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Mbrow {
	
	WebDriver driver;
	
  @Test
  @Parameters("browser")
  public void test(String bro) {
	  
	  System.out.println("User logged into the app");
		
		if(bro.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\suman.palle\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://newtours.demoaut.com/");
			System.out.println(driver.getTitle());
		}
		else if(bro.equalsIgnoreCase("ff")){
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\suman.palle\\Downloads\\SeleniumBroDrivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("http://newtours.demoaut.com/");
			System.out.println(driver.getTitle());
			
		}
		else if(bro.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver","C:\\Users\\suman.palle\\Downloads\\SeleniumBroDrivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			driver.get("http://newtours.demoaut.com/");
			System.out.println(driver.getTitle());
		}
		
  }
}
