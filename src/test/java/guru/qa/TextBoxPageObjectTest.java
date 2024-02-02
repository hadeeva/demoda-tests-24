package guru.qa;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import pages.TextBoxPage;
import pages.components.ResponseTextBoxComponent;

public class TextBoxPageObjectTest extends TestBase {
    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void fillFormTesyyt() {
        textBoxPage.openPage()
                .setUserName("Anna")
                .setUserEmail("ggg@ff.uu")
                .setCurrentAddress("Kazan, Parina 10")
                .setPermanentAddress("Kazan, Sakharova 59/6")
                .setSubmit();
        textBoxPage.checkResultBox("Name", "Anna")
                .checkResultBox("Email", "ggg@ff.uu")
                .checkResultBox("Current Address", "Kazan, Parina 10")
                .checkResultBox("Permananet Address", "Kazan, Sakharova 59/6");
    }
}
