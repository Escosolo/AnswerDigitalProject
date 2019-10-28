@SummerDressSearchPriceChange

  Feature: SummerDressSearchPriceChangeTest

    Scenario: As a user i want to change price range and ensure that search results change as price range changes
      Given I go to the landing page
      When I move my mouse to hover on WOMEN button
      And I click on Summer Dresses button
      When I move the price range slider from $16 - $20
      Then I verify search results are updated
      Then I validate that items returned are within the price range

