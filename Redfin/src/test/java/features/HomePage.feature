Feature:  SearchBox Functionality check

  Background:
    Given I am on the redfin page

    Scenario Outline:user able to search different location
      When I click search button
      And  I click on the search bar
      And  I enter "<searchText>" in the search bar
      Then I verify "<expectedTextValue>" in search bar




      Examples:
      |searchText   |expectedTextValue|
      |Fairfax      |Fairfax          |
      |Ashburn      |Ashburn          |
      |Tysons Corner|Tysons Corner    |
      |Arlington    |Arlington        |
      |Sterling     |Sterling         |

















