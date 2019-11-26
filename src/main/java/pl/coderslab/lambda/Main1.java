package pl.coderslab.lambda;

import java.util.Arrays;
import java.util.List;

public class Main1 {
    static <T> void printList(List<T> src, Filter<T> f) {
        for (T s : src) {
            if (f.check(s)) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(new Integer[]{1, 2, 3, 45, 66});

        printList(integers, new IntegerFilter());


        printList(integers, new Filter<Integer>() {
            @Override
            public boolean check(Integer integer) {
                return integer < 20;
            }
        });

        printList(integers, a -> a < 20);
    }
}
