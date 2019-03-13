package testngPack;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTest {
	
	@Test
	public void test() throws Exception {
			
		DesiredCapabilities dc=DesiredCapabilities.chrome();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WIN10);
		//hub url
		URL url=new URL("http://10.247.150.60:6666/wd/hub");
		//System.setProperty("webdriver.ge.driver","C:\\Users\\suman.palle\\Downloads\\chromedriver.exe");
		WebDriver driver=new RemoteWebDriver(url,dc);
					
			driver.get("http://newtours.demoaut.com/mercurywelcome.php");
			//to maximize the browser window
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());	

}
}
