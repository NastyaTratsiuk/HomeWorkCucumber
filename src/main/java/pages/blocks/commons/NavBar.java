package pages.blocks.commons;

import com.codeborne.selenide.SelenideElement;
import elements.Button;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NavBar {

    private final SelenideElement root = $(By.id("main-navigation"));
    private final Button loginBtn = new Button(root.$(By.id("log-in-button")));
    private final Button joinBtn = new Button(root.$(By.id("join-button")));
    private final Button planTravelBtn = new Button(root.$(By.id("plan-travel-expander")));
    private final Button travelInformBtn = new Button(root.$(By.id("travel-information-expander")));

    public SelenideElement getRoot() {
        return root;
    }

    public Button getLoginBtn() {
        return loginBtn;
    }

    public Button getJoinBtn() {
        return joinBtn;
    }

    public Button getPlanTravelBtn() {
        return planTravelBtn;
    }

    public Button getTravelInformBtn() {
        return travelInformBtn;
    }

    public void openLoginPage() {
        loginBtn.click();
    }

    public void openJoinPage() {
        joinBtn.click();
    }

    public void openPlanetravel() {
        planTravelBtn.click();
    }

    public void openTravelInform() {
        travelInformBtn.click();
    }
}
