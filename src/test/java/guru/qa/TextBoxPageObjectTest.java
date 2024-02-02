package guru.qa;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

public class TextBoxPageObjectTest extends TestBase {
    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void fillFormTesyyt() {
        textBoxPage.openPage()
                .setUserName("Anna")
                .setUserEmail("ggg@ff.uu")
                .setCurrentAddress("Kazan, Parina 10")
                .setPermanentAddress("Kazan, Sakharova 59/6")
                .setSubmit()
                .checkAnswer( "Anna")
                .checkAnswer("ggg@ff.uu")
                .checkAnswer("Kazan, Parina 10")
                .checkAnswer("Kazan, Sakharova 59/6");



    }
}
