
Feature: manager trips test

  @regression
  Scenario: check trip management without confirmation locator.
    Given Manager trips is open: button "Manager Trips".
    When manager trips page is open: "First name" input, "Last name" input and button "Find your trip".
    Then success page is open: gives an error message.