Feature: Redfin Home Page Functionalities check

  Background:
    Given I am on Redfin Home Page

  @smokeTest
  Scenario: Check Home dashboard
    When I click on sell
    And I scroll down to offers
    And I click Offers
    Then Verify page header "Better agents. Lower fees." in Sell Page

  Scenario: Check Controlling your Account & Alerts
    When I scroll down to Help in the bottom of the page
    And  I click help link
    And  I click controlling Alerts button
    Then Verify page header "Controlling your Account & Alerts" in Controlling Alerts page

  Scenario: View Log in with Facebook or Google
    When I scroll down to Help in the bottom of the page
    And  I click help link
    And  I click controlling Alerts button
    And  I click Log in with Facebook or Google Link
    Then Verify page header "Log in with Facebook or Google +" in Log in with Facebook or Google Page

  Scenario: View Password Reset
    When I scroll down to Help in the bottom of the page
    And  I click help link
    And  I click controlling Alerts button
    And  I click password reset link
    And  I scroll down to bottom of the page
    And  I click Yes in Help Topic
    Then Verify page header "Password Reset" in Password reset page

  Scenario: Check Internships & Early Career at Redfin
    When I scroll down to Help in the bottom of the page
    And  I click Jobs
    And  I click see all Departments button
    And  I scroll down to Early Careers
    And  I click Early Careers
    Then Verify page header "Internships & Early Career at Redfin" in Internships Page

  Scenario: Check Job Data Engineer Intern
    When I scroll down to Help in the bottom of the page
    And  I click Jobs
    And  I click see all Departments button
    And  I scroll down to Early Careers
    And  I click Early Careers
    And  I click Data Engineer Intern
    Then Verify page header "Data Engineer Intern" in Data Engineer job page

  Scenario: Check Real State Jobs
    When I scroll down to Help in the bottom of the page
    And  I click Jobs
    And  I click see all Departments button
    And  I scroll down to Real state
    And  I click Real State
    And  I click learn more in real state agent
    Then Verify page header "Redfin sets you up for success" in Real state Agent page

  Scenario: Check Real State Apply to be a Lead Agent
    When I scroll down to Help in the bottom of the page
    And  I click Jobs
    And  I click see all Departments button
    And  I scroll down to Real state
    And  I click Real State
    And  I click learn more in real state agent
    And  I click Apply Now
    Then Verify header "Apply to be a Lead Agent" In real state agent job

  Scenario: Submit a request in Redfin Page
    When I scroll down to Contact us
    And  I click Contact Us
    And  I click Message Us
    Then Verify header "Submit a request" in Contact Page

  Scenario: View Help technical Assistance
    When I scroll down to Contact us
    And  I click Contact Us
    And  I click Message Us
    And  I click Drop down menu
    And I click Technical Assistance
    Then Verify header "Submit a request" in Contact Page


    Scenario Outline: User able to Search In Redfin homepage search bar
      When I click on search bar
      And I enter "<searchText>" in search bar
      And I should see "<expectedValue>" values in search bar
      But I should not see "<notExpectedValue>" values in the search bar
      Then I verify "<expectedUrl>" as page url

      Examples:
        | searchText |expectedValue|notExpectedValue|     expectedUrl       |
        |GermanTown  |GermanTown   |Burger404       |https://www.redfin.com/|
        |Fallschurch |Fallschurch  |Pizza404        |https://www.redfin.com/|
        |Gaithersburg|Gaithersburg |Masks404        |https://www.redfin.com/|
        |Bethesda    |Bethesda     |Fries404        |https://www.redfin.com/|


    Scenario Outline: User able to click on Cites in California Home for sale
      When I click California Home for sale link
      And I click "<searchCities>" in California home for Sale page


      Examples:
        | searchCities    |
        |Los Angeles, CA  |
        |San Diego, CA    |
        |San Francisco, CA|
        |San Jose, CA     |






