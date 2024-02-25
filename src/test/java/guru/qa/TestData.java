package guru.qa;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class TestData {
    Faker faker = new Faker(new Locale("en"));

    public String getFirstName() {
        return faker.name().firstName();
    }

    public String getLastName() {
        return faker.name().lastName();
    }

    public String getEmail() {
        return faker.internet().emailAddress();
    }

    public String getRandomGender() {
        String[] genders = {"Male", "Female", "Other"};

        int randomIndex = faker.random().nextInt(genders.length - 1);
        return genders[randomIndex];
    }

    public String getRandomPhone() {
        return faker.number().digits(10);
    }

    public String getRandomMonth() {
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int randomIndex = faker.random().nextInt(month.length - 1);
        return month[randomIndex];
    }

    public String getRandomYear() {
        return String.valueOf(faker.random().nextInt(1890, 2005));
    }

    public String getRandomDay() {
        return String.format("%02d", faker.number().numberBetween(1, 28));
    }

    public String getRandomPhoto() {
        String[] photos = {"111.png", "666.jpg", "777.jpg"};
        int randomIndex = faker.random().nextInt(photos.length - 1);
        return photos[randomIndex];
    }

    public String getRandomSubjects() {
        String[] subjectss = {"English", "Chemistry", "Computer Science", "Commerce", "Economics", "Social Studies"};
        int randomIndex = faker.random().nextInt(subjectss.length - 1);
        return subjectss[randomIndex];
    }

    public String getRandomHobbies() {
        String[] hobbies = {"Sports", "Reading", "Music"};
        int randomIndex = faker.random().nextInt(hobbies.length - 1);
        return hobbies[randomIndex];
    }

    public String getRandomCurrentAddress() {
        return faker.address().fullAddress();
    }
    public String getState() {
        String[] states  = {"NCR", "Uttar Pradesh",
                "Haryana", "Rajasthan"};
        int index = faker.random().nextInt(0, states.length - 1);
        return states[index];
    }
    public String getCity(String state) {
        Map<String, String> city = new HashMap<>() {{
            put("NCR", "Delhi");
            put("NCR", "Gurgaon");
            put("NCR", "Noida");
            put("Uttar Pradesh", "Agra");
            put("Uttar Pradesh", "Lucknow");
            put("Uttar Pradesh", "Merrut");
            put("Haryana", "Karnal");
            put("Haryana", "Panipat");
            put("Rajasthan", "Jaipur");
            put("Rajasthan", "Jaiselmer");
        }};
        return city.get(state);
    }
}


