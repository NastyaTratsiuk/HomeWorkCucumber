
Feature: flight testing

  @regression
  Scenario: make sorting flexible.
    Given do a flight search continue.
    When flight page is open (Flexibility): button "Flexibility".
    Then success page is open: flexibility sorting was successful.

  @regression
  Scenario: display of the airport where the stop will be.
    Given do a flight search continue.
    When flight page is open (Stop): button "Stop".
    Then success page is open: see the airport.

  @regression
  Scenario: checking free seats.
    Given do a flight search continue.
    When flight page is open (Seats): button "Seats".
    Then success page is open: shown page with free seats.