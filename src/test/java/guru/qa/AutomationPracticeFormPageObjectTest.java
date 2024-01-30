package guru.qa;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class AutomationPracticeFormPageObjectTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillRegistrationTest() {
        registrationPage.openPage()
                .setFirstName("Alex")
                .setLastName("Egorov")
                .setGender("Other")
                .setUserNumber("1234567890")
                .setDateOfBirth("30", "July", "2008");



            //   .setUploadPicture("photo_2024-01-11_23-10-43.jpg");

          //  $("#uploadPicture").uploadFromClasspath("photo_2024-01-11_23-10-43.jpg");
         //   $("#currentAddress").setValue("Kazan, Parina 3");
         //   $("#state").click();
         //   $(byText("NCR")).click();
         //   $("#city").click();
         //   $(byText("Noida")).click();
         //   $("#submit").click();

          //  $(".modal-body").shouldHave(text("Oleg"));
          //  $(".modal-body").shouldHave(text("Olegov"));
          //  $(".modal-body").shouldHave(text("gif@mail.ru"));
           // $(".modal-body").shouldHave(text("8903636352"));
          //  $(".modal-body").shouldHave(text("15 June,1905"));
         //   $(".modal-body").shouldHave(text("English"));
          //  $(".modal-body").shouldHave(text("photo_2024-01-11_23-10-43.jpg"));
          //  $(".modal-body").shouldHave(text("Kazan, Parina 3"));
          //  $(".modal-body").shouldHave(text("NCR Noida"));

        }
    }

