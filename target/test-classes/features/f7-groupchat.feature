Feature: Group Chat Functionality
  Scenario: TC20 - User successfully send message
    Given user is on homepages
    And user has company
    And user already has team
    When user click menu group chat
    And user input message
    And user click icon send message button
    Then user verify message result

  Scenario: TC21 - User successfully Send Message with Attachfile
    Given user is on homepages
    And user has company
    And user already has team
    When user click menu group chat
    And user click icon attachfile
    And user menu image from camera
    And user click icon camera
    And user click icon ceklist
    Then user verify image message result

  Scenario: TC22 - User successfully Retake picture
    Given user is on homepages
    And user has company
    And user already has team
    When user click menu group chat
    And user click icon attachfile
    And user menu image from camera
    And user click icon camera
    And user click icon retake
    Then user verify retake image result

  Scenario: TC23 - User successfully Cancel send picture
    Given user is on homepages
    And user has company
    And user already has team
    When user click menu group chat
    And user click icon attachfile
    And user menu image from camera
    And user click icon camera
    And user click icon cancel
    Then user verify result