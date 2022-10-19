package mailru.nastasiachernega.collectionSet;

import mailru.nastasiachernega.utils.FakerGenerator;

import java.util.HashSet;

public class PackOfPencilsClass {

    int amountPencilsInPack;
    HashSet<String> colors;

    public PackOfPencilsClass(int amountPencilsInPack) {
        this.amountPencilsInPack = amountPencilsInPack;
    }

    public void setColors(HashSet<String> colors) {
        this.colors = colors;
    }

    FakerGenerator fakerGenerator = new FakerGenerator();

    public HashSet<String> getSetOfColors(int amountPencilsInPack) {
        colors = new HashSet<>();
        int i = 0;
        while (i <= amountPencilsInPack) {
            String randomColor = fakerGenerator.generateRandomColor();
            if (colors.contains(randomColor)) {
                continue;
            }
            else {
                colors.add(randomColor);
                i++;
            }
        }
        System.out.println("Our pack contains such colors of pencils: ");
        return colors;
    }

    public void addNewColor() {
        String newColor = fakerGenerator.generateRandomColor();
        if (colors.contains(newColor)) {
            System.out.println("We already have " + newColor + " pencil in our pack. " +
                    "It can't be added again.");
            }
        else {
            System.out.println(newColor + " pencil was added in our pack");
        }
        colors.add(newColor);
    }

    public void removeColorFromSet() {
        String randomColor = fakerGenerator.generateRandomColor();
        if (colors.contains(randomColor)) {
            colors.remove(randomColor);
            System.out.println(randomColor + " pencil was removed from our pack");
        }
        else {
            System.out.println("There is not " + randomColor + " pencil in our pack. " +
                    "We can't remove it.");
        }
    }

    public void doesTheSetContainColor() {
        String randomColor = fakerGenerator.generateRandomColor();
        if (colors.contains(randomColor)) {
            System.out.println("Our pack contains " + randomColor + " pencil.");
        }
        else  {
            System.out.println("Our pack don't contain " + randomColor + " pencil.");
        }
    }

}






