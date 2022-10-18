package mailru.nastasiachernega.collectionList;

import mailru.nastasiachernega.utils.FakerGenerator;
import mailru.nastasiachernega.utils.RandomGenerator;

import java.util.List;

public class SchoolClass {

    int classNumber;
    int numberOStudents;
    List<String> listOfStudents;

    public SchoolClass(int classNumber, int numberOStudents, List<String> listOfStudents) {
        this.classNumber = classNumber;
        this.numberOStudents = numberOStudents;
        this.listOfStudents = listOfStudents;
    }

    FakerGenerator fakerGenerator = new FakerGenerator();
    RandomGenerator randomGenerator = new RandomGenerator();

    public void getListOfStudents(int numberOfStudents) {
        for (int i = 0; i < numberOfStudents; i++) {
            listOfStudents.add(fakerGenerator.getFirstName());
        }
        System.out.println("Generate student list: ");
    }

    public void addNewStudentInList() {

        String randomName = fakerGenerator.getFirstName();
        listOfStudents.add(randomName);
        System.out.println("Add student " + randomName + " in list");
    }

    public void removeStudentFromList() {
        String studentNameFromList = listOfStudents.get(randomGenerator.getRandomInt(0,listOfStudents.size()));
        listOfStudents.remove(studentNameFromList);
        System.out.println("Remove student " + studentNameFromList + " from list");
    }

    public String searchStudentInListByIndex() {
        int randomIndex = randomGenerator.getRandomInt(0,listOfStudents.size());
        String searchingName = listOfStudents.get(randomIndex);
        System.out.println("Search student name by index " + randomIndex + ":");
        return searchingName;
    }

    public Boolean doesTheListContainStudentName() {
        String randomName = fakerGenerator.getFirstName();
        Boolean doesTheListContainSearchingName = listOfStudents.contains(randomName);
        System.out.println("Does the list contain student name: " + randomName + "?");
        return doesTheListContainSearchingName;
    }


}
