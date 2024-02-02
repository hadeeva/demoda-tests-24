package guru.qa;


import org.junit.jupiter.api.Test;
import pages.RegistrationPage;



public class AutomationPracticeFormPageObjectTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillRegistrationTest() {
        registrationPage.openPage()
                .setFirstName("Alex")
                .setLastName("Egorov")
                .setGender("Other")
                .setUserNumber("1234567890")
                .setDateOfBirth("30", "July", "2008")
                .setUploadPicture("photo_2024-01-11_23-10-43.jpg")
                .setAddress("Kazan, Parina 3")
                .setState("NCR")
                .setCity("Noida")
                .setSubjects("English")
                .setHobbies("Music")
                .setSubmit();


        registrationPage.checkResult("Student Name", "Alex Egorov")
                .checkResult("Gender", "Other")
                .checkResult("Mobile", "1234567890")
                .checkResult("Date of Birth", "30 July,2008")
                .checkResult("Subjects", "English")
                .checkResult("Hobbies", "Music")
                .checkResult("Picture", "photo_2024-01-11_23-10-43.jpg")
                .checkResult("Address", "Kazan, Parina 3")
                .checkResult("State and City", "NCR Noida");
    }

    @Test
        void requiredFieldsTest() {
        registrationPage.openPage()
                .setFirstName("Oleg")
                .setLastName("Olegov")
                .setGender("Other")
                .setUserNumber("0987654321")
                .setSubmit();

        registrationPage.checkResult("Student Name", "Oleg Olegov")
                .checkResult("Gender", "Other")
                .checkResult("Mobile", "0987654321");



        }
    @Test
    void  unfilledFieldsTest() {
        registrationPage.openPage()
                .setSubmit()
                .notVisibleTable();

    }

}

