package mailru.nastasiachernega.HashSet;

import mailru.nastasiachernega.utils.FakerGenerator;

import java.util.HashSet;

public class PackOfPencilsClass {

    int amountOfPencilsInPack;
    HashSet<String> colors;

    public PackOfPencilsClass(int amountOfPencilsInPack, HashSet<String> colors) {
        this.amountOfPencilsInPack = amountOfPencilsInPack;
        this.colors = colors;
    }

    FakerGenerator fakerGenerator = new FakerGenerator();

    public void addNewColor() {
        String newColor = fakerGenerator.generateRandomColor();
        if (colors.contains(newColor)) {
            System.out.println("We already have " + newColor + " pencil in our pack. " +
                    "It can't be added again. \n" + "Our pack still contains pencils with next colors: ");
            }
        else {
            System.out.println(newColor + " pencil was added in our pack. \n" +
                    "Now our pack contains pencils with next colors: ");
        }
        colors.add(newColor);
        System.out.println(colors + "\n");
    }

    public void removeColorFromSet() {
        String randomColor = fakerGenerator.generateRandomColor();
        if (colors.contains(randomColor)) {
            colors.remove(randomColor);
            System.out.println(randomColor + " pencil was removed from our pack. \n" +
                    "Now our pack contains pencils with next colors: \n" + colors + "\n");
        }
        else {
            System.out.println("There is not " + randomColor + " pencil in our pack. " +
                    "We can't remove it. \n" + "Our pack still contains pencils with next colors: \n" +
                    colors + "\n");
        }
    }

    public void doesTheSetContainColor() {
        String randomColor = fakerGenerator.generateRandomColor();
        System.out.println("Does our pack contains " + randomColor + " pencil ?");
        System.out.println(colors.contains(randomColor));
    }

}






