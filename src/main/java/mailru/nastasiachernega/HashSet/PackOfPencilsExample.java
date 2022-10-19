package mailru.nastasiachernega.HashSet;

import mailru.nastasiachernega.utils.FakerGenerator;

import java.util.HashSet;

public class PackOfPencilsExample {

    public static void main(String[] args) {

        PackOfPencilsClass ourPack = new PackOfPencilsClass(15,
                getRandomSetOfColors(15));
        System.out.println("Our pack contains " + ourPack.amountOfPencilsInPack +
                " pencils such colors: \n" + ourPack.colors + "\n");

        ourPack.addNewColor();

        ourPack.removeColorFromSet();

        ourPack.doesTheSetContainColor();

    }

    static HashSet<String> getRandomSetOfColors(int amountOfPencilsInPack) {
        FakerGenerator fakerGenerator = new FakerGenerator();
        HashSet<String> colors = new HashSet<>();
        int i = 0;
        while (i <= amountOfPencilsInPack) {
            String randomColor = fakerGenerator.generateRandomColor();
            if (colors.contains(randomColor) == false) {
                colors.add(randomColor);
                i++;
            }
        }
        return colors;
    }

}
