Feature: Search functional
  Scenario: TC10 - User successfully searching team
    Given user is on homepages
    And user has company
    When user click tab search
    And user click team name
    Then user verify search by team result

  Scenario: TC11 - User successfully searching
    Given user is on homepages
    And user has company
    When user click tab search
    And user input team name or menu
    Then user verify search result



