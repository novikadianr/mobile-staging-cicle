Feature: Login functional
  Scenario: TC1 - User login with google Account and skip button
    Given user is on app
    And user click skip button
    When user click go to sign in button
    And user click Sign in with Google Account button
    And user click email
    Then user verify login result

  Scenario: TC2 - User login with google Account and button yess
    Given user is on app
    And user click yess button
    When user click go to sign in button
    And user click Sign in with Google Account button
    And user click email
    Then user verify login result
