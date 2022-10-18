package mailru.nastasiachernega.collectionList;

import java.util.ArrayList;

public class SchoolClassExample {

    public static void main(String[] args) {

        SchoolClass schoolClass = new SchoolClass(10, 5,
                new ArrayList<>());

        schoolClass.getListOfStudents(schoolClass.numberOStudents);
        System.out.println(schoolClass.listOfStudents);

        schoolClass.addNewStudentInList();
        System.out.println(schoolClass.listOfStudents);

        schoolClass.removeStudentFromList();
        System.out.println(schoolClass.listOfStudents);

        System.out.println(schoolClass.searchStudentInListByIndex());

        System.out.println(schoolClass.doesTheListContainStudentName());

    }

}
