package pages;

import elements.Button;
import elements.Input;
import elements.Selector;
import org.openqa.selenium.By;

public class FlightsPage {

    private final Button flexibleBtn = new Button(By.id("fareCategory_refundable"));
    private final Selector sortSelector = new Selector(By.id("searchResultsSortOptions"));
    private final Button buyBtn = new Button(By.id("slice0Flight30MainCabin"));
    private final Button closeDialogBtn = new Button(By.id("mainCabinUpsellDialogClose"));
    private final Button continurAsGuestBtn = new Button(By.id("button_continue_guest"));
    private final Input firstNameInput = new Input(By.id("passengers0.personalInformationForm.firstName"));
    private final Input lastNameInput = new Input(By.id("passengers0.personalInformationForm.lastName"));
    private final Selector monthSelector = new Selector(By.id("passengers0.dateComponentForm.month"));
    private final Selector daySelector = new Selector(By.id("passengers0.dateComponentForm.day"));
    private final Selector yearSelector = new Selector(By.id("passengers0.dateComponentForm.year"));
    private final Selector genderSelector = new Selector(By.id("passengers0.personalInformationForm.gender"));
    private final Selector coutrySelector = new Selector(By.id("passengers0.residencyInfo.country"));
    private final Input emailInput = new Input(By.id("tripContact.email"));
    private final Input primaryEmailInput = new Input(By.id("confirmEmail"));
    private final Selector phoneTypeSelector = new Selector(By.id("tripContact.phones0.type"));
    private final Selector codePhoneSelector = new Selector(By.id("tripContact.phones0.countryCode"));
    private final Input numberInput = new Input(By.id("tripContact.phones0.number"));
    private final Button continueBtn = new Button(By.id("passenger_button"));
    private final Button logInContinueBtn = new Button(By.id("button_login_andcontinue"));
    private final Button homeBtn = new Button(By.id("utilityHome"));
    private final Button stopBtn = new Button(By.id("flight29StopCountLink_phone"));
    private final Button seatsBtn = new Button(By.id("flight29SeatsLink"));


    public Button getFlexibleBtn() {
        return flexibleBtn;
    }

    public Selector getSortSelector() {
        return sortSelector;
    }

    public Button getBuyBtn() {
        return buyBtn;
    }

    public Button getCloseDialogBtn() {
        return closeDialogBtn;
    }

    public Button getContinurAsGuestBtn() {
        return continurAsGuestBtn;
    }

    public Input getFirstNameInput() {
        return firstNameInput;
    }

    public Input getLastNameInput() {
        return lastNameInput;
    }

    public Selector getMonthSelector() {
        return monthSelector;
    }

    public Selector getDaySelector() {
        return daySelector;
    }

    public Selector getYearSelector() {
        return yearSelector;
    }

    public Selector getGenderSelector() {
        return genderSelector;
    }

    public Selector getCoutrySelector() {
        return coutrySelector;
    }

    public Input getEmailInput() {
        return emailInput;
    }

    public Input getPrimaryEmailInput() {
        return primaryEmailInput;
    }

    public Selector getPhoneTypeSelector() {
        return phoneTypeSelector;
    }

    public Selector getCodePhoneSelector() {
        return codePhoneSelector;
    }

    public Input getNumberInput() {
        return numberInput;
    }

    public Button getContinueBtn() {
        return continueBtn;
    }

    public Button getLogInContinueBtn() {
        return logInContinueBtn;
    }

    public Button getHomeBtn() {
        return homeBtn;
    }

    public Button getStopBtn() {
        return stopBtn;
    }

    public Button getSeatsBtn() {
        return seatsBtn;
    }

}
