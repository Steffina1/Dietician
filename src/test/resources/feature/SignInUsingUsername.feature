@Signin

Feature: Signin using username
 
  @Test001
  Scenario: Validating Signin process with all fields empty
    Given User is on Sign In Page
    When User clicks Sign In button with all fields empty
    Then User clicks Sign In button in the Sign In form with all fields empty
    
    @Test002
  Scenario: Validating Signin process with invalid username
    Given User is on Sign In Page
    When User clicks Sign In button entering numeric values for Username and valid values for password
    Then User should get a message Invalid entry for first field
  
    
  @Test003
  Scenario: Validating Signin process with invalid password
    Given  User is on Sign In Page
    When User clicks Sign In button entering lengthy password
    Then User should get a message Invalid entry for password field
    
  @Test004
  Scenario: Validating Signin process with Forgot Password link
    Given  User is on Sign In Page
    When User clicks on Forgot Password link
    Then User should be directed to Reset password page

    
  @Test005
  Scenario: Validating Signin process with Not a member yet link
    Given User is on Sign In Page
    When User clicks on not member yet link
    Then User will land on Register Page
    
     @Test006
  Scenario: Validating Signin process with valid entries
    Given User is on Sign In Page
    When  User clicks Sign In with valid field entries
    Then User logged in successfully