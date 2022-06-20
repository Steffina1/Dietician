@MypatientPage
Feature: Verifying My Patient page features
 
 @test
  Scenario: Verify My Patient tab
    Given User is on any page after login
    When User clicks on My Patients tab
    Then Page title is displayed as My Patients 
    
  @test
    Scenario: Verify My Patient tab 
   Given User is on any page after login
    When User clicks on My Patients tab
    Then My Patients tab is selected or highlighted
    
  @test 
    Scenario: Verify My Patient tab
    Given User is on any page after login
    When User clicks on My Patients tab
    Then Name, email, phone number filter options and search button are displayed

 @test
  Scenario: Verify Patient record detail
    Given User is on my patient page 
    When User clicks search on my patient
    Then cust Id, name, detail, last visit and actions are shown in column
   
@test
  Scenario: Verify Patient diet plan
    Given User in on my patient after clicked search
    When User clicks on button View Previous Diet Plans
    Then It redirects user to Generated Diet Plans page
  
@test
  Scenario: verify Create new diet plan
    When User clicks on button Create New Report/Plan
    Then It redirects user to Confirm Health Conditions and Generate a New Diet plan page
   
 @test  
 Scenario: View patients previous test reports
    When User clicks on button View Previous Test Reports on patient record
    Then It redirects user to View Patient Test Reports page