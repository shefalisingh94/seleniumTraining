package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {

	@Given("^User is on Net Banking login page$")
	public void user_is_on_net_banking_login_page() throws Throwable {
		System.out.println("NetBanking Login page ");
		

	}

	@When("^User login to the application with username and password$")
	public void user_login_to_the_application_with_username_and_password() throws Throwable {
		System.out.println("Login success");

	}

	@Then("^User is landing on Home Page$")
	public void user_is_landing_on_home_page() throws Throwable {
		System.out.println("Home Page displayed ");

	}

	@And("^All cards are displayed$")
	public void all_cards_are_displayed() throws Throwable {
		System.out.println("Cards are displaying ");

	}

}
