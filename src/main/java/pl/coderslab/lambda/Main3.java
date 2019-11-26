package pl.coderslab.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    private static final String EXIT = "exit";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();
        while (true) {
            String s = scanner.nextLine();
            if (s.equalsIgnoreCase(EXIT)) {
                break;
            }
            strings.add(s);
        }
        Collections.sort(strings, (s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println(strings);
    }
}
