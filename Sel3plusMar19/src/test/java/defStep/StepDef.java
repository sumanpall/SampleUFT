package defStep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	
	
	WebDriver driver;
	
	
	
	
	@Given("^User logged into the app$")
	public void user_logged_into_the_app() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suman.palle\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");
		System.out.println("User logged into the app");
		driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		System.out.println(driver.getTitle());
	}

	@When("^user provides valid \"(.*?)\" and \"(.*?)\" credentials$")
	public void user_provides_valid_and_credentials(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println(arg1+arg2);
		driver.findElement(By .linkText("REGISTER")).click();
		WebElement user=driver.findElement(By .name("email"));
	user.sendKeys(arg1);
		driver.findElement(By .name("password")).sendKeys(arg2);
		driver.findElement(By .name("confirmPassword")).sendKeys(arg2);
		driver.findElement(By .name("register")).click();
	}

	@Then("^registration is successful$")
	public void registration_is_successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Registration is success");
	}

	
	
	@Given("^alex brought microscope for \\$(\\d+)$")
	public void alex_brought_microscope_for_$(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("alex brought microscope for $"+arg1);
	}

	@Given("^alex has receipt$")
	public void alex_has_receipt() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("alex has receipt");
	}

	@When("^alex returned the microscope$")
	public void alex_returned_the_microscope() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("alex returned the microscope");
	}

	@Then("^alex should get \\$(\\d+) refund$")
	public void alex_should_get_$_refund(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("alex should get $"+arg1+" refund");
	}
}
