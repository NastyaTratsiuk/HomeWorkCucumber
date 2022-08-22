
Feature: checking the functionality of the available buttons
  @regression
  Scenario: button testing Plan Travel.
    When home page is open: button "Plan Travel".
    Then success page is open: successful opening of additional exchange (Plan).

  @regression
  Scenario: button testing Travel Information.
    When home page is open (Travel):button "Travel Information".
    Then success page is open: successful opening of additional exchange (Information).

  @regression
  Scenario: change language.
    Given home page is open (English): button "English".
    When home page is open:"Country" selector, "Language" selector, button "Select".
    Then success page is open: successful language change.

  @regression
  Scenario: opening a page with information about the company and its partners.
    When home page is open:button "One World".
    Then success page is open: successful opening a page with information about the company and its partners.