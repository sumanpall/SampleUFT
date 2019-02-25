package stepDef;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.description.modifier.SynchronizationState;

public class SelDemo {

	@Test
	public void test() {
		//init selenium webdriver
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suman.palle\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");
		//init chrome browser
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		//title of the page
		System.out.println(driver.getTitle());
		driver.findElement(By .linkText("REGISTER")).click();
		driver.findElement(By .name("email")).sendKeys("mary");
		driver.findElement(By .name("password")).sendKeys("mary");
		driver.findElement(By .name("confirmPassword")).sendKeys("mary");
		driver.findElement(By .name("register")).click();
		String str_sts=driver.findElement(By .xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		System.out.println(str_sts);
		
		if(str_sts.equals(" Note: Your user name is mary.")){
			System.out.println("Registration is success");
		}
		else {
			System.out.println("Registration is failed");
		}
				
			
			
			
			
		
		
		
		
		
	}

}
