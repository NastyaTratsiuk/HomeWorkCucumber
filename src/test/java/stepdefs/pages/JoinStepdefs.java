package stepdefs.pages;

import enums.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import services.JoinService;

public class JoinStepdefs {

    private final JoinService joinService;

    public JoinStepdefs(JoinService joinService) {
        this.joinService = joinService;
    }

    @Then("join page is open: \"FirstName\" input, \"Last name\" input, \"Mouth\" selector,\"Day\" selector, \"Year\" selector, " +
            "\"Gender\" selector, \"Country\" selector,\"Adress\" input, \"City\" selector, \"State\" selector,\"Postal Code\" input," +
            " \"Primary email\" input,\"Confirm primary email\" input, \"Primare phone type\" selector, \"Primare phone\" selector, " +
            "\"Password\" input, \"Confirm Password\" input, \"AAdvantage\" checkbox and button \"Continue\".")
    public void joinPageIsOpenInput( ) {
        joinService.performJoin(
                "Nastya",
                "Tratsiuk",
                Month.MAY,
                Day.TWENTY_EIGHT,
                Year.ONE_NINE_NINE_FOUR,
                Gender.F,
                Address.HOME,
                Country.BELARUS,
                "Космонавтов 43",
                "Minsk",
                State.NULL,
                "na200913@mail.ru",
                "na200913@mail.ru",
                PhoneType.HOME,
                CodePhone.BELARUS,
                "336643464",
                "Nastya123",
                "Nastya123",
                true
        );
    }


    @When("join page is open: button \"I agree to the AAdvantage terms\"")
    public void joinPageIsOpenButton() {
        joinService.agreement();
    }

    @When("elements login page are visible.")
    public void elementsLoginPageAreVisible() {
        SoftAssertions softAssertions = new SoftAssertions();
        joinService.isAllRequiredFieldsAreVisibleJoin(softAssertions);
        softAssertions.assertAll();
    }

    @When("join page is open: \"First name\" input, \"Last name\" input, \"Mouth\" selector,\"Day\" selector, \"Year\" selector, " +
            "\"Gender\" selector, \"Country\" selector,\"Adress\" input, \"City\" selector, \"State\" selector,\"Postal Code\" input, " +
            "\"Primary email\" input,\"Confirm primary email\" input, \"Primare phone type\" selector, \"Primare phone\" selector," +
            " \"Password\" input, \"Confirm Password\" input, \"AAdvantage\" checkbox and button \"Continue\".")
    public void joinPageIsOpenInputInputSelector() {

        joinService.performJoin(
                "Nastya",
                "Tratsiuk",
                Month.MAY,
                Day.TWENTY_EIGHT,
                Year.ONE_NINE_NINE_FOUR,
                Gender.F,
                Address.HOME,
                Country.BELARUS,
                "Космонавтов 43",
                "Minsk",
                State.NULL,
                "na200913@mail.ru",
                "na200913@mail.ru",
                PhoneType.HOME,
                CodePhone.BELARUS,
                "336643464",
                "Nastya123",
                "Nastya123",
                true

        );
    }

    @When("join page is open: \"First name\" input, \"Last name\" input, \"Mouth\" selector," +
            "\"Day\" selector, \"Year\" selector, \"Gender\" selector, \"Country\" selector," +
            "\"Adress\" input, \"City\" selector, \"State\" selector,\"Postal Code\" input, " +
            "\"Primary email\" input,\"Confirm primary email\" input, \"Primare phone type\" selector, " +
            "\"Primare phone\" selector, \"AAdvantage\" checkbox and button \"Continue\".")
    public void joinPageIsOpenInputInputSelectorSelectorSelectorSelector( ) {
        joinService.performJoin(
                "Nastya",
                "Tratsiuk",
                Month.MAY,
                Day.TWENTY_EIGHT,
                Year.ONE_NINE_NINE_FOUR,
                Gender.F,
                Address.HOME,
                Country.BELARUS,
                "Космонавтов 43",
                "Minsk",
                State.NULL,
                "na200913@mail.ru",
                "na200913@mail.ru",
                PhoneType.HOME,
                CodePhone.BELARUS,
                "336643464",
                "",
                "",
                true

        );
    }

}
