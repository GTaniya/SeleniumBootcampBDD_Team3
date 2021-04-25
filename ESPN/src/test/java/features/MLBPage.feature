Feature: Page Functionality check

  Background:
    Given I am on ESPN homePage


  @smokeTest
  Scenario Outline: User able to select Players
    When I click MLB
    And I click stats
    Then I select "<players>" in the page

    Examples:
      |     players    |
      |Nico Hoerner    |
      |Nick Maton      |
      |Yermin Mercedes |
      |Ronald Acuna Jr.|
      |Mike Trout      |
      |Steven Matz     |


  Scenario:



















