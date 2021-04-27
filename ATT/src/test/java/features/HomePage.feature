Feature: SearchBox Functionality check

  Background:
    Given I am on the att home page

    Scenario: buy iphone 12
      When I click phone and devices
      And  I scroll down and click iphone twelve
      And  I click iphone twelve
      Then I should see "iPhone 12" in iphone header


      Scenario Outline: user can search phones in att page
        When  I click search bar
        And   I enter "<searchText>" in search bar
        And   I verify "<expectedValue>" in search bar




       Examples:
        |searchText       |expectedValue    |
        |iphone 11        |iphone 11        |
        |iphone 12 pro max|iphone 12 pro max|
        |iphone 7         |iphone 7         |
        |iphone xs        |iphone xs        |
        |iphone xr        | iphone xr       |


















