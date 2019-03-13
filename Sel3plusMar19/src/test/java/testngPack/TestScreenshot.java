package testngPack;




import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;




public class TestScreenshot {
	
	WebDriver driver;
	@Test
	public void testActions() throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suman.palle\\Downloads\\\\SeleniumBroDrivers\\chromedriver.exe");

			driver=new ChromeDriver();
			/*driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			WebDriverWait w=new WebDriverWait(driver,20);
			w.until(ExpectedConditions.presenceOfElementLocated(By .name("password")));*/
			driver.get("http://www.newtours.demoaut.com/");	
			//takes the screenshot
			
			File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			//Saving the screenshot file
			FileHandler.copy(file, new File("C:\\Users\\suman.palle\\Desktop\\Selenium\\s2.jpg");
			
			


}
}
