package pl.coderslab.streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("arek", "jozwiak", LocalDate.now(), 1200.5, 'm'));
        employees.add(new Employee("arek", "njozwiak", LocalDate.now(), 3000.0, 'f'));
        employees.add(new Employee("arek", "ujozwiak", LocalDate.of(1983, 12, 18), 1200.5, 'c'));


//employees.stream().filter(e->e.getLastName().startsWith("n"))
//        .forEach(System.out::println);

        employees.stream()
                .filter(e -> e.getDayOfBirth().isBefore(LocalDate.of(1989, 11, 26)) &&
                        e.getDayOfBirth().isAfter(LocalDate.of(1974, 11, 26))
                ).forEach(System.out::println);

        employees.stream()
                .filter(e -> e.getDayOfBirth().isBefore(LocalDate.of(1989, 11, 26)) &&
                        e.getDayOfBirth().isAfter(LocalDate.of(1974, 11, 26))

                ).filter(e -> e.getSex() == 'f')
                .filter(e -> e.getSalary() < 3500)
                .peek(e -> e.setSalary(e.getSalary() * 1.05))
                .forEach(System.out::println);

        int sum = employees.stream()
                .map(e -> e.getFirstName().length())
                .mapToInt(i -> i).sum();
        System.out.println(sum);


    }
}
