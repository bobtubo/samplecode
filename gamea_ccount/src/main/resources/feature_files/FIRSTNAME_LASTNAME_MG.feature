Feature:
  Password must be at least 6 characters long with at least one number and at least one special character


  Scenario Outline:  Password must be at least 6 characters long with at least one number and at least one special character

    Given I am on the moneygaming registration page
    When I enter "<Password>" into the password field
    Then The account creation should "<Message>"

    Examples:
      | Password | Message    |
      | 1asdf!   | Pass       |
      | 1sdf!    | Fail       |
      | asdfg!   | Fail       |
      | 1sdfgh   | Fail       |
      | asdfgh   | Fail       |
      | !!!$$$   | Fail       |
      | 123456   | Fail       |
      |          | Fail       |


