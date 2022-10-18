package mailru.nastasiachernega.utils;

import java.util.Random;

public class RandomGenerator {

    public int getRandomInt(int minNumber, int maxNumber) {
        Random random = new Random();
        int randomNumber = random.ints(minNumber,maxNumber).
                findFirst().getAsInt();
        return randomNumber;
    }

}
