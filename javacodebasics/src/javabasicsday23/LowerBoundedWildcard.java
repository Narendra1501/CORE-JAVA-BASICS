package javabasicsday23;

import java.util.List;

class LowerBoundedWildcard {
    public static void displayNumbers(List<? super Integer> list) {
        for (Object n : list) {
            System.out.println(n);
        }
    }
}