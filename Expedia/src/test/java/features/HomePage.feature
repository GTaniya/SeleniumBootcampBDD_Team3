Feature: SearchBox Functionality check

  Background:
    Given I am on the Expedia page

    Scenario Outline: user wants to travel different places
      When I click search button
      And I click on the search bar
      And I enter "<searchText>" in the search bar
      Then I verify "<expectedTextValue>" in search bar




     Examples:
      |searchText|expectedTextValue|
      |las vegas |las vegas        |
      |Miami     |Miami            |
      |Atlanta   |Atlanta          |
      |tulum     |tulum            |
      |san diego |san diego        |










