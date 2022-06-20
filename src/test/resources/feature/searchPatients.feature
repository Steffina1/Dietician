@searchPatient
Feature: Search Patients detail
  I want to use this template for my feature file

    
    @test
  Scenario: Verify default text in name, email and phone filter input box disappears after started typing in it

    Given User is on my patients 
    When User starts typing inside name, email or phone number filter box
    Then Text inside name, email and phone number filter box should disappear
   
  @test
  Scenario Outline: Search patients by name filter
    Given User is on my patients
    When User gets data from data sheet with <testId> and <sheetname>
    Then Records for <name phrase> are shown
    
    Examples:
    |testId| sheetname|
    |1| sheet1|
    
    @test
  Scenario Outline: Search patients by email filter
    When User gets data from data sheet with <testId> and <sheetname>
    Then Records for <email phrase> are shown
    
     Examples:
    |testId| sheetname|
    |2| sheet1|
    
    
    @test
  Scenario Outline: Search patients by phone number filter
    When User gets data from data sheet with <testId> and <sheetname>
    Then Records for <phone number> are shown
    
  Examples:
    |testId| sheetname|
    |3| sheet1|
    
     @test
  Scenario: Display error messages for invalid phone number in phone filter
    Given User is on my patients page after logged in
    When User types in anything other than number in phone number field
    Then It must throw error message and discontinue search action
    
   @test
  Scenario: Display error messages for invalid email in email filter
    When User types in anything other valid character in email address field
    Then It must throw error message and discontinue search action
    
    @test
  Scenario: Display error messages for invalid character in name  filter
    When User types in anything other alphabets in name field
    Then It must throw error message and discontinue search action

  @test
  Scenario: Display Display list of patients for clicking search button
    Given User is on my patients page after logged in
    When User clicks on search button with all fields empty
    Then Displays all patients for that dietician only
    
     @test
  Scenario: Display list of patients details for clicking search button
    When User clicks on search button with or without all fields empty
    Then It shows columns name like Record Number, Cust ID, Name, Details, Last Visit and Actions 
   