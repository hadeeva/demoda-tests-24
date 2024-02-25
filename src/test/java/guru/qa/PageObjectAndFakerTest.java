package guru.qa;


import org.junit.jupiter.api.Test;
import pages.RegistrationPage;



public class PageObjectAndFakerTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    TestData testData = new TestData();

    @Test
    void fillRegistrationTest() {
        String firstName = testData.getFirstName();
        String lastName = testData.getLastName();
        String email = testData.getEmail();
        String gender = testData.getRandomGender();
        String phoneNumber = testData.getRandomPhone();
        String year = testData.getRandomYear();
        String month = testData.getRandomMonth();
        String day = testData.getRandomDay();
        String photo = testData.getRandomPhoto();
        String subjects = testData.getRandomSubjects();
        String hobbies = testData.getRandomHobbies();
        String currentAddress = testData.getRandomCurrentAddress();
        String state = testData.getState();
        String city = testData.getCity(state);


                registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender(gender)
                .setUserNumber(phoneNumber)
                .setDateOfBirth(day, month, year)
                .setUploadPicture(photo)
                .setAddress(currentAddress)
                .setState(state)
                .setCity(city)
                .setSubjects(subjects)
                .setHobbies(hobbies)
                .setSubmit();


        registrationPage.checkResult("Student Name", firstName + " " + lastName)
                .checkResult("Gender", gender)
                .checkResult("Mobile", phoneNumber)
                .checkResult("Date of Birth", day + " " + month + "," + year)
                .checkResult("Subjects", subjects)
                .checkResult("Hobbies", hobbies)
                .checkResult("Picture", photo)
                .checkResult("Address", currentAddress)
                .checkResult("State and City", state + " " + city )
                .checkResult("Student Email", email);
    }

    @Test
        void requiredFieldsTest() {
        String firstName = testData.getFirstName();
        String lastName = testData.getLastName();
        String gender = testData.getRandomGender();
        String phoneNumber = testData.getRandomPhone();

        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setGender(gender)
                .setUserNumber(phoneNumber)
                .setSubmit();

        registrationPage.checkResult("Student Name", firstName + " " + lastName)
                .checkResult("Gender", gender)
                .checkResult("Mobile", phoneNumber);
        }
    @Test
    void  unfilledFieldsTest() {
        registrationPage.openPage()
                .setSubmit()
                .notVisibleTable();
    }
}

