package services;

import enums.*;
import org.assertj.core.api.SoftAssertions;
import pages.JoinPage;
import utils.Logger;

import static utils.Assertions.isVisible;

public class JoinService {

    private final JoinPage joinPage;

    public JoinService(JoinPage joinPage) {
        this.joinPage = joinPage;
    }

    public void isAllRequiredFieldsAreVisibleJoin(SoftAssertions softAssertion) {
        isVisible(softAssertion, joinPage.getFirstNameInput(), "First Name");
        isVisible(softAssertion, joinPage.getLastNameInput(), "Last Name");
        isVisible(softAssertion, joinPage.getMonthSelector(), "Mouth");
        isVisible(softAssertion, joinPage.getDaySelector(), "Day");
        isVisible(softAssertion, joinPage.getYearSelector(), "Year");
        isVisible(softAssertion, joinPage.getGenderSelector(), "Gender");
        isVisible(softAssertion, joinPage.getHomeLbl(), "Home");
        isVisible(softAssertion, joinPage.getBusiness(), "Business");
        isVisible(softAssertion, joinPage.getCoutrySelector(), "Country");
        isVisible(softAssertion, joinPage.getAddressInput(), "Addres");
        isVisible(softAssertion, joinPage.getCityInput(), "City");
        isVisible(softAssertion, joinPage.getStateSelector(), "State");
        isVisible(softAssertion, joinPage.getEmailInput(), "Email");
        isVisible(softAssertion, joinPage.getPrimaryEmailInput(), "Primary email");
        isVisible(softAssertion, joinPage.getPhoneTypeSelector(), "Phone type");
        isVisible(softAssertion, joinPage.getCodePhoneSelector(), "Code Phone");
        isVisible(softAssertion, joinPage.getNumberInput(), "Phone number");
        isVisible(softAssertion, joinPage.getPasswordInput(), "Password");
        isVisible(softAssertion, joinPage.getConfirmPasswordInput(), "Confirm password");
        isVisible(softAssertion, joinPage.getAgreeCheckbox(), "Agree");
        isVisible(softAssertion, joinPage.getContinueBtn(), "Continue");
    }

    public void performJoin(
            final String firstName,
            final String lastName,
            final Month month,
            final Day day,
            final Year year,
            final Gender gender,
            final Address addressType,
            final Country country,
            final String address,
            final String city,
            final State state,
            final String email,
            final String primaryEmail,
            final PhoneType phoneType,
            final CodePhone codePhone,
            final String number,
            final String password,
            final String confirmPassword,
            final boolean agree

    ) {
        Logger.info("Fill all required fields on the join page");
        joinPage.getFirstNameInput().clearAndType(firstName);
        joinPage.getLastNameInput().clearAndType(lastName);
        joinPage.getMonthSelector().select(month.getMonthName());
        joinPage.getDaySelector().select(day.getDayNumberName());
        joinPage.getYearSelector().select(year.getYearNumber());
        joinPage.getGenderSelector().select(gender.getGenderName());
        switch (addressType) {
            case HOME: {
                joinPage.getHomeLbl().check();
                break;
            }
            case BUSINESS: {
                joinPage.getBusiness().check();
                break;
            }
        }
        joinPage.getCoutrySelector().select(country.getCountryName());
        joinPage.getAddressInput().clearAndType(address);
        joinPage.getCityInput().clearAndType(city);
        if (country.equals(Country.UNITED_STATES)) {
            joinPage.getStateSelector().select(state.getStateName());
        }
        joinPage.getEmailInput().clearAndType(email);
        joinPage.getPrimaryEmailInput().clearAndType(primaryEmail);
        joinPage.getPhoneTypeSelector().select(phoneType.getPhoneTypeName());
        joinPage.getCodePhoneSelector().select(codePhone.getCodePhoneName());
        joinPage.getNumberInput().clearAndType(number);
        joinPage.getPasswordInput().clearAndType(password);
        joinPage.getConfirmPasswordInput().clearAndType(confirmPassword);
        if (agree) {
            joinPage.getAgreeCheckbox().check();
        }
        joinPage.getContinueBtn().click();
    }

    public void isagreeVisibleJoin(SoftAssertions softAssertion) {
        isVisible(softAssertion, joinPage.getAgreeCheckbox(), "Agree");
    }

    public void agreement() {
        joinPage.getAgreeCheckbox().check();
    }

}
