@reportdata
Feature: Test report data
  I want to use this template for my feature file

   @test
  Scenario: Verify test report deatails
    Given User is on my patients page
    When User clicks  View Previous Test Reports
    Then It should have Doc-ID, record numner, uploaded time, report name and health conditions
  
  @test
  Scenario: Verify pagination
  Given User is on my patients page
  When User clicks  View Previous Test Reports
  Then More than three records should be displayed on different pages through pagination
  
   @test
  Scenario: Verify pagination
  When User clicks  View Previous Test Reports
  Then Pagination has Previous and Next link
  
   @test
  Scenario: Verify content of PDF file
    Given User is on View Patient Test Reports page
    When  user clicks on View PDF
    Then PDF is opened in proper readable format
    
  @test
  Scenario: Verify deatails of PDF file
    Given User is on View Patient Test Reports page
    When user clicks on View PDF
    Then PDF should have patient and doctor detail, list of conditions,co-morbidites diet menu