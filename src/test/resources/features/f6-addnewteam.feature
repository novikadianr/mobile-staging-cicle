Feature: Add new Team
  Scenario: TC17 - User successfully add new team
    Given user is on homepages
    And user has company
    When user click iconplus
    And user click add new team
    And user input name team
    And user input description team
    And user click create team button
    Then user verify new team result

  Scenario: TC18 - User failed add new team with null name
    Given user is on homepages
    And user has company
    When user click iconplus
    And user click add new team
    And user input description team
    And user click create team button
    Then user verify null name result

  Scenario: TC19 - User successfully add new team with null description
    Given user is on homepages
    And user has company
    When user click iconplus
    And user click add new team
    And user input name team
    And user click create team button
    Then user verify null description result



