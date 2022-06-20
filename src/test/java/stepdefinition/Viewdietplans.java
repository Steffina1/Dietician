package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Viewdietplans {
	@Given("The user is in my patients page")
	public void the_user_is_in_my_patients_page() {
	    System.out.println("The user is in my patients page");
	}

	@When("The user clicks on View Previous Diet Plans of the patient")
	public void the_user_clicks_on_view_previous_diet_plans_of_the_patient() {
		System.out.println("The user clicks view previous diet plans");
	}

	@Then("The user should be navigated to View Recent Diets page")
	public void the_user_should_be_navigated_to_view_recent_diets_page() {
		System.out.println("The user is in View Recent Diets page");
	}

	@Then("The user should see the heading {string} on the page")
	public void the_user_should_see_the_heading_on_the_page(String string) {
	  System.out.println("Generate Diet Plans");
	}
	
	@Given("The user is in the Dietician home page")
	public void the_user_is_in_the_dietician_home_page() {
	    System.out.println("The user is in Dietician Home page");
	    
	}


	@When("The user clicks on Diet Plans in the menu bar")
	public void the_user_clicks_on_diet_plans_in_the_menu_bar() {
		System.out.println("The user clicks diet plans");
	}

	

	@Then("The user should see {int} patient records in the View Recent Diets page")
	public void the_user_should_see_patient_records_in_the_view_recent_diets_page(Integer int1) {
		System.out.println("5 records");
	}

	@Then("The user should see pagination displayed below the patient records")
	public void the_user_should_see_pagination_displayed_below_the_patient_records() {
		System.out.println("pagination displayed");
	}

	@Then("The next page button should be enabled")
	public void the_next_page_button_should_be_enabled() {
		System.out.println("next page button enabled");
	}

	@Then("The previous page button should be disabled")
	public void the_previous_page_button_should_be_disabled() {
		System.out.println("previous page button disabled");
	}

	@Then("The next page and previous page buttons below the patient records should be disabled")
	public void the_next_page_and_previous_page_buttons_below_the_patient_records_should_be_disabled() {
		System.out.println("next page and previous page buttons disabled");
	}

	@Given("The user is in View Recent Diets page")
	public void the_user_is_in_view_recent_diets_page() {
		  System.out.println("The user is in View Recent Diets page");
	}

	@When("The user clicks on the next page button")
	public void the_user_clicks_on_the_next_page_button() {
		System.out.println("next page button clicked");
	}

	@When("The user lands on the last page")
	public void the_user_lands_on_the_last_page() {
		  System.out.println("The user is in last page");
	}

	@Then("The next page button should be disabled")
	public void the_next_page_button_should_be_disabled() {
		System.out.println("next page button disabled");
	}

	@Then("The previous page button should be enabled")
	public void the_previous_page_button_should_be_enabled() {
		System.out.println("previous page button enabled");
	}

	@When("The user traverses to the second page")
	public void the_user_traverses_to_the_second_page() {
		 System.out.println("The user is in second page");
	}

	@When("The user selects the previous page button")
	public void the_user_selects_the_previous_page_button() {
		System.out.println("previous page button clicked");
	}

	@Then("The user should traverse to the first page")
	public void the_user_should_traverse_to_the_first_page() {
		 System.out.println("The user is in first page");
	}

	@When("The user clicks on view pdf")
	public void the_user_clicks_on_view_pdf() {
		System.out.println("view pdf is clicked");
	}

	@Then("The user should see {int} details in the pdf")
	public void the_user_should_see_details_in_the_pdf(Integer int1) {
		System.out.println("Patient details, Doctor details, Patient health details, 7-day menu, warnings, Comments");
	}

	@When("The user clicks on download")
	public void the_user_clicks_on_download() {
		System.out.println("download button is clicked");
	}

	@Then("The pdf is downloaded successfully")
	public void the_pdf_is_downloaded_successfully() {
		System.out.println("pdf is downloaded successfully");
	}
	

}
