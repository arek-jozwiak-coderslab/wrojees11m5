package pl.coderslab.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main1 {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("sssss");
        strings.add("sssss");
        strings.add("asss");
        strings.add("bbbb");
        strings.stream()
                .filter(s -> s.startsWith("s") || s.startsWith("a"))
                .map(s -> s.toUpperCase())
                .sorted()
                .forEach(System.out::println);
        System.out.println("----------------");
        List<String> collect = strings.stream()
                .filter(s -> s.length() == 5)
                .distinct()
                .collect(Collectors.toList());

        String collect1 = strings.stream()
                .sorted()
                .map(s -> s.substring(0, 3))
                .collect(Collectors.joining(","));

    }
}
