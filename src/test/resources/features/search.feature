
Feature: testing search AA.com

  @regression
  Scenario: testing search AA.com.
    When home page is open: "Request" input and button "Magnifier".
    Then success page is open: page with answers to the request.