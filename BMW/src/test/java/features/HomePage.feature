Feature: SearchBox Functionality check

  Background:
    Given I am on the BMW home page

    Scenario: user can check BMW series
      When I click model button
      And  I click BMW SEVEN series
      And I click Gallery
      Then I verify "THE 7 SERIES SEDAN GALLERY" in the Gallery page

















