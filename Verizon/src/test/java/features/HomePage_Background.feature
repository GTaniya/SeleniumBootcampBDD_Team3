Feature: TMobile HomePage Header

  #Background: common steps by sync way will work with your scenario

  Background:
    Given I am on t_mobile homePage
    And I click on search Button1

  @smokeTest
  Scenario: TMobile searchBox functionality check with valid product
    And I type "my family where"
    When I click on search Button
    And I click on T-Mobile FamilyWhere app
    Then I should see "T-Mobile FamilyWhere app" is properly appeared
    But I should not see "laptop" is appeared
    And I verify "T-Mobile FamilyWhere app | T-Mobile Support"  in product title









