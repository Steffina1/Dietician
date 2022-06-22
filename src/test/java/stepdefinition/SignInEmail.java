package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInEmail {

	@When("User clicks Log In button with valid email and empty password")
	public void user_clicks_log_in_button_with_valid_email_and_empty_password() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("User gets a message Please fill the password")
	public void user_gets_a_message_please_fill_the_password() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("User clicks Log In button with all fields empty")
	public void user_clicks_log_in_button_with_all_fields_empty() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("User gets  error message {string}")
	public void user_gets_error_message(String string) {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("User clicks Google button to log in")
	public void user_clicks_google_button_to_log_in() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("User is redirected to Google logIn page")
	public void user_is_redirected_to_google_log_in_page() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("ser clicks Log In button with valid email and invalid password")
	public void ser_clicks_log_in_button_with_valid_email_and_invalid_password() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("User gets a message")
	public void user_gets_a_message(String string) {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("User clicks Log In with both valid email and password")
	public void user_clicks_log_in_with_both_valid_email_and_password() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("User gets a message logged in successfully and sees signout button")
	public void user_gets_a_message_logged_in_successfully_and_sees_signout_button() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("User clicks sign up link")
	public void user_clicks_sign_up_link() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("User is redirected to Register Page")
	public void user_is_redirected_to_register_page() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("User clicks Facebook button to log in")
	public void user_clicks_facebook_button_to_log_in() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("User is redirected to Facebook  login Page")
	public void user_is_redirected_to_facebook_login_page() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("User clicks Log In button with invalid email and valid password")
	public void user_clicks_log_in_button_with_invalid_email_and_valid_password() {
		// Write code here that turns the phrase above into concrete actions
	}
	@Then("User gets error message message Invalid Login credentials")
	public void user_gets_error_message_message_invalid_login_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on Forgot Password button")
	public void user_clicks_on_forgot_password_button() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("User is redirected to reset password page")
	public void user_is_redirected_to_reset_password_page() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("User clicks Log In with both invalid email and password")
	public void user_clicks_log_in_with_both_invalid_email_and_password() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("User gets error message String}")
	public void user_gets_error_message_message(String message) {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("User should see message Please fill with valid email id")
	public void user_should_see_message_Please_fill_with_valid_email_id() {
	}

	@Then("User gets a message Invalid Password.Please try again")
	public void user_gets_a_message_Invalid_Password_Please_try_again() {
	}

}