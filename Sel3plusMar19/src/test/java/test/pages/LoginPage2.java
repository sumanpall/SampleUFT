package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage2 {
	
	WebDriver driver;
	
	public LoginPage2(WebDriver driver) {
		this.driver=driver;
		}
	
	//1
	@FindBy(name="userName")
	WebElement user;
	
	@FindBy(name="password")
	WebElement pass;
	//2
	@FindBy(how=How.NAME,using="login")
	WebElement signin;
	
	public void login_flight(String u_name,String password) {
		user.sendKeys(u_name);
		pass.sendKeys(password);
		signin.click();
	}

	
	
	
	

}
