package pl.coderslab.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Wojtek", "Ania", "Magda", "Zosia");


        Collections.sort(names, (a, b) -> a.compareToIgnoreCase(b));

        List<Employee> employees =
                Arrays.asList(new Employee(20), new Employee(22),
                        new Employee(88));

        Collections.sort(employees);



    }
}
