@SummerDresses


  Feature: SummerDressesTest

    Scenario: As a user I want to select Summer Dresses option and view an item
      Given I go to the landing page and I validate title of page
      When I move my mouse to hover on WOMEN button
      Then I validate that sub-navigation options appear
      And  I click on Summer Dresses button
      Then I verify only Summer items display in the search results
      Then I close the browser

