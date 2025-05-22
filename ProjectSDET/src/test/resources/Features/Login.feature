Feature: Login feature

  Scenario: Login with valid creds
    Given the user enters usename
    And the user enters password
    When the user clicks on login button
    Then the user verifies the login

    