package pages;

import elements.*;
import org.openqa.selenium.By;

public class JoinPage {

    private final Input firstNameInput = new Input(By.id("personalInformationForm.firstName"));
    private final Input lastNameInput = new Input(By.id("personalInformationForm.lastName"));
    private final Selector monthSelector = new Selector(By.id("personalInformationForm.dateOfBirth.month"));
    private final Selector daySelector = new Selector(By.id("personalInformationForm.dateOfBirth.day"));
    private final Selector yearSelector = new Selector(By.id("personalInformationForm.dateOfBirth.year"));
    private final Selector genderSelector = new Selector(By.id("personalInformationForm.gender"));
    private final Radio homeLbl = new Radio(By.xpath("//input[@id='addressTypeHome']/following-sibling::label"));
    private final Radio Business = new Radio(By.xpath("//input[@id='addressTypeBusiness']/following-sibling::label"));
    private final Selector coutrySelector = new Selector(By.id("addressInformationForm.country"));
    private final Input addressInput = new Input(By.id("addressInformationForm.address1"));
    private final Input cityInput = new Input(By.id("addressInformationForm.city"));
    private final Selector stateSelector = new Selector(By.id("addressInformationForm.usState"));
    private final Input emailInput = new Input(By.id("emailPhoneForm.email"));
    private final Input primaryEmailInput = new Input(By.id("emailPhoneForm.confirmEmail"));
    private final Selector phoneTypeSelector = new Selector(By.id("emailPhoneForm.phones0.type"));
    private final Selector codePhoneSelector = new Selector(By.id("emailPhoneForm.phones0.countryCode"));
    private final Input numberInput = new Input(By.id("emailPhoneForm.phones0.number"));
    private final Input passwordInput = new Input(By.id("yourAccountForm.password"));
    private final Input confirmPasswordInput = new Input(By.id("yourAccountForm.confirmPassword"));
    private final Checkbox agreeCheckbox = new Checkbox(By.xpath("//input[@id='acceptTermAndConditions']/following-sibling::label"));
    private final Button continueBtn = new Button(By.id("continueButton"));

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

    public Radio getHomeLbl() {
        return homeLbl;
    }

    public Radio getBusiness() {
        return Business;
    }

    public Selector getCoutrySelector() {
        return coutrySelector;
    }

    public Input getAddressInput() {
        return addressInput;
    }

    public Input getCityInput() {
        return cityInput;
    }

    public Selector getStateSelector() {
        return stateSelector;
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

    public Input getPasswordInput() {
        return passwordInput;
    }

    public Input getConfirmPasswordInput() {
        return confirmPasswordInput;
    }

    public Checkbox getAgreeCheckbox() {
        return agreeCheckbox;
    }

    public Button getContinueBtn() {
        return continueBtn;
    }
}
