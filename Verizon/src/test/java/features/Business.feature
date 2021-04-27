Feature: Verizon Business Page functionality

  Background:
    Given I am on Verizon Business Page

    @smokeTest
    Scenario: Learn about Harness the power of 5G
      When I scroll down to see solutions
      And I am going to click See solutions Button
      And I am going to click Explore FiveG Link
      And I scroll down
      Then Verify Page header "5G from America’s most reliable network*" of the FiveG Page

  Scenario: View the MSI online
      When I scroll down to read the report
      And  I am going to click read the Report button
      And  I am going to click view the MSI online button
      Then Verify Page header "Foreword" of the MSI Page

  Scenario: View the Apple iPhone SE
      When I scroll down to see all products
      And I am going to click See all products Link
      And I am going to click view details link in Apple iPhone SE
      Then Verify product header "Apple iPhone SE (2020)" in the product page

  Scenario: Change the color of the Apple iPhone SE
      When I scroll down to see all products
      And I am going to click See all products Link
      And I am going to click view details link in Apple iPhone SE
      And I am going to change the iPhone SE color to Red
      Then Verify product header "Apple iPhone SE (2020)" in the product page

  Scenario: View the Samsung Galaxy Note20 5G
      When I scroll down to see all products
      And I am going to click See all products Link
      And I am going to click view details link in Samsung Galaxy
      Then Verify product header "Samsung Galaxy Note20 5G" in the Samsung Product Page

  Scenario: Add Samsung Galaxy to cart
      When I scroll down to see all products
      And I am going to click See all products Link
      And I am going to click view details link in Samsung Galaxy
      And I am going to click Add to Cart Button
      And I click Continue button
      Then Verify header "Are you a new customer or existing customer?" in popup window

  Scenario: Learn about Private IP: Network design for growth
      When I scroll down to see all products
      And I am going to click See all products Link
      And I am going to click networks in left side panel
      And I click learn More in Private IP
      Then Verify header class "" in Private IP Page

  Scenario: Find a Verizon Store
     When I click contact us tab
     And I click Store locator
     Then Verify header "Find a Verizon store"

  Scenario: View Offer and Pricing Details
    When I scroll down to Fios Business Internet
    And I am going to click Fios Business Internet
    And I am going to click View bundle button
    And I am going to click Offer and Pricing Link
    Then verify header "Offer and Pricing Details" in popup window FIOS

  Scenario: Check Fios TV for business
    When I scroll down to see all products
    And I am going to click See all products Link
    And I click Internet and TV
    And I click learn more in FIOS TV
    Then Verify the page header "Fios TV for business" in FIOS TV page







