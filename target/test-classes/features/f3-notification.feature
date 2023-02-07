Feature: Notification
  Scenario: TC7 - User successfully see all notification
    Given user is on homepages
    And user has company
    When user click menu notification
    And user click All button
    Then user verify notification result

  Scenario: TC8 - User successfully see all unread notification
    Given user is on homepages
    And user has company
    When user click menu notification
    And user click All unread
    Then user verify unread result

  Scenario: TC9 - User successfully search notification with filter by team
    Given user is on homepages
    And user has company
    When user click menu notification
    And user click icon filter
    And user input team name
    Then user verify filter notif result





