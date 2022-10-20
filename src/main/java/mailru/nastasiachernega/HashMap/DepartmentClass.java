package mailru.nastasiachernega.HashMap;

import mailru.nastasiachernega.utils.FakerGenerator;
import mailru.nastasiachernega.utils.RandomGenerator;

import java.util.HashMap;

public class DepartmentClass {

    String companyName;
    HashMap<String,Integer> departments;

    public DepartmentClass(String companyName, HashMap<String, Integer> departments) {
        this.companyName = companyName;
        this.departments = departments;
    }

    FakerGenerator fakerGenerator = new FakerGenerator();
    RandomGenerator randomGenerator = new RandomGenerator();

    public void addNewDepartment() {
        String newDepartment = fakerGenerator.generateRandomDepartmentName();
        Integer numberOfEmployees = randomGenerator.getRandomInt(1,500);
        if (departments.containsKey(newDepartment) == false) {
            departments.put(newDepartment,numberOfEmployees);
            System.out.println("Department " + newDepartment + " was added in map. \n" +
                    "Updated information is below: \n" + departments + "\n");
        }
    }

    public void uploadInfoAboutNumberOfEmployeesInDepartment() {
        String newDepartment = fakerGenerator.generateRandomDepartmentName();
        if (departments.containsKey(newDepartment)) {
            System.out.println("Department " + newDepartment + " is already exist. " +
                    "The number of employees will be overwritten. \n" +
                    "Updated information is below: \n" + departments + "\n");
        }
    }

    public void removeDepartment() {
        String randomDepartment = fakerGenerator.generateRandomDepartmentName();
        if (departments.containsKey(randomDepartment)) {
            departments.remove(randomDepartment);
            System.out.println(randomDepartment + " was deleted from map. \n" +
                    "Updated information is below: \n" + departments + "\n");
        }
        else {
            System.out.println("There is not " + randomDepartment + " department in the map. " +
                    "We can't remove it. Map wasn't changed: \n" + departments + "\n");
        }

    }

    public void doesOurCompanyHaveDepartment() {
        String randomDepartment = fakerGenerator.generateRandomDepartmentName();
        System.out.println("Does the map contain department " + randomDepartment + "?");
        System.out.println(departments.containsKey(randomDepartment));

    }
    public void doesSomeDepartmentHaveSuchAmountOfEmployees() {
        int randomInt = randomGenerator.getRandomInt(1,100);
        System.out.println("Does some department have " + randomInt + " employees?");
        System.out.println(departments.containsValue(randomInt));

    }

}
