Feature: Doc and File Functionality
  Scenario: TC32 - User successfully add new doc
    Given user is on homepages
    And user has company
    And user already has team
    When user click docnfiles button
    And user click icon add
    And user click add new doc button
    And user input title
    And user input desc document
    And user click button publis
    Then user verify new doc result

  Scenario: TC33 - User successfully create new folder
    Given user is on homepages
    And user has company
    And user already has team
    When user click docnfiles button
    And user click icon add
    And user click create new folder button
    And user input name folder
    And user click create folder button
    Then user verify new folder result

  Scenario: TC34 - User successfully upload files
    Given user is on homepages
    And user has company
    And user already has team
    When user click docnfiles button
    And user click icon add
    And user click upload file button
    And user upload file doc
    Then user verify file result