Feature: SearchBox Functionality check

  Background:
    Given I am on the verizon page

    Scenario: user able to buy phone accessories
      When I click shop menu list
      And  I click accessories
      And  I click cases and protection
      And  I click Iphone cases button
      Then I verify "<expectedTextValue>" in header












