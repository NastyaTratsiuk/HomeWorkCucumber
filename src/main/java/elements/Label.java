package elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class Label extends BaseElement {

    public Label(By by) {
        super(by);
    }

    public boolean isDisplayed() {
        this.logAction("Label");
        return this.getWrappedElement()
                .waitUntil(Condition.visible, 25000)
                .isDisplayed();
    }


}
