package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	 

	@Given("user is on Login Page")
	public void user_is_on_login_page() {
	    System.out.println("user is on Login Page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    System.out.println("user enters username and Passoword");
	}

	@And("clicks on Login button")
	public void clicks_on_login_button() {
	   System.out.println("click on Login button");
	}

	@Then("user should nevigate to the Hoempage")
	public void user_should_nevigate_to_the_hoempage() {
	    System.out.println("User is nevigated to the Homepage");
	}

}
