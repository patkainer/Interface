package sorting;

import java.util.Arrays;

public class ArraySortDemo {
    public static void main(String[] args) {
        int[] intArray={72,15,19,61,43,98,9,0};

        System.out.println("intArray = " + intArray);
        System.out.println("Arrays.toString(intArray) = " + Arrays.toString(intArray));

        Arrays.sort(intArray);

        System.out.println("intArray = " + intArray);

        Employee employee1 = new Employee("hans","peter","Automatisierung",2560.3);
        Employee employee2 = new Employee("franz","peter","Bier",5445);
        Employee employee3 = new Employee("Karl","peter","weint",4548);

        Employee[] employees= {employee1,employee2,employee3};

        Arrays.sort(employees);
        System.out.println("employees = " + employees);
    }
}
