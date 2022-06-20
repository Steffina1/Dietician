 package stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyPatientpage {
	
	WebDriver driver;
	
	@Given("User is on any page after login")
	public void user_is_on_any_page_after_login() {
		System.out.println("User is in dietician UI");
	}

	@When("User clicks on My Patients tab")
	public void user_clicks_on_my_patients_tab() {
		System.out.println("click My patients tab");
	}

	@Then("My Patients tab is selected or highlighted")
	public void my_patients_tab_is_selected_or_highlighted() {
		System.out.println("Highlight my patients tab");
	}

	@Then("Page title is displayed as My Patients")
	public void page_title_is_displayed_as_my_patients() {
		System.out.println("Display My patients");
	}

	@Then("Name, email, phone number filter options and search button are displayed")
	public void name_email_phone_number_filter_options_and_search_button_are_displayed() {
		System.out.println("Display name,email,phone number and search button");
	}
	@Given("User is on my patient page")
	public void user_is_on_my_patient_page() {
		System.out.println("User is on my patient page");
	}

	@When("User clicks search on my patient")
	public void user_clicks_search_on_my_patient() {
		System.out.println("lick my patient");
	}

	@Then("cust Id, name, detail, last visit and actions are shown in column")
	public void cust_id_name_detail_last_visit_and_actions_are_shown_in_column() {
		System.out.println("Show patient details");
	}

	@Given("User in on my patient after clicked search")
	public void user_in_on_my_patient_after_clicked_search() {
		System.out.println("click search");
	}

	@When("User clicks on button View Previous Diet Plans")
	public void user_clicks_on_button_view_previous_diet_plans() {
		System.out.println("click view previous diet plan");
	}

	@Then("It redirects user to Generated Diet Plans page")
	public void it_redirects_user_to_generated_diet_plans_page() {
		System.out.println("redirects to Generated Diet Plans page");
	}

	@When("User clicks on button Create New Report\\/Plan")
	public void user_clicks_on_button_create_new_report_plan() {
		System.out.println("click Create New Report");
	}

	@Then("It redirects user to Confirm Health Conditions and Generate a New Diet plan page")
	public void it_redirects_user_to_confirm_health_conditions_and_generate_a_new_diet_plan_page() {
		System.out.println("redirects to Confirm Health Conditions");
	}

	@When("User clicks on button View Previous Test Reports on patient record")
	public void user_clicks_on_button_view_previous_test_reports_on_patient_record() {
		System.out.println("click View Previous Test Reports");
	}

	@Then("It redirects user to View Patient Test Reports page")
	public void it_redirects_user_to_view_patient_test_reports_page() {
		System.out.println("redirect to View Patient Test Reports ");
	}
}
