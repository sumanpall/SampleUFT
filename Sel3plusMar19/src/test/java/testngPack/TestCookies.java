package testngPack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCookies {

	@Test
	public void cookTest() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suman.palle\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");
			driver=new ChromeDriver();		
			driver.get("https://www.google.co.in/");
			//driver.findElement(By .linkText("Gmail")).click();
			System.out.println(driver.getTitle());
			
			Set<Cookie> cook_coll=driver.manage().getCookies();
			System.out.println(cook_coll.size());
			for(Cookie c:cook_coll) {
				System.out.println("Name: "+c.getName());
				if(c.getName().equalsIgnoreCase("NID")) {
					System.out.println(c.getDomain());
				}
				System.out.println("Domain:"+c.getDomain());
				System.out.println("Path:"+c.getPath());
				System.out.println("Value:"+c.getValue());
				System.out.println("Expiry:"+c.getExpiry());
			}
			driver.manage().deleteAllCookies();			
			Set<Cookie> after_cook_coll=driver.manage().getCookies();
			System.out.println(after_cook_coll.size());			
			for(Cookie c:after_cook_coll) {
				System.out.println(c.getName());
				System.out.println(c.getDomain());
				System.out.println(c.getPath());
				System.out.println(c.getValue());
			}
			
	}

		
		
		
}
