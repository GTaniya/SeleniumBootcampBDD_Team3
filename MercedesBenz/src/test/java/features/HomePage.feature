Feature:Mercedes models

  Background:
    Given I am on mercedes home Page

  Scenario Outline: User able to search models in mercedes home page
    When I click search button
    And  I click on the search bar
    And I enter "<searchText>" in the search bar
    Then I verify "<expectedTextValue>" in search bar



    Examples:
    |searchText   |expectedTextValue |
    |cla coupe    |cla coupe         |
    |c-class coupe| c-class coupe   |
    |e class coupe|e class coupe     |
    | gla250 suv  |gla250 suv        |
    |glc suv      |glc suv           |


    Scenario: Find a e class coupe
      When I click vehicle button
      And I click on coupes button
      And I click on vehicle name
      Then I should "Here are vehicles available at a nearby dealer." coupe


      Scenario Outline: user able to click vehicles
        When I click all vehicles
        And I click "<vehicles>" in all vehicle page
        Then I verify "<expectedUrl>" in each page



        Examples:
          | vehicles |expectedUrl                                    |
          |GLA SUV   |https://www.mbusa.com/en/vehicles/class/gla/suv|
          |GLB SUV   |https://www.mbusa.com/en/vehicles/class/glb/suv|
          |GLC SUV   |https://www.mbusa.com/en/vehicles/class/glc/suv|





















