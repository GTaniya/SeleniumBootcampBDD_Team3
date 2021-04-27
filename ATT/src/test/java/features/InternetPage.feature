Feature: InternetPage functionality check
  Background:
    Given I am on ATT homepage

    Scenario: User able to check ATT Internet Services
      When I click Internet section
      And I click Plans and Prices
      And I scroll down
      And I click Learn More Button
      Then I verify "The features you need at a price you’ll love" Internet Page

      Scenario Outline: Able to search in ATT search bar
        When I click on search bar
        And I typed in "<SearchValue>" in seach bar
        And I should see "<ExpectedValue>" in search bar
        Then I verify "<ExpectedURL>" in page

        Examples:
          |SearchValue|ExpectedValue|ExpectedURL         |
          |TV         |TV           |https://www.att.com/|
          |Phone      |Phone        |https://www.att.com/|
          |Bundles    |Bundles      |https://www.att.com/|
          |Prepaid    |Prepaid      |https://www.att.com/|


