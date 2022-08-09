Feature: Library app login feature
  user story:As a user, I should be able to login to LibraryCT.

  @AC1 @librarian
  Scenario: librarian

    Given "librarian" is on the "login" page
    Then verify that the title is "Login - Library"
    When "librarian" enters valid email address and password
    And "librarian" click on "sign in"
    Then verify that there are 3 modules on the page

  @AC2 @student
  Scenario: student

    Given "student" is on the "login" page
    Then verify that the URL is "https://library2.cydeo.com/login.html"
    When "student" enters valid email address and password
    And "student" click on "Sign in"
    Then verify that there are 2 modules on the page

  @AC3 @negative
  Scenario: negative

    Given "user" is on the "login" page
    When "user" enters invalid email address or password
    And "user" click on "sign in"
    Then verify the error message "Sorry, Wrong Email or Password"


  Scenario Outline: Login FUnctionality

    Given "user" is on the "login" page
    When I enter "<username>" into "username" input box
    And  I enter "<password>" into "password" input box
    And I click "sign in" button on login page
    Then verify that there are "<modules>" modules on the page
    And verify the error message "<message>"

    Examples:
      | username | modules | message                 |
      | Olga     | 2       |                         |
      | Semih    |         | Wrong email or password |



