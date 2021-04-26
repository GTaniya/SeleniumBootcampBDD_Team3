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


  Scenario: User able to search teams
    When I click MLB
    And I click Teams
    And I click schedule in theTeams page
    And I click Los Angeles
    Then I verify "LOS ANGELES ANGELS" header in the page

  Scenario: Check Fantasy BaseBall
    When I click MLB
    And I click Fantasy Baseball
    And I click start New League button
    And I click SignUp
    Then I verify "Create Account" header in Signup Window



















