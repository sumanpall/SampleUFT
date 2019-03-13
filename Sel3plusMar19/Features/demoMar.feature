Feature: Refund of An item

  Background: pre-requisite
    Given User logged into the app

  @RegressionTest
  Scenario Outline: User Registration
    When user provides valid "<user>" and "<pass>" credentials
    Then registration is successful

    Examples: 
      | user  | pass   |
      | mary  | jane   |
      | peter | parker |

  @Functional @Smoke
  Scenario: Refund of microscope
    #To set the context
    Given alex brought microscope for $100
    And alex has receipt
    #To start a event
    When alex returned the microscope
    #Outcome of event
    Then alex should get $100 refund

  @RegressionTest
  Scenario Outline: User Registration
    When user provides valid "<user>" and "<pass>" credentials
    Then registration is successful

    Examples: 
      | user | pass   |
      | john | jane   |
      | mike | parker |
