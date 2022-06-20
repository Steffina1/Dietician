package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class List {
	@Given("The user is in the homepage")
	public void the_user_is_in_the_homepage() {
	   System.out.println("The user is in homepage");
	}

	@When("The user clicks on hamburger button on the top right corner of the page")
	public void the_user_clicks_on_hamburger_button_on_the_top_right_corner_of_the_page() {
		 System.out.println("hamburger button is clicked");
		
	}

	@Then("A list of clickable links with the heading {string} is displayed")
	public void a_list_of_clickable_links_with_the_heading_is_displayed(String string) {
		System.out.println("list is displayed");
	}

	@When("The user clicks on Sign in from the list after clicking hamburger button")
	public void the_user_clicks_on_sign_in_from_the_list_after_clicking_hamburger_button() {
		System.out.println("Sign in is clicked");
	}

	@Then("The user should be re-directed to the sign in page")
	public void the_user_should_be_re_directed_to_the_sign_in_page() {
	    System.out.println("The user is in sign in page");
	}

	@When("The user clicks on register after clicking hamburger button")
	public void the_user_clicks_on_register_after_clicking_hamburger_button() {
		 System.out.println("register button is clicked");
	}

	@Then("The user should be re-directed to the register page")
	public void the_user_should_be_re_directed_to_the_register_page() {
		 System.out.println("The user is in register page");
	}

	@When("The user clicks on team from the list after clicking hamburger button")
	public void the_user_clicks_on_team_from_the_list_after_clicking_hamburger_button() {
		 System.out.println("team is clicked");
	}

	@Then("The user should be re-directed to the team page")
	public void the_user_should_be_re_directed_to_the_team_page() {
		 System.out.println("The user is in team page");
	}

	@When("The user clicks on testimonials from the list after clicking hamburger button")
	public void the_user_clicks_on_testimonials_from_the_list_after_clicking_hamburger_button() {
		 System.out.println("testimonials is clicked");
	}

	@Then("The user should be re-directed to the testimonials page")
	public void the_user_should_be_re_directed_to_the_testimonials_page() {
		 System.out.println("The user is in testimonials page");
	}

	@When("The user clicks on forgot password from the list after clicking hamburger button")
	public void the_user_clicks_on_forgot_password_from_the_list_after_clicking_hamburger_button() {
		 System.out.println("forgot password is clicked");
	}

	@Then("The user should be re-directed to the forgot password page")
	public void the_user_should_be_re_directed_to_the_forgot_password_page() {
		System.out.println("The user is in forgot password page");
	}

	@When("The user clicks on contact from the list after clicking hamburger button")
	public void the_user_clicks_on_contact_from_the_list_after_clicking_hamburger_button() {
		 System.out.println("contact is clicked");
	}

	@Then("The user should be re-directed to the contact page")
	public void the_user_should_be_re_directed_to_the_contact_page() {
		System.out.println("The user is in contact page");
	}

	@When("The user clicks on blogs from the list after clicking hamburger button")
	public void the_user_clicks_on_blogs_from_the_list_after_clicking_hamburger_button() {
		 System.out.println("blogs is clicked");
	}

	@Then("The user should be re-directed to the blogs page")
	public void the_user_should_be_re_directed_to_the_blogs_page() {
		System.out.println("The user is in blogs page");
	}

	@When("The user clicks on featured content from the list after clicking hamburger button")
	public void the_user_clicks_on_featured_content_from_the_list_after_clicking_hamburger_button() {
		 System.out.println("featured content is clicked");
	}

	@Then("The user should be re-directed to the featured content page")
	public void the_user_should_be_re_directed_to_the_featured_content_page() {
		System.out.println("The user is in featured content page");
	}

	@When("The user clicks on home from the list after clicking hamburger button")
	public void the_user_clicks_on_home_from_the_list_after_clicking_hamburger_button() {
		System.out.println("home is clicked");
	}

	@Then("The user should be in the home page")
	public void the_user_should_be_in_the_home_page() {
		System.out.println("The user is in home page");
	}

    @Given("The user is in Dietician home page")
	public void the_user_is_in_dietician_home_page() {
		System.out.println("The user is in Dietician home page");
	}
	@When("The user clicks on view recent diets from the list after clicking hamburger button")
	public void the_user_clicks_on_view_recent_diets_from_the_list_after_clicking_hamburger_button() {
	   
	}

	@Then("The user should be re-directed to the view recent diets page")
	public void the_user_should_be_re_directed_to_the_view_recent_diets_page() {
		System.out.println("The user is in view recent diets page");
	}

	@When("The user clicks on view recent test reports from the list after clicking hamburger button")
	public void the_user_clicks_on_view_recent_test_reports_from_the_list_after_clicking_hamburger_button() {
		System.out.println("view recent test reports is clicked");
	}

	@Given("The user is in the Dietician homepage")
	public void the_user_is_in_the_dietician_homepage() {
		System.out.println("The user is in Dietician home page");
	}

	@Then("The user should be re-directed to the view recent test reports page")
	public void the_user_should_be_re_directed_to_the_view_recent_test_reports_page() {
		System.out.println("The user is in view recent test reports page");
	}

	@When("The user clicks on add new patient from the list after clicking hamburger button")
	public void the_user_clicks_on_add_new_patient_from_the_list_after_clicking_hamburger_button() {
		System.out.println("add new test patient is clicked");
	}

	@Then("The user should be re-directed to the add new patient page")
	public void the_user_should_be_re_directed_to_the_add_new_patient_page() {
		System.out.println("The user is in add new patient page");
	}

	@When("The user clicks on Dietician home from the list after clicking hamburger button")
	public void the_user_clicks_on_dietician_home_from_the_list_after_clicking_hamburger_button() {
		System.out.println("Dietician home is clicked");
	}

	@Then("The user should stay in the Dietician home page")
	public void the_user_should_stay_in_the_dietician_home_page() {
		System.out.println("The user is in Dietician home page");
	}

	@When("The user clicks on My patients from the list after clicking hamburger button")
	public void the_user_clicks_on_my_patients_from_the_list_after_clicking_hamburger_button() {
		System.out.println("My patients is clicked");
	}

	@Then("The user should be re-directed to My patients page")
	public void the_user_should_be_re_directed_to_my_patients_page() {
		System.out.println("The user is in My patients page");
	}

	@When("The user clicks on on Confirm conditions and create plan from the list after clicking hamburger button")
	public void the_user_clicks_on_on_confirm_conditions_and_create_plan_from_the_list_after_clicking_hamburger_button() {
		System.out.println("Confirm conditions and create plan is clicked");
	}

	@When("The user clicks on Confirm conditions and create plan from the list after clicking hamburger button")
	public void the_user_clicks_on_confirm_conditions_and_create_plan_from_the_list_after_clicking_hamburger_button() {
		System.out.println("Confirm conditions and create plan is clicked before signing in");
	}

	@Then("The user should be re-directed to the Confirm conditions and create plan page")
	public void the_user_should_be_re_directed_to_the_confirm_conditions_and_create_plan_page() {
		System.out.println("Confirm conditions and create plan is clicked after signing in");
	}

}
