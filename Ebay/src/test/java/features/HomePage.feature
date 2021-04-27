Feature: SearchBox Functionality check

  Background:
    Given I am on ebay homePage

  @smokeTest
  Scenario Outline: User able to Search In Ebay homepage search bar
    When I click on search bar
    And I enter "<searchText>" in search bar
    Then I should see "<expectedValue>" values in search bar


    Examples:
      | searchText |expectedValue|
      |Shoes       |Shoes        |
      |Masks       |Masks        |
      |Watches     |Watches      |
      |Jewelry     |Jewelry      |
      |Tablet      |Tablet       |
      |Headphones  |Headphones   |


    Scenario: Check Fashion Page
      When I click Electronics
      Then I should see "Electronics" in Electronics page

    Scenario: Check Tablets
      When I check on search bar
      And I type to search
      And I click search submit button
      And I click Samsung Galaxy
      Then I verify "Samsung Galaxy Tab A SM-T380 16GB, Wi-Fi, 8.0" in Tablets results


  @smokeTest
  Scenario Outline: User able to Search In ebay homepage search bar
    When I click on search bar
    And I put "<searchValues>" in search bar
    Then I verify "<expectedValues>" in search bar

    Examples:
      |searchValues|expectedValues|
      |TV          |TV            |
      |Perfume     |Perfume       |

    Scenario: User able to check Fashion Page
      When I click Fashion Link
      And I click Women clothing
      And I click Jeans
      And I click Rock Revival
      Then I verify "Rock Revival Jeans for Women" in Jeans results


      Scenario Outline: User able to click Categories in Fashion page
        When I click Fashion Link
        And I select "<fashionCategories>" in fashion page
        And I should see "<expectedHeader>" in each page
        Then I verify "<expectedUrl>" in each page

        Examples:
          | fashionCategories |expectedHeader    |                      expectedUrl                                 |
          |Women's Clothing   |b-pageheader__text|https://www.ebay.com/b/Womens-Clothing/15724/bn_661783            |
          |Men's Clothing     |b-pageheader__text|https://www.ebay.com/b/Mens-Clothing/1059/bn_696958               |
          |Jewelry            |b-pageheader__text|https://www.ebay.com/b/Jewelry/bn_7000259126                      |
          |Watches            |b-pageheader__text|https://www.ebay.com/b/Watches-Parts-Accessories/260324/bn_2408535|











