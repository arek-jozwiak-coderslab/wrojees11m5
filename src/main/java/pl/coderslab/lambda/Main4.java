package pl.coderslab.lambda;

import java.util.function.Predicate;

public class Main4 {
    public static void main(String[] args) {
        Predicate isString = s -> {
            if (s instanceof String) {
                System.out.println(s);
                return true;
            }
            return false;
        };




        isString.test(123);
        isString.test("asd");
    }
}
