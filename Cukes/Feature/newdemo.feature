Feature: Refund of item

  Background: 
    Given user application is available
  @RegressionTest
  Scenario Outline: Verify the login
    When user provides "<user>" and "<pass>" as credentials
    Then login is success

    Examples: 
      | user | pass |
      | demo | demo |
      
  @FunctionalTest 
  Scenario: Verify the registration
    Given user is at the registration page
    When user provides registration details
    Then signup is success
  @FunctionalTest
  Scenario: Verify the registration
    Given user is at the registration page
    When user provides registration details
    Then signup is success
