package mailru.nastasiachernega.utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class FakerGenerator {

    Faker faker = new Faker(new Locale("en"));

    public String getFirstName() {
        String firstName = faker.name().firstName();
        return firstName;
    }

}
