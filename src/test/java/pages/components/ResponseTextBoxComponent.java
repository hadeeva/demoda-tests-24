package pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ResponseTextBoxComponent {
    public void checkResultsBox(String key, String value) {
        $("#output").$(byText(key)).parent().shouldHave(text(value));
    }
}
