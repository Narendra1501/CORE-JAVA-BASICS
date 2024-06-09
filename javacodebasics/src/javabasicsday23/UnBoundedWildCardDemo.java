package javabasicsday23;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class UnBoundedWildCardDemo {
    public static void main(String[] args) 
    {
        List<Integer> inList = Arrays.asList(1, 2, 3);
        System.out.println("Display Integer values");
        
        UnBoundedWildCard.display(inList);

        List<String> strList = Arrays.asList("One", "Two", "Three");
        System.out.println("Display String values");
        
        UnBoundedWildCard.display(strList);

        Person[] personArray = new Person[] 
        {
            new Person("Nitin", "Pune"),
            new Person("Manoj", "Mumbai"),
            new Person("Mayur", "Delhi")
        };
        List<Person> personList = Arrays.asList(personArray);
        System.out.println("Display Person values");
        
        UnBoundedWildCard.display(personList);
    }
}