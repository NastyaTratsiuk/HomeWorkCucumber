package pages;

import elements.Button;
import elements.Checkbox;
import elements.Input;
import org.openqa.selenium.By;

public class LoginPage {

    private final Input UserName = new Input(By.id("loginId"));
    private final Input lastName = new Input(By.id("lastName"));
    private final Input password = new Input(By.id("password"));
    private final Checkbox rememderMe = new Checkbox(By.xpath("//input[@id='rememberMe']/following-sibling::label"));
    private final Button login = new Button(By.id("button_login"));
    private final Button help = new Button(By.id("NeedHelpLogin"));

    public Input getUserName() {
        return UserName;
    }

    public Input getLastName() {
        return lastName;
    }

    public Input getPassword() {
        return password;
    }

    public Checkbox getRememderMe() {
        return rememderMe;
    }

    public Button getLogin() {
        return login;
    }

    public Button getHelp() {
        return help;
    }
}


