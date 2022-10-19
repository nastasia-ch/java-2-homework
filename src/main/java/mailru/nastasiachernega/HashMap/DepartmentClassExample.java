package mailru.nastasiachernega.HashMap;

import mailru.nastasiachernega.utils.FakerGenerator;
import mailru.nastasiachernega.utils.RandomGenerator;

import java.util.HashMap;

public class DepartmentClassExample {

    public static void main(String[] args) {

        FakerGenerator fakerGenerator = new FakerGenerator();

        DepartmentClass companyStructure = new DepartmentClass(fakerGenerator.generateRandomCompanyName(),
                getRandomDepartmentStructure(5));
        System.out.println("Our company " + companyStructure.companyName + " has next departments: \n"
                + companyStructure.departments + "\n");

        companyStructure.addNewDepartment();

        companyStructure.uploadInfoAboutNumberOfEmployeesInDepartment();

        companyStructure.removeDepartment();

        companyStructure.doesOurCompanyHaveDepartment();

        companyStructure.doesSomeDepartmentHaveSuchAmountOfEmployees();

    }

    static HashMap<String, Integer> getRandomDepartmentStructure(int amountOfDepartments) {
        FakerGenerator fakerGenerator = new FakerGenerator();
        RandomGenerator randomGenerator = new RandomGenerator();
        HashMap<String,Integer> departmentMap = new HashMap<>();
        int i = 0;
        while (i <= amountOfDepartments) {
            String key = fakerGenerator.generateRandomDepartmentName();
            Integer value = randomGenerator.getRandomInt(1,100);
            if (departmentMap.containsKey(key)==false) {
                departmentMap.put(key,value);
                i++;
            }
        }
        return departmentMap;
    }

}
