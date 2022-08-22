package stepdefs.pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import services.LoginService;

public class LoginStepdefs {

    private final LoginService loginService;

    public LoginStepdefs(LoginService loginService) {
        this.loginService = loginService;
    }

    @Then("login page is open: \"User name\" input, \"Last name\" input, \"Password\" input and button \"LOG IN\".")
    public void loginPageIsOpenInputInputInputAndButton() {
        loginService.logIn(
                "H466UJ0",
                "Tratsiuk",
                "Nastya6643464",
                false
        );
    }

    @When("login page is open \\(negatine): \"User name\" input, \"Last name\" input, \"Password\" input and button \"LOG IN\".")
    public void loginPageIsOpenNegatineInputInputInputAndButton() {
        loginService.logIn(
                "H466UJ0",
                "Tratsiuk",
                "Null",
                false
        );
    }

    @When("login page is open: button \"Need help logging in?\".")
    public void loginPageIsOpenButton() {
        loginService.help();
    }

    @When("elements on login page are visible.")
    public void elementsOnLoginPageAreVisible() {
        SoftAssertions softAssertions = new SoftAssertions();
        loginService.isAllRequiredFieldsAreVisibleLogin(softAssertions);
        softAssertions.assertAll();
    }
}
