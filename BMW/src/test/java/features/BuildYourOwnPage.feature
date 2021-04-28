Feature: BuildYourOwnPage functionality check
  Background:
    Given I am on BMW homepage

    Scenario Outline: Able to search in BMW search bar
      When I click on search button
      And I click on search bar
      And I typed in "<SearchValue>" in the search bar
      And I should see "<ExpectedValue>" in the search bar
      Then I verify "<ExpectedURL>" in page


      Examples:
      |SearchValue|ExpectedValue|ExpectedURL             |
      |X1         |X1           |https://www.bmwusa.com/ |
      |X2         |X2           |https://www.bmwusa.com/ |
      |X3         |X3           |https://www.bmwusa.com/ |
      |X4         |X4           |https://www.bmwusa.com/ |
      |X5         |X5           |https://www.bmwusa.com/ |


















