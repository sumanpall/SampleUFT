package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdefCukes{
	
	WebDriver driver;
	
	@Given("[A-Za-z]+ has brought a microwave for (\\d+)$")
	public void jeff_has_brought_a_microwave_for(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Jeff purchased microwave");
	}

	@Given("he has receipt$")
	public void he_has_receipt() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("Jeff has receipt");
	}

	@When("[A-Za-z]+ returned the faulty microwave$")
	public void jeff_returned_the_faulty_microwave() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("Fault microwave");
	}

	@Then("[A-Za-z]+ should get refund of (\\d+)$")
	public void jeff_should_get_refund_of(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("Jeff got refund");
	}
	
	@Given("^user application is available$")
	public void user_application_is_available() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\suman.palle\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://newtours.demoaut.com/");	  
		 System.out.println(driver.getTitle());
		  
	}

	@When("^user provides \"(.*?)\" and \"(.*?)\" as credentials$")
	public void user_provides_and_as_credentials(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By .name("userName")).sendKeys(arg1);
		driver.findElement(By .name("password")).sendKeys(arg2);
		driver.findElement(By .name("login")).click();
		  
	}
	@Then("^login is success$")
	public void login_is_success() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String str=driver.findElement(By .linkText("SIGN-OFF")).getText();
		  if(str.equalsIgnoreCase("SIGN-OFF")) {
			  System.out.println("Login is success");
			 System.out.println(driver.getTitle());
			 driver.findElement(By .linkText("SIGN-OFF")).click();
		  }
		  else {
			  System.out.println("Login is failed");
			  System.out.println(driver.getTitle());
		  }
	}

	@Given("^user is at the registration page$")
	public void user_is_at_the_registration_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By .linkText("REGISTER")).click();
	}

	@When("^user provides registration details$")
	public void user_provides_registration_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println(driver.getTitle());
		driver.findElement(By .linkText("REGISTER")).click();
		driver.findElement(By .name("email")).sendKeys("mary");
		driver.findElement(By .name("password")).sendKeys("mary");
		driver.findElement(By .name("confirmPassword")).sendKeys("mary");
		driver.findElement(By .name("register")).click();
		
	}

	@Then("^signup is success$")
	public void signup_is_success() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
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
