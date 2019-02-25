package stepDef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleDef {
	@Given("^Jeff has brought a microwave for (\\d+)$")
	public void jefff_has_brought_a_microwave_for(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("microwave "+arg1);
	}
	@Given("^he has a receipt$")
	public void he_has_a_receipt() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Jeff has a receipt");
	}
	@When("^he returns the microwave$")
	public void he_returns_the_mircowave() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Jeff returning the microwave");
	}
	@Then("^jeff should be refunded (\\d+)$")
	public void jeff_should_be_refunded(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Jeff got refund of "+arg1);
	}
	@Given("^he has no receipt$")
	public void he_has_no_receipt() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("jeff has no receipt");
	}
	@Then("^jeff should be refunded (\\d+) only if he has transaction proof$")
	public void jeff_should_be_refunded_only_if_he_has_transaction_proof(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("jeff got refund with transaction proof"+arg1);
	}
	
	WebDriver driver;
	@Given("^Jeff is at the user registration page$")
	public void jeff_is_at_the_user_registration_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suman.palle\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");
		//init chrome browser
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		//title of the page
		System.out.println(driver.getTitle());
		driver.findElement(By .linkText("REGISTER")).click();
		System.out.println("Jeff opened the user application page");
	}

	
	@Then("^user registration is success$")
	public void user_registration_is_success() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Registration success");
	}
  
	
	
	
	@When("^jeff provides valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void jeff_provides_valid_and_valid(String user1, String pass1) throws Throwable{
		// Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By .name("email")).sendKeys(user1);
		driver.findElement(By .name("password")).sendKeys(pass1);
		driver.findElement(By .name("confirmPassword")).sendKeys(pass1);
		driver.findElement(By .name("register")).click();
		System.out.println("user"+user1+" pass "+pass1);
	}
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^User enters Credentials to LogIn$")
	public void user_enters_Credentials_to_LogIn(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		//Write the code to handle Data Table
		        
				List<List<String>> data =arg1.raw();
				System.out.println(data.get(0).get(0));
				System.out.println(data.get(0).get(1));
				
				
				
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    //throw new PendingException();
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	
	
	
	
	

}
