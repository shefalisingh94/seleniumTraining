package stepDefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {
	@Given("^validate the browser$")
	public void validate_the_browser() throws Throwable {
		System.out.println("validate the browser ");
	}

	@When("^browser is triggered$")
	public void browser_is_triggered() throws Throwable {
		System.out.println("browser is triggered ");
	}

	@Then("^check if browser is started$")
	public void check_if_browser_is_started() throws Throwable {
		System.out.println("check if browser is started ");

	}

	@Given("^User is on Net Banking login page$")
	public void user_is_on_net_banking_login_page() throws Throwable {
		System.out.println("NetBanking Login page ");

	}

	@When("^User login to the application with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_login_to_the_application_with_something_and_something(String strArg1, String strArg2)
			throws Throwable {
		System.out.println(strArg1);
		System.out.println(strArg2);

	}

	@Then("User is landing on Home Page")
	public void user_is_landing_on_home_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("on home page");
	}

	@Then("All cards are displayed {string}")
	public void all_cards_are_displayed(String string) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(string);
	}

	@When("^User signup with following details$")
	public void user_signup_with_following_details(DataTable data) throws Throwable {
		List<List<String>> obj = data.asLists();
		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(0).get(2));
		System.out.println(obj.get(0).get(3));

	}

	@When("^User login to application with (.+) and (.+)$")
	public void user_login_to_the_application_with_and(String username, String password) throws Throwable {
		System.out.println(username);
		System.out.println(password);

	}

}
