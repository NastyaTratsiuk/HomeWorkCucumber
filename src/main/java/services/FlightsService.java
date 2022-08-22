package services;

import enums.*;
import org.assertj.core.api.SoftAssertions;
import pages.FlightsPage;

import static utils.Assertions.isVisible;

public class FlightsService {

    private final FlightsPage flightsPage;

    public FlightsService(FlightsPage flightsPage) {
        this.flightsPage = flightsPage;
    }

    public void isOpenFlexibleVisible(SoftAssertions softAssertion) {
        isVisible(softAssertion, flightsPage.getFlexibleBtn(), "Flexible");
    }

    public void openFlexible() {
        flightsPage.getFlexibleBtn().click();
    }

    public void isSortPriceVisible(SoftAssertions softAssertion) {
        isVisible(softAssertion, flightsPage.getSortSelector(), "Sort selector");
    }

    public void isBuyTicketAsGuestVisible(SoftAssertions softAssertion) {
        isVisible(softAssertion, flightsPage.getBuyBtn(), "Buy button");
        isVisible(softAssertion, flightsPage.getCloseDialogBtn(), "Close dialog");
        isVisible(softAssertion, flightsPage.getContinurAsGuestBtn(), "Continue as guest");
        isVisible(softAssertion, flightsPage.getFirstNameInput(), "FirstName");
        isVisible(softAssertion, flightsPage.getLastNameInput(), "Last Name");
        isVisible(softAssertion, flightsPage.getMonthSelector(), "Mouth");
        isVisible(softAssertion, flightsPage.getDaySelector(), "Day");
        isVisible(softAssertion, flightsPage.getYearSelector(), "Year");
        isVisible(softAssertion, flightsPage.getGenderSelector(), "Gender");
        isVisible(softAssertion, flightsPage.getCoutrySelector(), "Country");
        isVisible(softAssertion, flightsPage.getEmailInput(), "Email");
        isVisible(softAssertion, flightsPage.getPrimaryEmailInput(), "Primary email");
        isVisible(softAssertion, flightsPage.getPhoneTypeSelector(), "Phone type");
        isVisible(softAssertion, flightsPage.getCodePhoneSelector(), "Code Phone");
        isVisible(softAssertion, flightsPage.getNumberInput(), "Phone number");
        isVisible(softAssertion, flightsPage.getContinueBtn(), "Continue");
    }

    public void buyATicketAsGuest(
            final String firstName,
            final String lastName,
            final Month month,
            final Day day,
            final Year year,
            final Gender gender,
            final Country country,
            final String email,
            final String primaryEmail,
            final PhoneType phoneType,
            final CodePhone codePhone,
            final String number
    ) {
        flightsPage.getBuyBtn().click();
        flightsPage.getCloseDialogBtn().click();
        flightsPage.getContinurAsGuestBtn().click();
        flightsPage.getFirstNameInput().clearAndType(firstName);
        flightsPage.getLastNameInput().clearAndType(lastName);
        flightsPage.getMonthSelector().select(month.getMonthName());
        flightsPage.getDaySelector().select(day.getDayNumberName());
        flightsPage.getYearSelector().select(year.getYearNumber());
        flightsPage.getGenderSelector().select(gender.getGenderName());
        flightsPage.getCoutrySelector().select(country.getCountryName());
        flightsPage.getEmailInput().clearAndType(email);
        flightsPage.getPrimaryEmailInput().clearAndType(primaryEmail);
        flightsPage.getPhoneTypeSelector().select(phoneType.getPhoneTypeName());
        flightsPage.getCodePhoneSelector().select(codePhone.getCodePhoneName());
        flightsPage.getNumberInput().clearAndType(number);
        flightsPage.getContinueBtn().click();
    }

    public void isBuyTicketLoginVisible(SoftAssertions softAssertion) {
        isVisible(softAssertion, flightsPage.getBuyBtn(), "Buy button");
        isVisible(softAssertion, flightsPage.getCloseDialogBtn(), "Close dialog");
        isVisible(softAssertion, flightsPage.getLogInContinueBtn(), "Log in continue");
    }

    public void buyTicketLogIn() {
        flightsPage.getBuyBtn().click();
        flightsPage.getCloseDialogBtn().click();
        flightsPage.getLogInContinueBtn().click();
    }

    public void isReturnHomeVisible(SoftAssertions softAssertion) {
        isVisible(softAssertion, flightsPage.getHomeBtn(), "Home");
    }

    public void returnHome() {
        flightsPage.getHomeBtn().click();
    }

    public void isStopVisible(SoftAssertions softAssertion) {
        isVisible(softAssertion, flightsPage.getStopBtn(), "Stop");
    }

    public void stop() {
        flightsPage.getStopBtn().click();
    }

    public void isSeatsVisible(SoftAssertions softAssertion) {
        isVisible(softAssertion, flightsPage.getSeatsBtn(), "Seats");
    }

    public void seats() {
        flightsPage.getSeatsBtn().click();
    }
}
