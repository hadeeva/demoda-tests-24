package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import static com.codeborne.selenide.Selenide.closeWebDriver;
public class TestBase {

        @BeforeAll
        static void beforeAll() {
            Configuration.baseUrl = "https://demoqa.com";
            Configuration.browserSize = "1920x1080";
            Configuration.browser = "chrome";
            Configuration.timeout = 10000;
            Configuration.holdBrowserOpen = true;
            Configuration.pageLoadStrategy = "eager";
        }


    }
