Feature: fashion earrings functionality

  Background:
    Given I am on Ebay fashion pages

    Scenario: Find a diamond earring
      When I click jewelry
      And I click on fashion earring
      And I scroll down to pink check box
      And I click on pink check box
      Then I should see "Pink Earrings" pink earring page header

      Scenario: Find the pink dropping earrings price
        When I click jewelry
        And I click on fashion earring
        And I scroll down to pink check box
        And I click on pink check box
        And I should see "Pink Earrings" pink earring page header
        And I click on drop earrings
        Then I should see "US $2.82" drop earrings price

        Scenario Outline: User able to search items in ebay home page
          When I click search bar
          And I enter "<searchText>" in search bar
          And I should see "<expectedValue>" in search bar
          But I should not see "<notExpectedValue>" in search bar
          Then I verify  "<expectedUrl>" in ebay page



          Examples:
          |searchText| expectedValue|notExpectedValue    |expectedUrl          |
          |skin care | skin care    |bootcamp404         |https://www.ebay.com/|
          |hand bags | hand bags    |bootcamp404         |https://www.ebay.com/|
          |jewelery  | jewelery     |bootcamp404         |https://www.ebay.com/|
          |shoes     | shoes        |bootcamp404         |https://www.ebay.com/|
          |watches   | watches      |bootcamp404         |https://www.ebay.com/|









