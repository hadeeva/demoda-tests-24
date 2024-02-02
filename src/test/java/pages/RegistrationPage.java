package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.ResponseTableComponent;

import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

    public class RegistrationPage {
        private SelenideElement firstNameInput = $("#firstName"),
                lastNameInput = $("#lastName"),
                genderWrapper = $("#genterWrapper"),
                userNumberInput = $("#userNumber"),
                calendarInput = $("#dateOfBirthInput"),
                uploadPicture = $("#uploadPicture"),
                address = $("#currentAddress"),
                state = $("#state"),
                city = $("#city"),
                sudjectsInput = $("#subjectsInput"),
                hobbies = $("#hobbiesWrapper"),
                submit = $("#submit"),
                modalComponent = $(".modal-content");







        CalendarComponent calendarComponent = new CalendarComponent();
        ResponseTableComponent responseTableComponent = new ResponseTableComponent();

        public RegistrationPage openPage() {
            open("/automation-practice-form");
            $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
            executeJavaScript("$('#fixedban').remove()");
            executeJavaScript("$('footer').remove()");

            return this;
        }

        public RegistrationPage setFirstName(String value) {
            firstNameInput.setValue(value);

            return this;
        }

        public RegistrationPage setLastName(String value) {
            lastNameInput.setValue(value);

            return this;
        }


        public RegistrationPage setGender(String value) {
            genderWrapper.$(byText(value)).click();

            return this;
        }

        public RegistrationPage setUserNumber(String value) {
            userNumberInput.setValue(value);

            return this;
        }

        public RegistrationPage setDateOfBirth(String day, String month, String year) {
            calendarInput.click();
            calendarComponent.setDate(day, month, year);

            return this;
        }

        public RegistrationPage setUploadPicture(String value) {
            uploadPicture.uploadFromClasspath(value);
            return this;
        }

        public RegistrationPage setAddress(String value) {
            address.setValue(value);
            return this;

        }

        public RegistrationPage setState(String value) {
            state.click();
            $(byText(value)).click();

            return this;
        }

        public RegistrationPage setCity(String value) {
            city.click();
            $(byText(value)).click();
            return this;
        }

        public RegistrationPage setSubjects(String value) {
            sudjectsInput.setValue("English").pressEnter();
            return this;
        }

        public RegistrationPage setHobbies(String value) {
            hobbies.$(byText(value)).click();

            return this;
        }

        public RegistrationPage setSubmit() {
            submit.click();
            return this;
        }

        public RegistrationPage checkResult(String key, String value) {
            responseTableComponent.checkResultsTable(key,value);

            return this;
        }
        public RegistrationPage notVisibleTable() {
            modalComponent.shouldBe(hidden);

            return this;

        }

       }


