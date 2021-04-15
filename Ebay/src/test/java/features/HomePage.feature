Feature: SearchBox Functionality check

  Background:
    Given I am on ebay homePage

  @smokeTest
    Scenario: Search item and click submit button
      When I click on search bar
      And I enter Macbook into search field
      And I click on search button
      Then I should see "Macbook" as result header

















