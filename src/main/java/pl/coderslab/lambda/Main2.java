package pl.coderslab.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Wojtek", "Ania", "Magda", "Zosia", "aa");

        names.forEach(System.out::println);
        names.forEach(s -> System.out.println(s));

        int[] tab = new int[12];




        names.stream()
                .filter(a -> a.length() > 3)
                .map(b -> b.substring(3))
                .map(String::toUpperCase)
                .map(w -> w.toUpperCase())
                .filter(a -> a.charAt(0) == 'a')
                .forEach(System.out::println)

        ;


        Collections.sort(names, (a, b) -> a.compareToIgnoreCase(b));

        List<Dwarf> dwarves =
                Arrays.asList(new Dwarf(20), new Dwarf(22),
                        new Dwarf(88));

        Collections.sort(dwarves);


    }
}
