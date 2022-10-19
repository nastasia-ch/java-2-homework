package mailru.nastasiachernega.utils;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FakerGenerator {

    Faker faker = new Faker(new Locale("en"));

    public String generateRandomFirstName() {
        String firstName = faker.name().firstName();
        return firstName;
    }

    public String generateRandomColor() {
        String color = faker.color().name();
        return color;
    }

}
