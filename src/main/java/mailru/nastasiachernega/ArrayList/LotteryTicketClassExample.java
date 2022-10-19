package mailru.nastasiachernega.ArrayList;

import mailru.nastasiachernega.utils.FakerGenerator;
import mailru.nastasiachernega.utils.RandomGenerator;

import java.util.ArrayList;
import java.util.List;

public class LotteryTicketClassExample {

    public static void main(String[] args) {

        LotteryTicketClass someLotteryTicket = new LotteryTicketClass(234,
                getRandomLotteryTicket(6));
        System.out.println(someLotteryTicket.lotteryTicket);

    }

    static List<Integer> getRandomLotteryTicket(int amountOfNumbersInTicket) {
        RandomGenerator randomGenerator = new RandomGenerator();
        List<Integer> randomLotteryTicket = new ArrayList<>();
        for (int i = 0; i < amountOfNumbersInTicket; i++) {
            randomLotteryTicket.add(randomGenerator.getRandomInt(0,10));
        }
        return randomLotteryTicket;
    }

}
