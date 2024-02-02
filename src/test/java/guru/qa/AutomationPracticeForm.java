package guru.qa;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class AutomationPracticeForm {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
      //Configuration.holdBrowserOpen = true; 
        Configuration.timeout = 5000; // default 4000
    }
    @Test
     void fillFromTest() {
        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        $("#firstName").setValue("Oleg");
        $("#lastName").setValue("Olegov");
        $("#userEmail").setValue("gif@mail.ru");
        $(".custom-control-label").click();
        $("#userNumber").setValue("8903636352");
        $(".react-datepicker-wrapper").click();
        $(".react-datepicker__year-select").selectOptionByValue("1905");
        $(".react-datepicker__month-select").selectOptionByValue("5");
        $(".react-datepicker__day--015").click();
        $("#subjectsInput").setValue("English").pressEnter();
        $(".custom-control-label").click();
        $("#uploadPicture").uploadFromClasspath("photo_2024-01-11_23-10-43.jpg");
        $("#currentAddress").setValue("Kazan, Parina 3");
        $("#state").click();
        $(byText("NCR")).click();
        $("#city").click();
        $(byText("Noida")).click();
        $("#submit").click();

        $(".modal-body").shouldHave(text("Oleg"));
        $(".modal-body").shouldHave(text("Olegov"));
        $(".modal-body").shouldHave(text("gif@mail.ru"));
        $(".modal-body").shouldHave(text("8903636352"));
        $(".modal-body").shouldHave(text("15 June,1905"));
        $(".modal-body").shouldHave(text("English"));
        $(".modal-body").shouldHave(text(	"photo_2024-01-11_23-10-43.jpg"));
        $(".modal-body").shouldHave(text("Kazan, Parina 3"));
        $(".modal-body").shouldHave(text("NCR Noida"));
    }
}
