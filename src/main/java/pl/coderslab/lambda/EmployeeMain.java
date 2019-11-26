package pl.coderslab.lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("arek", "jozwiak", LocalDate.now(), 1200.5, 'm'));
        employees.add(new Employee("arek", "njozwiak", LocalDate.now(), 3600.0, 'c'));
        employees.add(new Employee("arek", "ujozwiak", LocalDate.of(1983, 12, 18), 1200.5, 'c'));


//employees.stream().filter(e->e.getLastName().startsWith("n"))
//        .forEach(System.out::println);

        employees.stream()
                .filter(e -> e.getDayOfBirth().isBefore(LocalDate.of(1989, 11, 26)) &&
                e.getDayOfBirth().isAfter(LocalDate.of(1974, 11, 26))
        ).forEach(System.out::println);
    }
}
