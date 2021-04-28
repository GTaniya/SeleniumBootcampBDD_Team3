Feature: VideogamesConsolesPage functionality check
  Background:
    Given I am on Ebay homepage

    Scenario Outline: Able to search in Ebay search bar
     When I click on search bar
      And I typed in "<SearchValue>" in the search bar
      And I should see "<ExpectedValue>" in the search bar
      Then I verify "<ExpectedURL>" in page
      Examples:
        |SearchValue         |ExpectedValue       |ExpectedURL          |
        |PS5                 |PS5                 |https://www.ebay.com/|
        |Xbox Series X       |Xbox Series X       |https://www.ebay.com/|
        |Switch Lite         |Switch Lite         |https://www.ebay.com/|
        |Monster Hunter Rise |Monster Hunter Rise |https://www.ebay.com/|
        |Yakuza Like a Dragon|Yakuza Like a Dragon|https://www.ebay.com/|
















