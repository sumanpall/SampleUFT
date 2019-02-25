package stepDef;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seldemo2 {

	@Test
	public void test() {
		
		//init selenium webdriver
				WebDriver driver;
				System.setProperty("webdriver.chrome.driver","C:\\Users\\suman.palle\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");
				//init chrome browser
				driver=new ChromeDriver();
				driver.get("https://www.amazon.in/");
				//title of the page
				System.out.println(driver.getTitle());
				WebElement ele=driver.findElement(By .name("fromPort"));
				List<WebElement> opt_coll=ele.findElements(By .tagName("option"));
				
				List<WebElement> lnk_coll=driver.findElements(By .tagName("a"));
				System.out.println(lnk_coll.size());
				for(int i=0;i<=lnk_coll.size()-1;i++){
					System.out.println(lnk_coll.get(i).getText());
					String lnk_name=lnk_coll.get(i).getText();
					if(lnk_name.equalsIgnoreCase("Cruises")) {
						lnk_coll.get(i).click();
						System.out.println(driver.getTitle());
						break;						
					}
				}
				
				//driver.close();
		
	}

}
