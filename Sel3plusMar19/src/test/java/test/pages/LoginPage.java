package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	//Init webdriver
	WebDriver driver;
	//WebElement details
	By user=By .name("userName");
	By pass=By .name("password");
	By signinBtn=By .name("login");	
	By Home_link=By .linkText("Home");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		}
	
	public void setUser(String uid) {
		driver.findElement(user).sendKeys(uid);
	}	
	
	public void setPass(String pwd) {
		driver.findElement(pass).sendKeys(pwd);				
	}
	
	public void clickLogin() {
		driver.findElement(signinBtn).click();
		
	}
	
	public void clickHome() {
		driver.findElement(Home_link).click();
	}
	
	
	
	

}
