package testingPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import test.pages.LoginPage2;



public class ExeTest2 {
	
	@Test
	public void verifyLogin() {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suman.palle\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		//LoginPage2 lp1=new LoginPage2(driver);
		
		//PageFactory.
		
		LoginPage2 lp1=PageFactory.initElements(driver,LoginPage2.class);
		
		//Register r=PageFactory.initElements(driver,Register.class);
		
		lp1.login_flight("demo","demo");
		

}
}

