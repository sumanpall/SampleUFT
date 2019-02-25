Feature: Processing of refunds

@FunTest
Scenario Outline: Customer registration
  Given Jeff is at the user registration page
  When jeff provides valid "<username>" and valid "<password>" 
  Then user registration is success

  Examples: 
  | username |password|
  | peter| parker|
  | mary  | jane   |
  
  
  @RegressionTest @FunTest
 Scenario Outline: verification of links
 	 Given application is opened
 	 When user provides the link name as "<name>"
 	 Then verify the cruises is page is opened or not
 	 
 Examples:
 |name|
 |Cruises|
 
 @SanityTest
 Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters Credentials to LogIn
    | testuser_1 | Test@153 |
	Then Message displayed Login Successfully
 
  
 
