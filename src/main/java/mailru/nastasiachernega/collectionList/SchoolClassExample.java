package mailru.nastasiachernega.collectionList;

import mailru.nastasiachernega.utils.FakerGenerator;

import java.util.ArrayList;
import java.util.List;

public class SchoolClassExample {

    public static void main(String[] args) {

        SchoolClass ourClass = new SchoolClass(10, "A",
                10, getRandomListOfStudents(10));
        System.out.println(ourClass.classNumber + ourClass.classLetter + " class contains " +
                ourClass.numberOStudents + " students: " + ourClass.listOfStudents);

        ourClass.addNewStudentInList();
        System.out.println("Now student list contains next students: " + ourClass.listOfStudents);

        ourClass.removeStudentFromList();
        System.out.println("Now student list contains next students: " + ourClass.listOfStudents);

        System.out.println(ourClass.searchStudentInListByIndex());

        System.out.println(ourClass.doesTheListContainStudentName());

    }

    static List<String> getRandomListOfStudents(int numberOfStudents) {
        FakerGenerator fakerGenerator = new FakerGenerator();
        List<String> listOfStudents = new ArrayList<>();
        for (int i = 0; i < numberOfStudents; i++) {
            listOfStudents.add(fakerGenerator.generateRandomFirstName());
        }
        return listOfStudents;
    }

}
