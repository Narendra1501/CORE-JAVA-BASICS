package javabasicsday23;

import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildCardDemo 
     {
    public static void main(String args[]) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        System.out.println("Display Integer Values");
        
        LowerBoundedWildcard.displayNumbers(intList);
        
        List<Number> numberList = Arrays.asList(1.0, 2.0, 3.0, 10, 4, 30);
        System.out.println("Display Number values");
        
        LowerBoundedWildcard.displayNumbers(numberList);
    }

}
