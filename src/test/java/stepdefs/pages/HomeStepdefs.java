package stepdefs.pages;

import enums.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import services.HomeService;

public class HomeStepdefs {

    private final HomeService homeService;

    public HomeStepdefs(HomeService homeService) {
        this.homeService = homeService;
    }

    @Given("join page is open.")
    public void joinPageIsOpen() {
        homeService.openJoinPage();
    }


    @Given("login page is open.")
    public void loginPageIsOpen() {
        homeService.openLoginPage();
    }

    @When("home page is open: \"Request\" input and button \"Magnifier\".")
    public void homePageIsOpenInputAndButton() {
        homeService.search("return ticket");
    }

    @When("home page is open: button \"Plan Travel\".")
    public void homePageIsOpenButtonPlan() {
        homeService.plan();
    }

    @When("home page is open \\(Travel):button \"Travel Information\".")
    public void homePageIsOpenTravelButton() {
        homeService.travel();
    }

    @Given("home page is open \\(English): button \"English\".")
    public void homePageIsOpenEnglishButton() {
        homeService.openLanguage();
    }

    @When("home page is open:\"Country\" selector, \"Language\" selector, button \"Select\".")
    public void homePageIsOpenSelectorSelectorButton() {
        homeService.language(Country.UNITED_STATES, Language.ENGLISH);
    }

    @When("home page is open:button \"One World\".")
    public void homePageIsOpenButton() {
        homeService.openOneWorld();
    }

    @When("home page is open: \"Choose trip\" radio buttons, \"Airport from\" selector, \"Airport to\" selector, " +
            "\"Passengers\" selector, \"Date depart\" input, \"Date return\" input and button \"Search\".")
    public void homePageIsOpenRadioButtonsSelectorSelectorSelectorInputInputAndButton() {

        homeService.searchTravel(
                ChooseTrip.ONE_WAY,
                Airport.LAS_VEGAS,
                Airport.ATLANTA,
                Passengers.ONE,
                "08/30/2021",
                "10/29/2021"
        );
    }

    @When("home page is open \\(error date): \"Choose trip\" radio buttons, \"Airport from\" selector, \"Airport to\" selector, " +
            "\"Passengers\" selector, \"Date depart\" input, \"Date return\" input and button \"Search\".")
    public void homePageIsOpenErrorDateRadioButtonsSelectorSelectorSelectorInputInputAndButton() {

        homeService.searchTravel(
                ChooseTrip.ONE_WAY,
                Airport.LAS_VEGAS,
                Airport.ATLANTA,
                Passengers.ONE,
                "07292021",
                "10/29/2021"
        );
    }

    @Given("vacation package is open: button \"Vacation package\".")
    public void vacationPackageIsOpenButton() {

        homeService.openVacation();
    }

    @When("home page is open: \"Airport from\" selector, \"Airport to\" selector, \"Passengers\" selector, " +
            "\"Date depart\" input,\"Date return\" input, \"Fare preference\" selector and button \"Search\".")
    public void homePageIsOpenSelectorSelectorSelectorInputInputSelectorAndButton() {

        homeService.vacationSearch(
                Airport.LAS_VEGAS,
                Airport.ATLANTA,
                Passengers.ONE,
                "08/22/2021",
                "08/28/2021",
                FarePreference.COACH
        );
    }

    @Given("Manager trips is open: button \"Manager Trips\".")
    public void managerTripsIsOpenButton() {
        homeService.openManageTrip();
    }

    @When("manager trips page is open: \"First name\" input, \"Last name\" input and button \"Find your trip\".")
    public void managerTripsPageIsOpenInputInputAndButton() {
        homeService.manageTrips(
                "Nastya",
                "Tratsiuk"
        );
    }

    @Given("do a flight search.")
    public void doAFlightSearch() {
        homeService.searchTravel(
                ChooseTrip.ONE_WAY,
                Airport.LAS_VEGAS,
                Airport.ATLANTA,
                Passengers.ONE,
                "08/30/2021",
                "10/29/2021");
    }

    @Given("do a flight search continue.")
    public void doAFlightSearchContinue() {
        homeService.continueSearch();
    }

}
