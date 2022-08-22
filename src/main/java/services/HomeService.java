package services;

import enums.*;
import org.assertj.core.api.SoftAssertions;
import pages.HomePage;

import static utils.Assertions.isVisible;


public class HomeService {

    private final HomePage homePage;

    public HomeService(HomePage homePage) {
        this.homePage = homePage;
    }

    public void isLoginVisible(SoftAssertions softAssertion) {
        isVisible(softAssertion, homePage.getNavBar().getLoginBtn(), "Login Page");
    }

    public void openLoginPage() {
        homePage.getNavBar().openLoginPage();
    }

    public void isJoinVisible(SoftAssertions softAssertion) {
        isVisible(softAssertion, homePage.getNavBar().getJoinBtn(), "Join Page");
    }

    public void openJoinPage() {
        homePage.getNavBar().openJoinPage();
    }

    public void isSearcVisibleHome(SoftAssertions softAssertion) {
        isVisible(softAssertion, homePage.getSearchInput(), "Seacrch");
        isVisible(softAssertion, homePage.getMagnifierBtn(), "Magnifier");
    }

    public void search(String search) {
        homePage.getSearchInput().clearAndType(search);
        homePage.getMagnifierBtn().click();
    }

    public void isPlanVisible(SoftAssertions softAssertion) {
        isVisible(softAssertion, homePage.getNavBar().getPlanTravelBtn(), "Plan");
    }

    public void plan() {
        homePage.getNavBar().openPlanetravel();
    }

    public void isTravelVisible(SoftAssertions softAssertion) {
        isVisible(softAssertion, homePage.getNavBar().getTravelInformBtn(), "Travel");
    }

    public void travel() {
        homePage.getNavBar().openTravelInform();
    }

    public void isLanguageVisible(SoftAssertions softAssertion) {
        isVisible(softAssertion, homePage.getCoutrySelector(), "Country");
        isVisible(softAssertion, homePage.getLanguageSelector(), "Language");
    }

    public void openLanguage() {
        homePage.getChangeLanguageBtn().click();
    }

    public void language(
            final Country country,
            final Language language
    ) {
        homePage.getCoutrySelector().select(country.getCountryName());
        homePage.getLanguageSelector().select(language.getLanguageName());
        homePage.getChangeLanguageBtn().click();
    }

    public void isSearchTravelVisible(SoftAssertions softAssertion) {
        isVisible(softAssertion, homePage.getRoundTrip(), "Round trip");
        isVisible(softAssertion, homePage.getOneWay(), "One way");
        isVisible(softAssertion, homePage.getAirportFrom(), "Airport from");
        isVisible(softAssertion, homePage.getAirportTo(), "Airport to");
        isVisible(softAssertion, homePage.getPassengersSelector(), "Passengers");
        isVisible(softAssertion, homePage.getDepart(), "Date depart");
        isVisible(softAssertion, homePage.getDateReturn(), "Date return");
        isVisible(softAssertion, homePage.getSearchVacation(), "Search button");
    }

    public void searchTravel(
            final ChooseTrip chooseTrip,
            final Airport airportFrom,
            final Airport airportTo,
            final Passengers passengers,
            final String dateDepart,
            final String dateReturn
    ) {
        switch (chooseTrip) {
            case ROUND_TRIP: {
                homePage.getRoundTrip().check();
                break;
            }
            case ONE_WAY: {
                homePage.getOneWay().check();
                break;
            }
        }
        homePage.getAirportFrom().select(airportFrom.getAirportName());
        homePage.getAirportTo().select(airportTo.getAirportName());
        homePage.getPassengersSelector().select(passengers.getPassengers());
        homePage.getDepart().clearAndType(dateDepart);
        if (chooseTrip.equals(ChooseTrip.ROUND_TRIP)) {
            homePage.getDateReturn().clearAndType(dateReturn);
        }
        homePage.getSearchTravel().click();
    }

    public void isSearchVacationVisible(SoftAssertions softAssertion) {
        isVisible(softAssertion, homePage.getAirportFrom(), "Airport from");
        isVisible(softAssertion, homePage.getAirportTo(), "Airport to");
        isVisible(softAssertion, homePage.getPassengersSelector(), "Passengers");
        isVisible(softAssertion, homePage.getDepart(), "Date depart");
        isVisible(softAssertion, homePage.getDateReturn(), "Date return");
        isVisible(softAssertion, homePage.getFarePreference(), "Fare preference");
        isVisible(softAssertion, homePage.getSearchVacation(), "Search vacation button");
    }

    public void vacationSearch(
            final Airport airportFrom,
            final Airport airportTo,
            final Passengers passengers,
            final String dateDepart,
            final String dateReturn,
            final FarePreference farePreference
    ) {
        homePage.getAirportFrom().select(airportFrom.getAirportName());
        homePage.getAirportTo().select(airportTo.getAirportName());
        homePage.getPassengersSelector().select(passengers.getPassengers());
        homePage.getDepart().clearAndType(dateDepart);
        homePage.getDateReturn().clearAndType(dateReturn);
        homePage.getFarePreference().select(farePreference.getFarePreferenceName());
        homePage.getSearchVacation().click();

    }

    public void isOpenVacationVisible(SoftAssertions softAssertion) {
        isVisible(softAssertion, homePage.getVacationBtn(), "Vacation button");
    }

    public void openVacation() {
        homePage.getVacationBtn().click();
    }

    public void isManageTripsVisible(SoftAssertions softAssertion) {
        isVisible(softAssertion, homePage.getFirstName(), "First name");
        isVisible(softAssertion, homePage.getLastName(), "Last name");
        isVisible(softAssertion, homePage.getFindYourTrip(), "Find your trip");
    }

    public void manageTrips(

            final String firstName,
            final String lastName
    ) {
        homePage.getFirstName().clearAndType(firstName);
        homePage.getLastName().clearAndType(lastName);
        homePage.getFindYourTrip().click();
    }

    public void isOpenManageTripVisible(SoftAssertions softAssertion) {
        isVisible(softAssertion, homePage.getManageTrips(), "Manage trips button");
    }

    public void openManageTrip() {
        homePage.getManageTrips().click();
    }

    public void isOpenOneWorldVisible(SoftAssertions softAssertion) {
        isVisible(softAssertion, homePage.getOneWay(), "One way button");
    }

    public void openOneWorld() {
        homePage.getOneWorldBtn().click();
    }

    public void continueSearch() {
        homePage.getSearchTravel().click();
    }

}
