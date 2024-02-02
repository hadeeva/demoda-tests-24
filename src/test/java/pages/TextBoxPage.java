package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.ResponseTextBoxComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class TextBoxPage {

    private SelenideElement userName = $("#userName"),
            userEmail = $("#userEmail"),
            currentAddress = $("#currentAddress"),
            permanentAddress = $("#permanentAddress"),
            submit = $("#submit");

    ResponseTextBoxComponent responseTextBoxComponent = new ResponseTextBoxComponent();

    public TextBoxPage openPage() {
        open("/text-box");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }
     public TextBoxPage setUserName(String value) {
        userName.setValue(value);

        return this;
     }
     public TextBoxPage setUserEmail(String value) {
        userEmail.setValue(value);
        return this;
     }
     public TextBoxPage setCurrentAddress(String value) {
        currentAddress.setValue(value);
        return this;
     }
     public TextBoxPage setPermanentAddress(String value) {
        permanentAddress.setValue(value);
        return this;
     }
     public TextBoxPage setSubmit() {
        submit.click();
        return this;
     }
     public TextBoxPage checkResultBox(String key, String value) {
        responseTextBoxComponent.checkResultsBox(key,value);
        return this;
     }
}
