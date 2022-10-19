package mailru.nastasiachernega.collectionSet;

public class PackOfPencilsExample {

    public static void main(String[] args) {

        PackOfPencilsClass ourPack = new PackOfPencilsClass(20);

        ourPack.setColors(ourPack.getSetOfColors(ourPack.amountPencilsInPack));
        System.out.println(ourPack.colors);

        ourPack.addNewColor();
        System.out.println(ourPack.colors);

        ourPack.removeColorFromSet();
        System.out.println(ourPack.colors);

        ourPack.doesTheSetContainColor();

    }

}
