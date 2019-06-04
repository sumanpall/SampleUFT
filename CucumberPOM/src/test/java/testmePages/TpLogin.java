package testmePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TpLogin {
	
	WebDriver driver;
	public TpLogin(WebDriver driver) {
		this.driver=driver;
		
	}

	@FindBy(linkText="SignIn")
	public static WebElement loginlink;
	
	@FindBy(how=How.NAME,name="userName")
	public static WebElement user;
	
	public void tesLogin(String username,String password) {
		user.sendKeys(username);
	}
	
	
	
	
	
	
}
