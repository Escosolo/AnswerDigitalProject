@DeleteItemInBag

Feature: DeleteItemInBagTest

  Scenario: As a user I want to delete item from my basket so I can see basket is empty
    Given I go to the landing page and I validate title of page
    And I enter search details
    When I click on search button
    Then I add an item to cart 
    And I click on cart button
    Then I verify item is added to cart
    Then I verify Shopping cart has a delete button
    And I click on delete button
    Then I verify banner displayed

    
