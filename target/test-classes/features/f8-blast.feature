Feature: Blast Functionality
  Scenario: TC24 - User successfully create blast
    Given user is on homepages
    And user has company
    And user already has team
    When user click menu blast
    And user click icon add blast
    And user input title blast
    And user input description
    And user click publish button
    Then user verify create blast result