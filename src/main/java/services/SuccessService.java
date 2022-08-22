package services;

import pages.SuccessPage;

public class SuccessService {

    private final SuccessPage successPage;

    public SuccessService(SuccessPage successPage) {
        this.successPage = successPage;
    }

    public boolean isPageShownError() {
        return successPage.getSuccessError().isDisplayed();
    }

    public boolean isPageShownAgree() {
        return successPage.getSuccessAgreement().isDisplayed();
    }

    public boolean isPageShownLogInError() {
        return successPage.getSuccessLogInError().isDisplayed();
    }

    public boolean isPageShownHelp() {
        return successPage.getSuccessHelp().isDisplayed();
    }

    public boolean isPageShownSearch() {
        return successPage.getSuccessSearch().isDisplayed();
    }

    public boolean isPageShownPlan() {
        return successPage.getSuccessPlan().isDisplayed();
    }

    public boolean isPageShownTravelInform() {
        return successPage.getSuccessTravelInform().isDisplayed();
    }

    public boolean isPageShownHomeLanguage() {
        return successPage.getSuccessHomeLanguage().isDisplayed();
    }

    public boolean isPageShownFlights() {
        return successPage.getFlightsPage().isDisplayed();
    }

    public boolean isPageShownErrorDate() {
        return successPage.getErrorDatePage().isDisplayed();
    }

    public boolean isPageShownVacation() {
        return successPage.getVacationPage().isDisplayed();
    }

    public boolean isPageShownErrorConfirmation() {
        return successPage.getErrorConfirmationPage().isDisplayed();
    }

    public boolean isPageShownOneWorld() {
        return successPage.getOneWorldPage().isDisplayed();
    }

    public boolean isPageShownFlexible() {
        return successPage.getFlexiblePage().isDisplayed();
    }

    public boolean isPageShownBuy() {
        return successPage.getBuyPage().isDisplayed();
    }

    public boolean isPageShownBuyLogInPage() {
        return successPage.getBuyLogInPage().isDisplayed();
    }

    public boolean isPageShownHomePage() {
        return successPage.getHomePage().isDisplayed();
    }

    public boolean isPageShownStopPage() {
        return successPage.getStopPage().isDisplayed();
    }

    public boolean isPageShownSeatsPage() {
        return successPage.getSeatsPage().isDisplayed();
    }

    public boolean isPageShownJoinPage() {
        return successPage.getSuccessJoin().isDisplayed();
    }

    public boolean isPageShownJoinPageError() {
        return successPage.getSuccessJoinPageError().isDisplayed();
    }

    public boolean isPageShownLogInPage() {
        return successPage.getSuccessLogIn().isDisplayed();
    }

}
