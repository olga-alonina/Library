Feature: Library app add feature
  As a librarian, I should be able to add a new user.

  @US3 @librarian
  Scenario: librarian
  Given "librarian" is on the "Library" page
    When "librarian" click "Books" module
    And "librarian" click on "Add Book"
    When "librarian" enter "bookname", "isbn","year","author","description"
    And "librarian" click on "save changes"
    Then verify "the book has been created."
