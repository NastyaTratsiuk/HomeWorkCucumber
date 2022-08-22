package stepdefs.pages;

import enums.*;
import io.cucumber.java.en.When;
import services.FlightsService;

public class FlightStepdefs {

    private final FlightsService flightsService;

    public FlightStepdefs(FlightsService flightsService) {
        this.flightsService = flightsService;
    }

    @When("flight page is open: button \"Home\".")
    public void flightPageIsOpenButton() {
        flightsService.returnHome();
    }

    @When("flight page is open \\(Flexibility): button \"Flexibility\".")
    public void flightPageIsOpenFlexibilityButton() {
        flightsService.openFlexible();
    }

    @When("flight page is open \\(Stop): button \"Stop\".")
    public void flightPageIsOpenStopButton() {
        flightsService.stop();
    }

    @When("flight page is open \\(Seats): button \"Seats\".")
    public void flightPageIsOpenSeatsButton() {
        flightsService.seats();
    }

    @When("flight page is open: button \"Flith\", button \"Close dialog\", button \"Continue as guest\", " +
            "\"First name\" input, \"Last name\" input, \"Mouth\" selector,\"Day\" selector, " +
            "\"Year\" selector, \"Gender\" selector, \"Country\" selector, \"Primary email\" input," +
            "\"Confirm primary email\" input, \"Primare phone type\" selector and button \"Continue\".")
    public void flightPageIsOpenButtonButton () {

        flightsService.buyATicketAsGuest(
                "Nastya",
                "Tratsiuk",
                Month.MAY,
                Day.TWENTY_EIGHT,
                Year.ONE_NINE_NINE_FOUR,
                Gender.F,
                Country.BELARUS,
                "na200913@mail.ru",
                "na200913@mail.ru",
                PhoneType.HOME,
                CodePhone.BELARUS,
                "336643464"
        );
    }

    @When("flight page is open: button \"Flith\", button \"Close dialog\", button \"Log in and continue\".")
    public void flightPageIsOpenButtonButtonButton() {
        flightsService.buyTicketLogIn();
    }
}
