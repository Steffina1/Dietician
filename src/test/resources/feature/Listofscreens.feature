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
@screens
Feature: List of screens functionality
  

  @screen
  Scenario: Test the navigation of Screens page
    Given The user is in the homepage
    When The user clicks on hamburger button on the top right corner of the page 
    Then A list of clickable links with the heading "Screens" is displayed
   

  @screen
  Scenario: Test the navigation of user Sign in page in the screen list
    Given The user is in the homepage
    When The user clicks on Sign in from the list after clicking hamburger button 
    Then The user should be re-directed to the sign in page 

      @screen
  Scenario: Test the navigation of register page in the screen list
    Given The user is in the homepage
    When The user clicks on register after clicking hamburger button
    Then The user should be re-directed to the register page 
 
      @screen
  Scenario: Test the navigation of team page in the screen list
    Given The user is in the homepage
    When The user clicks on team from the list after clicking hamburger button 
    Then The user should be re-directed to the team page 
   
         @screen
  Scenario: Test the navigation of testimonials page in the screen list
    Given The user is in the homepage
    When The user clicks on testimonials from the list after clicking hamburger button 
    Then The user should be re-directed to the testimonials page  
    
             @screen
  Scenario: Test the navigation of forgot password page in the screen list
    Given The user is in the homepage
    When The user clicks on forgot password from the list after clicking hamburger button 
    Then The user should be re-directed to the forgot password page  
    
          @screen
  Scenario: Test the navigation of contact page in the screen list
    Given The user is in the homepage
    When The user clicks on contact from the list after clicking hamburger button 
    Then The user should be re-directed to the contact page  
    
              @screen
  Scenario: Test the navigation of blogs page in the screen list
    Given The user is in the homepage
    When The user clicks on blogs from the list after clicking hamburger button 
    Then The user should be re-directed to the blogs page  
    
                   @screen
  Scenario: Test the navigation of featured content page in the screen list
    Given The user is in the homepage
    When The user clicks on featured content from the list after clicking hamburger button 
   Then The user should be re-directed to the featured content page   
    
                  @screen
  Scenario: Test the navigation of home page in the screen list
    Given The user is in the homepage
    When The user clicks on home from the list after clicking hamburger button 
    Then The user should be in the home page   
    
                  @screen
  Scenario: Test the navigation of view recent diets page in the screen list before signing in with dietician account
    Given The user is in the homepage
    When The user clicks on view recent diets from the list after clicking hamburger button  
    Then The user should be re-directed to the sign in page 
    
           @screen
  Scenario: Test the navigation of view recent diets page in the screen list after signing in with dietician account
    Given The user is in Dietician home page 
    When The user clicks on view recent diets from the list after clicking hamburger button 
    Then The user should be re-directed to the view recent diets page
    
            @screen
  Scenario: Test the navigation of view recent test reports page in the screen list before signing in with dietician account
    Given The user is in the homepage
    When The user clicks on view recent test reports from the list after clicking hamburger button 
    Then The user should be re-directed to the sign in page 
    
       @screen
  Scenario: Test the navigation of view recent test reports page in the screen list after signing in with dietician account
    Given The user is in the Dietician homepage
    When The user clicks on view recent test reports from the list after clicking hamburger button 
   Then The user should be re-directed to the view recent test reports page
    
    
        @screen
  Scenario: Test the navigation of add new patient page in the screen list before signing in with dietician account
    Given The user is in the homepage
    When The user clicks on add new patient from the list after clicking hamburger button 
    Then The user should be re-directed to the sign in page
    
    
        @screen
  Scenario: Test the navigation of add new patient page in the screen list after signing in with dietician account
    Given The user is in the Dietician homepage
    When The user clicks on add new patient from the list after clicking hamburger button
    Then The user should be re-directed to the add new patient page
    
     @screen
  Scenario: Test the navigation of Dietician home page in the screen list before signing in with dietician account
    Given The user is in the homepage
    When The user clicks on Dietician home from the list after clicking hamburger button
    Then The user should be re-directed to the sign in page
    
    
     @screen
  Scenario: Test the navigation of Dietician home page in the screen list after signing in with dietician account
    Given The user is in the Dietician homepage
    When The user clicks on Dietician home from the list after clicking hamburger button 
    Then The user should stay in the Dietician home page
    
      @screen
  Scenario: Test the navigation of My patients page in the screen list before signing in with dietician account
    Given The user is in the homepage
    When The user clicks on My patients from the list after clicking hamburger button 
    Then The user should be re-directed to the sign in page
    
    
      @screen
  Scenario: Test the navigation of My patients page in the screen list after signing in with dietician account
    Given The user is in the Dietician homepage
    When The user clicks on My patients from the list after clicking hamburger button 
   Then The user should be re-directed to My patients page
    
    @screen
  Scenario: Test the navigation of Confirm health conditions page in the screen list before signing in with dietician account
    Given The user is in the homepage
    When The user clicks on on Confirm conditions and create plan from the list after clicking hamburger button 
    Then The user should be re-directed to the sign in page
    
     @screen
  Scenario: Test the navigation of Confirm health conditions page in the screen list after signing in with dietician account
    Given The user is in the Dietician homepage
    When The user clicks on Confirm conditions and create plan from the list after clicking hamburger button 
    Then The user should be re-directed to the Confirm conditions and create plan page
    