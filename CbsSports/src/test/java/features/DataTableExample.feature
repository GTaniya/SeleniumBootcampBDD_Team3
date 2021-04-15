Feature: Learn Data Tables

  Background:
    Given I am on amazon homePage


  Scenario: Data Table Example with header
    And I click on Account & Lists
    And I enter Email or mobile phone number
      | Email or mobile phone number |
      | mh.shahib@gmail.com          |
    And I click on continue button
    And I enter password
      | Password |
      | test123  |
    And I click on signIn Button
    Then I should see "There was a problem"

  @mahmud
  Scenario: Data Table Example without header
    And I click on Account & Lists
    And I enter Email or mobile phone number from table
      | demo1@gmail.com |
    And I click on continue button
    And I enter password from table
      | test123 |
    And I click on signIn Button
    Then I should see "There was a problem"


  Scenario: Amazon sign up using single column
    And I click on Account & Lists
    And I click on Create your Amazon account
    And I enter user information
      | Mahmud              |
      | mh.shahib@gmail.com |
      | test123             |
      | test123             |
    When I click on Create your Amazon account
    Then I verify amazon account created successfully

  Scenario: Amazon sign up using multiple column
    And I click on Account & Lists
    And I click on Create your Amazon account
    And I enter user information from table
      | YourName        | Mahmud1              |
      | Email           | mh.shahib@gmail.com |
      | Password        | test123             |
      | ReEnterPassword | test123             |
    When I click on Create your Amazon account
    Then I verify amazon account created successfully
    And I enter user information from table using multiple column
      | YourName | Email               | Password | ReEnterPassword |
      | Mahmud   | mh.shahib@gmail.com | test123  | test123         |





