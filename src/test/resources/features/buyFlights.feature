@forProtection
Feature: testing buy flight ticket

  @smoke
  Scenario: buy ticket as guest.
    Given do a flight search.
    When flight page is open: button "Flith", button "Close dialog", button "Continue as guest", "First name" input, "Last name" input, "Mouth" selector,"Day" selector, "Year" selector, "Gender" selector, "Country" selector, "Primary email" input,"Confirm primary email" input, "Primare phone type" selector and button "Continue".
    Then success page is open: go to the purchase page.

  @smoke
  Scenario: buy ticket authorized user.
    Given do a flight search continue.
    When flight page is open: button "Flith", button "Close dialog", button "Log in and continue".
    Then success page is open: the authorization page opens.