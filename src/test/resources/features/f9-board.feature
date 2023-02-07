Feature: Board Functionality
  Scenario: TC25 - User successfully add new list
    Given user is on homepages
    And user has company
    And user already has team
    When user click menu board
    And user click icon add list
    And user input list name
    And user click submit button
    Then user verify addlist result

  Scenario: TC26 - User successfully add new card
    Given user is on homepages
    And user has company
    And user already has team
    When user click menu board
    And user click add new card button
    And user input name card
    And user click ceklist button
    Then user verify addcard result

  Scenario: TC27 - User successfully edit descrition card
    Given user is on homepages
    And user has company
    And user already has team
    When user click menu board
    And user click card
    And user click icon edit description
    And user input description of card
    And user click button publish
    Then user verify edit card result

  Scenario: TC28 - User successfully add label card
    Given user is on homepages
    And user has company
    And user already has team
    When user click menu board
    And user click card
    And user click add label
    And user click create label button
    And user input label name
    And user choose color label
    And user click submit
    Then user verify add label result

  Scenario: TC29 - User successfully add attachfile on card
    Given user is on homepages
    And user has company
    And user already has team
    When user click menu board
    And user click card
    And user click attach file button
    And user click allow permision
    And user upload file
    Then user verify attachfile result

  Scenario: TC30 - User successfully add comment on card
    Given user is on homepages
    And user has company
    And user already has team
    When user click menu board
    And user click card
    And user input comment
    And user click submit button comment
    Then user verify comment result

  Scenario: TC31 - User successfully moved card
    Given user is on homepages
    And user has company
    And user already has team
    When user click menu board
    And user moved card
    Then user verify card result