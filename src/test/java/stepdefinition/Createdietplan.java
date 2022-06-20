package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertEquals;



public class Createdietplan {
	
	@Given("The user is in My Patients page")
	public void the_user_is_in_My_Patients_page() {
		System.out.println("My patient page");
	    
	}
  @When("The user clicks on Create New Report")
	public void the_user_clicks_on_create_new_report() {
	  System.out.println("Create New Report");
	  
	}

	@Then("The user should navigated to the Confirm Health Conditions and Generate a new Diet plan page")
	public void the_user_should_navigated_to_the_confirm_health_conditions_and_generate_a_new_diet_plan_page() {
		  System.out.println("Confirm Health Conditions");
	
	}

	@Given("The user is in Confirm Health Conditions and Generate a new Diet plan page")
	public void the_user_is_in_confirm_health_conditions_and_generate_a_new_diet_plan_page() {
		 System.out.println("Confirm Health Conditions reached");
	
	}

	@When("The user clicks on Browse button")
	public void the_user_clicks_on_browse_button() {
		 System.out.println("Browse");
	   
	}

	@When("The user selects a pdf file and clicks Done")
	public void the_user_selects_a_pdf_file_and_clicks_done() {
		System.out.println("pdf file");
	   
	}

	@Then("The user should see the selected file in the field next to the Browse button")
	public void the_user_should_see_the_selected_file_in_the_field_next_to_the_browse_button() {
		System.out.println("selected file");
	    
	}

	@When("The user clicks on upload")
	public void the_user_clicks_on_upload() {
		System.out.println("upload file");
	}

	@Then("An error message {string} should be displayed")
	public void an_error_message_should_be_displayed(String error) {
		
		System.out.println("error");

	}

	@When("The user browses a pdf file of size less than 2MB")
	public void the_user_browses_a_pdf_file_of_size_less_than_2mb() {
		System.out.println("incorrect pdf");
	 
	}

	@When("The user clicks on Upload button")
	public void the_user_clicks_on_upload_button() {
		System.out.println("upload pdf");
	
	}

	@Then("The user should see a message {string}")
	public void the_user_should_see_a_message(String uploaded) {
		assertEquals(uploaded, "File uplaoded successfully");
		System.out.println("upload");
	
	}

	@When("The user browses a non pdf file of size less than 2MB")
	public void the_user_browses_a_non_pdf_file_of_size_less_than_2mb() {
		System.out.println("upload non pdf");

	}

	@Then("The user should see an error message {string}")
	public void the_user_should_see_an_error_message(String error) {
		assertEquals(error, "PDF files within the size limit of 2MB");
		
	}

	@When("The user browses a pdf file of size greater than 2MB")
	public void the_user_browses_a_pdf_file_of_size_greater_than_2mb() {
		
		System.out.println("browse pdf");
	}

	@When("The user browses a non pdf file of size greater than 2MB")
	public void the_user_browses_a_non_pdf_file_of_size_greater_than_2mb() {
		System.out.println("browse non-pdf");
	  
	}

	@Then("The user should be able to select the health conditions in options {int} and {int}")
	public void the_user_should_be_able_to_select_the_health_conditions_in_options_and(Integer int1, Integer int2) {
		System.out.println("select health conditions option 1");
	 
	}

	@When("The user selects the health conditions of the patient in option {int}")
	public void the_user_selects_the_health_conditions_of_the_patient_in_option(Integer int1) {
		System.out.println("select health conditions option 2");
	  
	}

	@When("The user clicks on Confirm button in option {int}")
	public void the_user_clicks_on_confirm_button_in_option(Integer int1) {
		System.out.println("confrim health conditions");
	  
	}

	@Then("The health conditions will be updated")
	public void the_health_conditions_will_be_updated() {
		System.out.println("conditions updated");
	
	}

	@When("The user clicks on Confirm button")
	public void the_user_clicks_on_confirm_button() {
		System.out.println("confirm");
	

	}

	@Then("The health conditions will not be updated")
	public void the_health_conditions_will_not_be_updated() {
		System.out.println("error");
	
	}

	@Given("The user is in the Confirm Health Conditions and Generate a new Diet plan page")
	public void the_user_is_in_the_confirm_health_conditions_and_generate_a_new_diet_plan_page() {
		System.out.println("confirm health conditions");
	 
	}

	@When("The user clicks on Confirm after selecting health conditions in option {int}")
	public void the_user_clicks_on_confirm_after_selecting_health_conditions_in_option(Integer int1) {
		System.out.println("confirm button clicked");
	
	}

	@When("The user clicks on Generate Menu button")
	public void the_user_clicks_on_generate_menu_button() {
		System.out.println("generate menu");
	
	}

	@Then("A new diet plan with latest confirmed health conditions should be generated")
	public void a_new_diet_plan_with_latest_confirmed_health_conditions_should_be_generated() {
		System.out.println("new diet plan");
	
	}

	@When("The user clicks on Confirm without selecting health conditions in option {int}")
	public void the_user_clicks_on_confirm_without_selecting_health_conditions_in_option(Integer int1) {
		System.out.println("no health condition selection");

	}

	@Then("A default diet plan should be generated")
	public void a_default_diet_plan_should_be_generated() {
		System.out.println("default diet plan");
	    
	}













}
