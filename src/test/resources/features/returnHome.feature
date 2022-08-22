
Feature: return home.

  @regression
  Scenario: return home.
    Given do a flight search.
    When flight page is open: button "Home".
    Then success page is open: shown home page.