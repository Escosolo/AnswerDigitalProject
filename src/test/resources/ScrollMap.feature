@ScrollMap

  Feature: ScrollMapTest

    Scenario: As a user, I want to scroll through the map
      Given I go to the landing page
      And I click on Our stores button
      And I drag the map to see a store in West Palm Beach
      Then I capture a screenshot