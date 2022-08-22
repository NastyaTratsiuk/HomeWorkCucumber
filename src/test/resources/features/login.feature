
Feature: testing logIn form

  Background:
    Given login page is open.

  @smoke
  Scenario: successful authorization.
    When elements on login page are visible.
    Then login page is open: "User name" input, "Last name" input, "Password" input and button "LOG IN".

  @regression
  Scenario: opening a link to help with authorization.
    When login page is open: button "Need help logging in?".
    Then success page is open: successful opening of the help page.