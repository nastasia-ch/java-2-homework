package mailru.nastasiachernega.ArrayList;

import mailru.nastasiachernega.utils.RandomGenerator;

import java.util.List;

public class LotteryTicketClass {

    int numberOfTicket;
    List<Integer> lotteryTicket;

    public LotteryTicketClass(int numberOfTicket, List<Integer> lotteryTicket) {
        this.numberOfTicket = numberOfTicket;
        this.lotteryTicket = lotteryTicket;
    }

    RandomGenerator randomGenerator = new RandomGenerator();

    public void printNumberOfLotteryTicket() {
        System.out.println("Numbers of your lottery ticket " + numberOfTicket +": ");
        for(Integer number : lotteryTicket) {
            System.out.print(number + " ");
        }
        System.out.println("\n");
    }

    public void updateNumbersOfLotteryTicket() {
        for(int i = 0; i < 6; i++) {
            lotteryTicket.set(i,randomGenerator.getRandomInt(0,10));
        }
        System.out.println("Updated");
        printNumberOfLotteryTicket();
    }

    public void removeOneNumber() {
        int randomIndex = randomGenerator.getRandomInt(0,lotteryTicket.size()-1);
        System.out.println("Remove number " + lotteryTicket.get(randomIndex) + " with index " +
                randomIndex + " from lottery ticket.");
        lotteryTicket.remove(randomIndex);
        printNumberOfLotteryTicket();
    }

    public void addNewNumber() {
        int randomNumber = randomGenerator.getRandomInt(0,10);
        lotteryTicket.add(randomNumber);
        System.out.println("Add number " + randomNumber + " in lottery ticket. ");
        printNumberOfLotteryTicket();
    }

    public void searchNumberByIndex() {
        int randomIndex = randomGenerator.getRandomInt(0,lotteryTicket.size()-1);
        int searchingNumber = lotteryTicket.get(randomIndex);
        System.out.println("Searching number by index " + randomIndex + " is " + searchingNumber + "\n");
    }

    public void doesTheLotteryTicketContainNumber() {
        int randomNumber = randomGenerator.getRandomInt(0,10);
        System.out.println("Does the list contain number: " + randomNumber + "?");
        System.out.println(lotteryTicket.contains(randomNumber));
    }

}
