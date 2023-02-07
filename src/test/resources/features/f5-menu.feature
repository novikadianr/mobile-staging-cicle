Feature: Tab Menu Functionality
  Scenario: TC12 - User successfully update name company
    Given user is on homepages
    And user has company
    When user click tab menu
    And user click company name
    And user click icon edit
    And user edit name company
    And user click icon save
    Then user verify update name result

  Scenario: TC13 - User successfully update Title company
    Given user is on homepages
    And user has company
    When user click tab menu
    And user click company name
    And user click icon edit
    And user edit title company
    And user click icon save
    Then user verify update title result

  Scenario: TC14 - User successfully update bio company
    Given user is on homepages
    And user has company
    When user click tab menu
    And user click company name
    And user click icon edit
    And user edit bio company
    And user click icon save
    Then user verify update bio result

  Scenario: TC15 - User successfully update profile picture company
    Given user is on homepages
    And user has company
    When user click tab menu
    And user click company name
    And user click icon edit
    And user profile picture
    And user choose picture
    And user click icon save
    Then user verify update profile picture result

  Scenario: TC16 - User successfully logout app
    Given user is on homepages
    And user has company
    When user click tab menu
    And user click logout menu
    And see confirmation
    And click confirmation ok
    Then user verify logout result