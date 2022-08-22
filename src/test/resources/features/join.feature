
Feature: testing registration form

  Background:
    Given join page is open.

  @smoke
  Scenario: successful user registration
    When elements login page are visible.
    Then join page is open: "FirstName" input, "Last name" input, "Mouth" selector,"Day" selector, "Year" selector, "Gender" selector, "Country" selector,"Adress" input, "City" selector, "State" selector,"Postal Code" input, "Primary email" input,"Confirm primary email" input, "Primare phone type" selector, "Primare phone" selector, "Password" input, "Confirm Password" input, "AAdvantage" checkbox and button "Continue".

  @regression
  Scenario: check registration with an existing user
    When join page is open: "First name" input, "Last name" input, "Mouth" selector,"Day" selector, "Year" selector, "Gender" selector, "Country" selector,"Adress" input, "City" selector, "State" selector,"Postal Code" input, "Primary email" input,"Confirm primary email" input, "Primare phone type" selector, "Primare phone" selector, "Password" input, "Confirm Password" input, "AAdvantage" checkbox and button "Continue".
    Then success page is open: registration error page.

  @regression
  Scenario: checking the obligatory filling of all required fields
    When join page is open: "First name" input, "Last name" input, "Mouth" selector,"Day" selector, "Year" selector, "Gender" selector, "Country" selector,"Adress" input, "City" selector, "State" selector,"Postal Code" input, "Primary email" input,"Confirm primary email" input, "Primare phone type" selector, "Primare phone" selector, "AAdvantage" checkbox and button "Continue".
    Then success page is open: registration error .

  @regression
  Scenario: opening a link to the user agreement
    When join page is open: button "I agree to the AAdvantage terms"
    Then success page is open: page agree.