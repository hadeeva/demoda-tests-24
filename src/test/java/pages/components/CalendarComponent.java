package pages.components;

import com.github.javafaker.Faker;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    private final Faker faker = new Faker();
    public void setDate(String day, String month, String year) {


        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day--0" + day + ":not(.react-datepicker__day--outside-month)").click();
    }
}
