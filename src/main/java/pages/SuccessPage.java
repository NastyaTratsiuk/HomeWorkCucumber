package pages;

import elements.Label;
import org.openqa.selenium.By;

public class SuccessPage {

    private final Label successError = new Label(By.id("errors-fieldErrorSummary"));
    private final Label successAgreement = new Label(By.id("aa-content-frame"));
    private final Label successLogInError = new Label(By.id("loginMainErrorMsgDialog"));
    private final Label successLogIn = new Label(By.id("first-name"));
    private final Label successJoin = new Label(By.id("enrollmentStatusDialog"));
    private final Label successJoinPageError = new Label(By.id("errors-globalErrorMessages"));
    private final Label successHelp = new Label(By.id("main"));
    private final Label successSearch = new Label(By.id("siteSearch"));
    private final Label successPlan = new Label(By.id("plan"));
    private final Label successTravelInform = new Label(By.id("manage"));
    private final Label successHomeLanguage = new Label(By.id("main-navigation"));
    private final Label successMap = new Label(By.id("map"));
    private final Label flightsPage = new Label(By.id("chooseFlightsHeader"));
    private final Label errorDatePage = new Label(By.id("segments0.travelDate.errors"));
    private final Label vacationPage = new Label(By.id("search-results-form-container"));
    private final Label errorConfirmationPage = new Label(By.id("recordLocator.errors"));
    private final Label oneWorldPage = new Label(By.id("aa-content-frame"));
    private final Label flexiblePage = new Label(By.id("FullyFlexibleToolTipVisible"));
    private final Label buyPage = new Label(By.id("selectSeatsPage"));
    private final Label buyLogInPage = new Label(By.id("loginFormId"));
    private final Label homePage = new Label(By.id("aa-hero-ad-frame"));
    private final Label stopPage = new Label(By.id("tooltipWrapper"));
    private final Label seatsPage = new Label(By.id("jsSeatMapView"));

    public Label getSuccessError() {
        return successError;
    }

    public Label getSuccessAgreement() {
        return successAgreement;
    }

    public Label getSuccessLogInError() {
        return successLogInError;
    }

    public Label getSuccessHelp() {
        return successHelp;
    }

    public Label getSuccessSearch() {
        return successSearch;
    }

    public Label getSuccessPlan() {
        return successPlan;
    }

    public Label getSuccessTravelInform() {
        return successTravelInform;
    }

    public Label getSuccessHomeLanguage() {
        return successHomeLanguage;
    }

    public Label getSuccessMap() {
        return successMap;
    }

    public Label getFlightsPage() {
        return flightsPage;
    }

    public Label getErrorDatePage() {
        return errorDatePage;
    }

    public Label getVacationPage() {
        return vacationPage;
    }

    public Label getErrorConfirmationPage() {
        return errorConfirmationPage;
    }

    public Label getOneWorldPage() {
        return oneWorldPage;
    }

    public Label getFlexiblePage() {
        return flexiblePage;
    }

    public Label getBuyPage() {
        return buyPage;
    }

    public Label getBuyLogInPage() {
        return buyLogInPage;
    }

    public Label getHomePage() {
        return homePage;
    }

    public Label getStopPage() {
        return stopPage;
    }

    public Label getSeatsPage() {
        return seatsPage;
    }

    public Label getSuccessJoin() {
        return successJoin;
    }

    public Label getSuccessJoinPageError() {
        return successJoinPageError;
    }

    public Label getSuccessLogIn() {
        return successLogIn;
    }
}
