#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@dietplan
Feature: Create New Diet Plan page functionality
 

  @test
  Scenario: Test the navigation to Confirm Health Conditions and Generate new Diet plan page  
    Given The user is in My Patients page
    When The user clicks on Create New Report
    Then The user should navigated to the Confirm Health Conditions and Generate a new Diet plan page
    

   @test 
   Scenario: Test if the user is able to browse a pdf file 	
   Given  The user is in Confirm Health Conditions and Generate a new Diet plan page
   When  The user clicks on Browse button
   And   The user selects a pdf file and clicks Done
   Then  The user should see the selected file in the field next to the Browse button
   
 
    @test
  Scenario: Test if the user is able to upload a file without selecting a document
    Given The user is in Confirm Health Conditions and Generate a new Diet plan page
    When The user clicks on upload
    Then An error message "Only files with extension .pdf are allowed" should be displayed
   
    @test
    Scenario: Test if the user is able to upload a file with proper file format and size
   Given  The user is in Confirm Health Conditions and Generate a new Diet plan page
   When  The user browses a pdf file of size less than 2MB 
   And   The user clicks on Upload button
   Then The user should see a message "File uploaded successfully"
   
     @test
    Scenario: Test if the user is able to upload a file with incorrect file format and proper size
   Given  The user is in Confirm Health Conditions and Generate a new Diet plan page
   When  The user browses a non pdf file of size less than 2MB 
   And   The user clicks on Upload button
   Then The user should see an error message "Only files with extension .pdf are allowed"
   
     @test
    Scenario: Test if the user is able to upload a file with proper file format and incorrect size
   Given  The user is in Confirm Health Conditions and Generate a new Diet plan page
   When  The user browses a pdf file of size greater than 2MB 
   And   The user clicks on Upload button
   Then The user should see an error message "PDF files exceeding the size limit of 2MB"
   
    @test
    Scenario: Test if the user is able to upload a file with incorrect file format and incorrect size
   Given  The user is in Confirm Health Conditions and Generate a new Diet plan page
   When  The user browses a non pdf file of size greater than 2MB 
   And   The user clicks on Upload button
   Then The user should see an error message "Only files with extension .pdf are allowed"
 

   
   @confirm
    Scenario: Test the selection of health conditions in options 1 and 2
   Given The user is in My Patients page
    When The user clicks on Create New Report
    Then The user should navigated to the Confirm Health Conditions and Generate a new Diet plan page
    And The user should be able to select the health conditions in options 1 and 2  
   
   
    @confirm
   Scenario: Test if the user is able to update health conditions in option 1
   Given The user is in Confirm Health Conditions and Generate a new Diet plan page
   When The user selects the health conditions of the patient in option 1
   And  The user clicks on Confirm button in option 1
   Then The health conditions will be updated
   
   
     @confirm
   Scenario: Test if the user is able to update the health conditions in option 1 without selecting health conditions
   Given  The user is in Confirm Health Conditions and Generate a new Diet plan page
   When  The user clicks on Confirm button 
   Then The health conditions will not be updated 
    
    @confirm
   Scenario: Test if the user is able to update health conditions in option 2
   Given The user is in Confirm Health Conditions and Generate a new Diet plan page
   When The user selects the health conditions of the patient in option 2
   And  The user clicks on Confirm button in option 2
   Then The health conditions will be updated
    
   @confirm
   Scenario: Test if the user is able to update the health conditions in option 2 without selecting health conditions
   Given  The user is in Confirm Health Conditions and Generate a new Diet plan page
   When  The user clicks on Confirm button 
   Then The health conditions will not be updated
   
   
     @generatemenu
   Scenario: Test if the Menu is generated after updating health conditions in option 1
   Given  The user is in the Confirm Health Conditions and Generate a new Diet plan page  
   When   The user clicks on Confirm after selecting health conditions in option 1
   And The user clicks on Generate Menu button 
   Then  A new diet plan with latest confirmed health conditions should be generated
   
      @generatemenu
   Scenario: Test if the Menu is generated after updating health conditions in option 2
   Given  The user is in the Confirm Health Conditions and Generate a new Diet plan page  
   When   The user clicks on Confirm after selecting health conditions in option 2
   And The user clicks on Generate Menu button 
   Then  A new diet plan with latest confirmed health conditions should be generated

      @generatemenu
   Scenario: Test if the Menu is generated without updating health conditions in option 1
   Given  The user is in the Confirm Health Conditions and Generate a new Diet plan page  
   When   The user clicks on Confirm without selecting health conditions in option 1
   And    The user clicks on Generate Menu button 
   Then  A default diet plan should be generated
   
      @generatemenu
   Scenario: Test if the Menu is generated without updating health conditions in option 2
   Given  The user is in the Confirm Health Conditions and Generate a new Diet plan page  
   When   The user clicks on Confirm without selecting health conditions in option 2
   And    The user clicks on Generate Menu button 
   Then  A default diet plan should be generated
   
   

   
