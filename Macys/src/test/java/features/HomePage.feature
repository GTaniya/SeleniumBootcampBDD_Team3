Feature: SearchBox Functionality check

  Background:
    Given I am on the Macy's home page

    Scenario Outline: user able to search items in macy's home page
      When I click search input
      And  I enter "<searchText>" in the search bar
      Then I verify "<expectedText>" in search bar



      Examples:
      |searchText   |expectedText |
      |activeWear   |activewear   |
      |wallet       |wallet       |
      |woman sandals|woman sandals|
      |leggings     |leggings     |
      |ruby rings   |ruby rings   |
















