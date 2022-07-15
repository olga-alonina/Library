Feature: Login with parameters
@librarian11
  Scenario: Login as librarian 11
    Given user is on the login page
    When user enter username "librarian11@library"
    And user enter password "fsRRgXxB"
    And click the sign in button
    Then dashboard should be displayed

@librarian12
  Scenario: Login as librarian 12
    Given user is on the login page
    When user enter username "librarian12@library"
    And user enter password "wHhJQDSK"
    And click the sign in button
    Then dashboard should be displayed
    And there should be "148" users

  @librarian10
  Scenario: Login as librarian same line
    Given user is on the login page
    When user enter "librarian10@library" and "ZIkOcbCa"
    Then dashboard should be displayed
    And there should be "148" users

