Feature: Table columns names
  user story:As a user, I should be able to login as librarian. When I go to Users page

  Background:
    Given user is on the login page

  @table_columns
  Scenario: Table columns names
    When "librarian" enters valid email address and password
    And "librarian" click sign in button
    And user click on "Users" link
    Then table should have following column names
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |




