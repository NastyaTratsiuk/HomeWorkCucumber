
Feature: testing ticket search

  @smoke
  Scenario: flight search testing.
    Given do a flight search continue.
    When home page is open: "Choose trip" radio buttons, "Airport from" selector, "Airport to" selector, "Passengers" selector, "Date depart" input, "Date return" input and button "Search".
    Then success page is open: successful opening of the flights page.

  @regression
  Scenario: testing incorrect date entry.
    When home page is open (error date): "Choose trip" radio buttons, "Airport from" selector, "Airport to" selector, "Passengers" selector, "Date depart" input, "Date return" input and button "Search".
    Then success page is open: an error appears when entering dates.

  @regression
  Scenario: vacation package search.
    Given vacation package is open: button "Vacation package".
    When home page is open: "Airport from" selector, "Airport to" selector, "Passengers" selector, "Date depart" input,"Date return" input, "Fare preference" selector and button "Search".
    Then success page is open: successful opening of the hotel page.