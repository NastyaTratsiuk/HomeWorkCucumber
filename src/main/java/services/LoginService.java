package services;

import org.assertj.core.api.SoftAssertions;
import pages.LoginPage;

import static utils.Assertions.isVisible;

public class LoginService {

    private final LoginPage loginPage;

    public LoginService(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    public void isAllRequiredFieldsAreVisibleLogin(SoftAssertions softAssertion) {
        isVisible(softAssertion, loginPage.getUserName(), "User Name");
        isVisible(softAssertion, loginPage.getLastName(), "Last Name");
        isVisible(softAssertion, loginPage.getPassword(), "Password");
        isVisible(softAssertion, loginPage.getRememderMe(), "Remember");
        isVisible(softAssertion, loginPage.getLogin(), "LoginBtn");
    }

    public void logIn(

            final String userName,
            final String lastName,
            final String password,
            final boolean remember
    ) {
        loginPage.getUserName().clearAndType(userName);
        loginPage.getLastName().clearAndType(lastName);
        loginPage.getPassword().clearAndType(password);
        if (remember) {
            loginPage.getRememderMe().check();
        }
        loginPage.getLogin().click();
    }

    public void help() {
        loginPage.getHelp().click();
    }

    public void isHelpVisibleLogin(SoftAssertions softAssertion) {
        isVisible(softAssertion, loginPage.getHelp(), "Help");
    }
}
