Feature: Page Functionality check

  Background:
    Given I am on ESPN homePage

  @smokeTest
  Scenario Outline: User able to select Players
    When I click MLB
    And I click stats
    And I select "<players>" in the page
    Then I should see "<expectedUrl>" in teams page

    Examples:
      |     players    |expectedUrl                               |
      |Mike Trout      |https://www.espn.com/mlb/player/_/id/30836|
      |Yermin Mercedes |https://www.espn.com/mlb/player/_/id/36148|
      |Jesse Winker    |https://www.espn.com/mlb/player/_/id/32833|


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


    Scenario Outline: User able to search teams
      When I click MLB
      And I click Teams
      Then I select "<teams>" in the team page


      Examples:
        |       teams     |
        |Chicago White Sox|
        |Cleveland Indians|
        |Detroit Tigers   |


      Scenario Outline: User able to search Standings
        When I click MLB
        And I click Standings
        And I select "<standings>" in standing page
        Then I should see "<expectedUrl>" in the each page

        Examples:
          |   standings     |                     expectedUrl                          |
          |Boston Red Sox   |https://www.espn.com/mlb/team/_/name/bos/boston-red-sox   |
          |Toronto Blue Jays|https://www.espn.com/mlb/team/_/name/tor/toronto-blue-jays|
          |New York Yankees |https://www.espn.com/mlb/team/_/name/nyy/new-york-yankees |




















