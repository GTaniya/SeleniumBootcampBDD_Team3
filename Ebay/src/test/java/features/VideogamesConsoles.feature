Feature: VideogamesConsolesPage functionality check
  Background:
    Given I am on Ebay homepage

    Scenario Outline: Able to search in Ebay search bar
     When I click on search bar
      And I typed in "<SearchValue>" in the search bar
      Examples:
        |SearchValue        |
        |PS5                |
        |Xbox Series X      |
        |Switch Lite        |
        |Monster Hunter Rise|
        |
















