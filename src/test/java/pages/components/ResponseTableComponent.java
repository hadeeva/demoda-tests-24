package pages.components;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ResponseTableComponent {

    public void checkResultsTable(String key, String value) {
        $(".modal-content").shouldBe(visible);
        $(".table-responsive").$(byText(key)).parent().shouldHave(text(value));
    }

}
