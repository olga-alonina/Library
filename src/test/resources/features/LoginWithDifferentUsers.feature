Feature:
  user story:As a user, I should be able to login with different users using their correct emails and passwords.
  After I login,I should be able to see username in the account username section.
@Im-working
  Scenario Outline: Verify user information "<email>"
    Given user is on the login page
    When user login using "<email>" and "<password>"
    Then account holder name should be "<name>"
    @students
    Examples:
      | name            | email             | password |
      | Test Student 5  | student5@library  | i1oDgf2d |
      | Test Student 6  | student6@library  | NXhpXJdC |
      | Test Student 7  | student7@library  | QfYjDNXj |
      | Test Student 8  | student8@library  | 1DaJSz1z |
      | Test Student 9  | student9@library  | DFDYll1P |
      | Test Student 10 | student10@library | F8u6OrI2 |
      | Test Student 11 | student11@library | 4VRMTsAB |
      | Test Student 12 | student12@library | 8ENtWqOe |
      | Test Student 13 | student13@library | Y0kaXNMa |
      | Test Student 14 | student14@library | bL1twuqT |

  @librarians
  Examples:
    | name              | email               | password |
    | Test Librarian 5  | librarian5@library  | hj65YBiE |
    | Test Librarian 6  | librarian6@library  | QaG7mkXA |
    | Test Librarian 7  | librarian7@library  | C5WUiPUP |
    | Test Librarian 8  | librarian8@library  | UECJkTnl |
    | Test Librarian 9  | librarian9@library  | MSx8u9n4 |
    | Test Librarian 10 | librarian10@library | ZIkOcbCa |
    | Test Librarian 11 | librarian11@library | fsRRgXxB |
    | Test Librarian 12 | librarian12@library | wHhJQDSK |
    | Test Librarian 13 | librarian13@library | YCJCbmU3 |
    | Test Librarian 14 | librarian14@library | bWN7YaaB |