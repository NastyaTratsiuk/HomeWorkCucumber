package stepdefs.pages;

import io.cucumber.java.en.Then;
import services.SuccessService;

import static org.junit.Assert.assertTrue;

public class SuccessStepdefs {

    private final SuccessService successService;

    public SuccessStepdefs(SuccessService successService) {
        this.successService = successService;
    }

    @Then("success page is open: successful registration page.")
    public void successPageIsOpenSuccessfulRegistrationPage() {
        assertTrue(successService.isPageShownJoinPage());
    }


    @Then("success page is open: registration error page.")
    public void successPageIsOpenRegistrationErrorPage() {
        assertTrue(successService.isPageShownJoinPageError());
    }


    @Then("success page is open: page agree.")
    public void successPageIsOpenPageAgree() {
        assertTrue(successService.isPageShownAgree());
    }

    @Then("success page is open: registration error .")
    public void successPageIsOpenRegistrationError() {
        assertTrue(successService.isPageShownError());
    }

    @Then("success page is open: successful authorization page.")
    public void successPageIsOpenSuccessfulAuthorizationPage() {
        assertTrue(successService.isPageShownLogInPage());
    }

    @Then("success page is open: gives an error page.")
    public void successPageIsOpenGivesAnErrorPage() {
        assertTrue(successService.isPageShownLogInError());
    }

    @Then("success page is open: successful opening of the help page.")
    public void successPageIsOpenSuccessfulOpeningOfTheHelpPage() {
        assertTrue(successService.isPageShownHelp());
    }

    @Then("success page is open: page with answers to the request.")
    public void successPageIsOpenPageWithAnswersToTheRequest() {
        assertTrue(successService.isPageShownSearch());
    }

    @Then("success page is open: successful opening of additional exchange \\(Plan).")
    public void successPageIsOpenSuccessfulOpeningOfAdditionalExchangePlan() {
        assertTrue(successService.isPageShownPlan());
    }

    @Then("success page is open: successful opening of additional exchange \\(Information).")
    public void successPageIsOpenSuccessfulOpeningOfAdditionalExchangeInformation() {
        assertTrue(successService.isPageShownTravelInform());
    }

    @Then("success page is open: successful language change.")
    public void successPageIsOpenSuccessfulLanguageChange() {
        assertTrue(successService.isPageShownHomeLanguage());
    }

    @Then("success page is open: successful opening a page with information about the company and its partners.")
    public void successPageIsOpenSuccessfulOpeningAPageWithInformationAboutTheCompany() {
        assertTrue(successService.isPageShownOneWorld());
    }

    @Then("success page is open: successful opening of the flights page.")
    public void successPageIsOpenSuccessfulOpeningOfTheFlightsPage() {
        assertTrue(successService.isPageShownFlights());
    }

    @Then("success page is open: an error appears when entering dates.")
    public void successPageIsOpenAnErrorAppearsWhenEnteringDates() {
        assertTrue(successService.isPageShownErrorDate());
    }

    @Then("success page is open: successful opening of the hotel page.")
    public void successPageIsOpenSuccessfulOpeningOfTheHotelPage() {
        assertTrue(successService.isPageShownVacation());
    }

    @Then("success page is open: gives an error message.")
    public void successPageIsOpenGivesAnErrorMessage() {
        assertTrue(successService.isPageShownErrorConfirmation());
    }

    @Then("success page is open: shown home page.")
    public void successPageIsOpenShownHomePage() {
        assertTrue(successService.isPageShownHomePage());
    }

    @Then("success page is open: flexibility sorting was successful.")
    public void successPageIsOpenFlexibilitySortingWasSuccessful() {
        assertTrue(successService.isPageShownFlexible());
    }

    @Then("success page is open: see the airport.")
    public void successPageIsOpenSeeTheAirport() {
        assertTrue(successService.isPageShownStopPage());
    }


    @Then("success page is open: shown page with free seats.")
    public void successPageIsOpenShownPageWithFreeSeats() {
        assertTrue(successService.isPageShownSeatsPage());
    }

    @Then("success page is open: go to the purchase page.")
    public void successPageIsOpenGoToThePurchasePage() {
        assertTrue(successService.isPageShownBuy());
    }

    @Then("success page is open: the authorization page opens.")
    public void successPageIsOpenTheAuthorizationPageOpens() {
        assertTrue(successService.isPageShownBuyLogInPage());
    }

}
