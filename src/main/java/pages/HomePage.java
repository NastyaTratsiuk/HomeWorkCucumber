package pages;

import elements.Button;
import elements.Input;
import elements.Radio;
import elements.Selector;
import org.openqa.selenium.By;
import pages.blocks.commons.NavBar;

public class HomePage {

    private final NavBar navBar = new NavBar();
    private final Input searchInput = new Input(By.id("aa-search-field"));
    private final Button magnifierBtn = new Button(By.id("aa-search-button"));
    private final Button changeLanguageBtn = new Button(By.id("language-selector"));
    private final Selector coutrySelector = new Selector(By.id("aa-country-selector"));
    private final Selector languageSelector = new Selector(By.id("aa-language-selector"));
    private final Radio roundTrip = new Radio(By.xpath("//input[@id='flightSearchForm.tripType.roundTrip']/following-sibling::label"));
    private final Radio oneWay = new Radio(By.xpath("//input[@id='flightSearchForm.tripType.oneWay']/following-sibling::label"));
    private final Selector airportFrom = new Selector(By.id("reservationFlightSearchForm.originAirport"));
    private final Selector airportTo = new Selector(By.id("reservationFlightSearchForm.destinationAirport"));
    private final Selector passengersSelector = new Selector(By.id("flightSearchForm.adultOrSeniorPassengerCount"));
    private final Input depart = new Input(By.id("aa-leavingOn"));
    private final Input dateReturn = new Input(By.id("aa-returningFrom"));
    private final Button searchTravel = new Button(By.id("flightSearchForm.button.reSubmit"));
    private final Button vacationBtn = new Button(By.xpath("//input[@id='round-trip-hotel']/following-sibling::label"));
    private final Selector farePreference = new Selector(By.id("fhServiceClass"));
    private final Button searchVacation = new Button(By.id("flightSearchForm.button.vacationSubmit"));
    private final Button manageTrips = new Button(By.id("jq-myTripsCheckIn"));
    private final Button findYourTrip = new Button(By.id("findReservationForm.submit"));
    private final Input firstName = new Input(By.id("findReservationForm.firstName"));
    private final Input lastName = new Input(By.id("findReservationForm.lastName"));
    private final Button oneWorldBtn = new Button(By.id("header-one-world-logo"));

    public NavBar getNavBar() {
        return navBar;
    }

    public Input getSearchInput() {
        return searchInput;
    }

    public Button getMagnifierBtn() {
        return magnifierBtn;
    }

    public Button getChangeLanguageBtn() {
        return changeLanguageBtn;
    }

    public Selector getCoutrySelector() {
        return coutrySelector;
    }

    public Selector getLanguageSelector() {
        return languageSelector;
    }

    public Radio getRoundTrip() {
        return roundTrip;
    }

    public Radio getOneWay() {
        return oneWay;
    }

    public Selector getPassengersSelector() {
        return passengersSelector;
    }

    public Input getDepart() {
        return depart;
    }

    public Input getDateReturn() {
        return dateReturn;
    }

    public Button getSearchTravel() {
        return searchTravel;
    }

    public Selector getAirportFrom() {
        return airportFrom;
    }

    public Selector getAirportTo() {
        return airportTo;
    }

    public Button getVacationBtn() {
        return vacationBtn;
    }

    public Selector getFarePreference() {
        return farePreference;
    }

    public Button getSearchVacation() {
        return searchVacation;
    }

    public Button getManageTrips() {
        return manageTrips;
    }

    public Button getFindYourTrip() {
        return findYourTrip;
    }

    public Input getFirstName() {
        return firstName;
    }

    public Input getLastName() {
        return lastName;
    }

    public Button getOneWorldBtn() {
        return oneWorldBtn;
    }

}
