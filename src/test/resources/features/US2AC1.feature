Feature: Library app add feature
  user story: As a librarian, I should be able to add a new user.

  @US2 @librarian
  Scenario: librarian
    Given "librarian" is on the "Library" page
    When "librarian" click on "Users"
    And "librarian" click on "Add User"
    When "librarian" enter "full name", "password","email", "address"
    And "librarian" click on "save changes"
    Then verify "the user has been created."