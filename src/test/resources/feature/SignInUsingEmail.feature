@Signin
Feature: Signin using email

 @Test001
  Scenario: Validating Sign In with Email and password empty
    Given User is on Sign In Page
    When User clicks Log In button with all fields empty
    Then User gets  error message " Please fill out fields in textbox"
    
  @Test002
  Scenario: Validating Sign In with invalid email and valid password
    Given User is on Sign In Page
    When User clicks Log In button with invalid email and valid password
    Then User should see message Please fill with valid email id
  
    
  @Test003
  Scenario: Validating Sign In with valid email and invalid password
    Given  User is on Sign In Page
    When ser clicks Log In button with valid email and invalid password
    Then User gets a message Invalid Password.Please try again
    
  @Test004
  Scenario: Validating Sign In with valid email and empty password field
    Given  User is on Sign In Page
    When User clicks Log In button with valid email and empty password
    Then User gets a message Please fill the password

    
  @Test005
  Scenario: Validating Sign In with both invalid email and password
    Given User is on Sign In Page
    When User clicks Log In with both invalid email and password
    Then User gets error message message Invalid Login credentials
    
  @Test006
  Scenario: Validating Sign In with both valid email and password
    Given User is on Sign In Page
    When  User clicks Log In with both valid email and password
    Then User gets a message logged in successfully and sees signout button
    
   @Test007
  Scenario: Validating Sign In with Forgot your password
    Given  User is on Sign In Page
    When User clicks on Forgot Password button
    Then User is redirected to reset password page

    
  @Test008
  Scenario: Validating Sign In with Facebook button 
    Given User is on Sign In Page
    When User clicks Facebook button to log in
    Then User is redirected to Facebook  login Page
    
  @Test009
  Scenario: Validating Sign In with Google button 
    Given User is on Sign In Page
    When  User clicks Google button to log in
    Then User is redirected to Google logIn page 
       
  @Test010
  Scenario: Validating Sign In with SignUp button
    Given User is on Sign In Page
    When  User clicks sign up link
    Then User is redirected to Register Page