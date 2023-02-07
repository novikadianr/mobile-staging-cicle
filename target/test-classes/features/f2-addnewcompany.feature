Feature: Add new Company
  Scenario: TC3 - User successfully add new company
    Given user is on homepages
    When user click create new company button
    And user input company name
    And user input company description
    And user click create button
    Then user verify add company result

  Scenario: TC4 - User failed login with null name
    Given user is on homepages
    When user click create new company button
    And user input company description
    And user click create button
    Then user see error message

  Scenario: TC5 - User failed login with null description
    Given user is on homepages
    When user click create new company button
    And user input company name
    And user click create button
    Then user see error message

  Scenario: TC6 - User failed login with null field
    Given user is on homepages
    When user click create new company button
    And user click create button
    Then user see error message