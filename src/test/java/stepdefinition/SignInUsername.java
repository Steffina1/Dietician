package stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInUsername {

	@Given("User is on Sign In Page")
	public void user_is_on_sign_in_page() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("User clicks Sign In with valid field entries")
	public void user_clicks_sign_in_with_valid_field_entries() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("User logged in successfully")
	public void user_logged_in_successfully() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("User clicks Sign In button entering numeric values for Username and valid values for password")
	public void user_clicks_sign_in_button_entering_numeric_values_for_username_and_valid_values_for_password() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("User should get a message Invalid entry for first field")
	public void user_should_get_a_message_invalid_entry_for_first_field() {
		// Write code here that turns the phrase above into concrete action
	}

	@When("User clicks on Forgot Password link")
	public void user_clicks_on_forgot_password_link() {
	}

	@Then("User should be directed to {string} page")
	public void user_should_be_directed_to_page(String string) {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("User clicks on {string} link")
	public void user_clicks_on_link(String string) {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("User will land on Register Page")
	public void user_will_land_on_register_page() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("User clicks Sign In button in the Sign In form with all fields empty")
	public void user_clicks_sign_in_button_in_the_sign_in_form_with_all_fields_empty() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("User should get error message {string}")
	public void user_should_get_error_message(String string) {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("User clicks Sign In button entering lengthy password")
	public void user_clicks_sign_in_button_entering_lengthy_password() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("User should get a message Invalid entry for password field")
	public void user_should_get_a_message_invalid_entry_for_password_field() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Given("User is on {string} Page")
	public void user_is_on_this_page(String page) {

	}

	@Then("User should be directed to Reset password page")
	public void user_should_be_redirected_to_reset_password_page() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("User clicks on not member yet link")
	public void user_clicks_on_not_member_yet_link() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("User clicks Sign In button with all fields empty")
	public void user_clicks_Sign_In_button_with_all_fields_empty() {
	}

	@Then("User should get error message Please fill out the fields")
	public void user_should_get_error_message_Please_fill_out_the_fields() {
	}

	@Then("User should get an error message")
	public void user_should_get_error_an_message(DataTable dataTable) {
		String message = dataTable.asList().get(0);

	}
}