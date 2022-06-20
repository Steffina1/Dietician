package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class patientsTestReport {
	
	@Given("User is on my patients page")
	public void user_is_on_my_patients_page() {
		System.out.println("User is on my patients"); 
	    }

	@When("User clicks  View Previous Test Reports")
	public void user_clicks_view_previous_test_reports() {
		System.out.println("click View Previous Test Reports");  
	}

	@Then("It should have Doc-ID, record numner, uploaded time, report name and health conditions")
	public void it_should_have_doc_id_record_numner_uploaded_time_report_name_and_health_conditions() {
		System.out.println("details of patients"); 
	}

	@Then("More than three records should be displayed on different pages through pagination")
	public void more_than_three_records_should_be_displayed_on_different_pages_through_pagination() {
		System.out.println("page links"); 
	}

	@Then("Pagination has Previous and Next link")
	public void pagination_has_previous_and_next_link() {
		System.out.println("Previous and Next link");    
	}
	
	@Given("User is on View Patient Test Reports page")
	public void user_is_on_view_patient_test_reports_page() {
		System.out.println(" View Patient Test Reports");    
	}

	@When("user clicks on View PDF")
	public void user_clicks_on_view_pdf() {
		System.out.println("click pdf ");  
	}

	@Then("PDF is opened in proper readable format")
	public void pdf_is_opened_in_proper_readable_format() {
		System.out.println("pdf should open"); 
	}

	@Then("PDF should have patient and doctor detail, list of conditions,co-morbidites diet menu")
	public void pdf_should_have_patient_and_doctor_detail_list_of_conditions_co_morbidites_diet_menu() {
		System.out.println("pdf shows patient"); 
	}

}
