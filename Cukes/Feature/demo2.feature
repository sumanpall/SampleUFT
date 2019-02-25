Feature: Refund of an item

  Background: 
    When Jeff returned the faulty microwave

  Scenario Outline: Jeff is returned the faulty microwave
    Given Jeff has brought a microwave for "<price>"
    And he has receipt
    Then Jeff should get refund of "<price>"

    Examples: 
      | price |
      |   100 |
      |   200 |

  Scenario: Jeff is returned the faulty microwave
    Given Jeff has brought a microwave for 100
    And he has no receipt
    Then Jeff should not get refund of 100

   
    
  