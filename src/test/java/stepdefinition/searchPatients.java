package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchPatients {
	@Given("User is on my patients")
	public void user_is_on_my_patients() {
	    
	}

	@When("User starts typing inside name, email or phone number filter box")
	public void user_starts_typing_inside_name_email_or_phone_number_filter_box() {
	    
	}

	@Then("Text inside name, email and phone number filter box should disappear")
	public void text_inside_name_email_and_phone_number_filter_box_should_disappear() {
		System.out.println("text in filter box should disappear");
	   
	}

	@When("User gets data from data sheet with {string} and {string}")
	public void user_gets_data_from_data_sheet_with_and_sheet1(String testId,String sheetName) {
	   System.out.println("enter name, email ");
	}
	@When("User gets data from data sheet with {int} and sheet1")
	public void user_gets_data_from_data_sheet_with_and_sheet1(Integer int1) {
		System.out.println("enter phone number");
	}
	@Then("Records for <name phrase> are shown")
	public void records_for_name_phrase_are_shown() {
		System.out.println("show patient results for given name");
	  
	}

	@Then("Records for <email phrase> are shown")
	public void records_for_email_phrase_are_shown() {
		System.out.println("show patient results for given email");
	    
	}

	@Then("Records for <phone number> are shown")
	public void records_for_phone_number_are_shown() {
		System.out.println("show patient results for given phone number");
	  
	}
	@Given("User is on my patients page after logged in")
	public void user_is_on_my_patients_page_after_logged_in() {
		System.out.println("user in my patient page");
	    
	}

	@When("User types in anything other than number in phone number field")
	public void user_types_in_anything_other_than_number_in_phone_number_field() {
		System.out.println("user types invalid data in phone number"); 
	}

	@Then("It must throw error message and discontinue search action")
	public void it_must_throw_error_message_and_discontinue_search_action() {
		System.out.println("Display error message");
	}

	@When("User types in anything other valid character in email address field")
	public void user_types_in_anything_other_valid_character_in_email_address_field() {
		System.out.println("user types invalid data in email");
	}

	@When("User types in anything other alphabets in name field")
	public void user_types_in_anything_other_alphabets_in_name_field() {
		System.out.println("user types invalid data in name");
	}

	@When("User clicks on search button with all fields empty")
	public void user_clicks_on_search_button_with_all_fields_empty() {
		System.out.println("click search button");
	}

	@Then("Displays all patients for that dietician only")
	public void displays_all_patients_for_that_dietician_only() {
		System.out.println("Displays all patients");
	}

	@When("User clicks on search button with or without all fields empty")
	public void user_clicks_on_search_button_with_or_without_all_fields_empty() {
		System.out.println("clicks search button");
	}

	@Then("It shows columns name like Record Number, Cust ID, Name, Details, Last Visit and Actions")
	public void it_shows_columns_name_like_record_number_cust_id_name_details_last_visit_and_actions() {
		System.out.println("show patient details");
	}

	
}
