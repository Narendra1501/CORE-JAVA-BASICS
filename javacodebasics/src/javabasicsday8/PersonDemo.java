package javabasicsday8;

import java.util.Scanner;

public class PersonDemo {

    public static void main(String args[]) {
        
        Person p1 = new Person(); 

        Scanner sc = new Scanner(System.in);
        String name, city;
        int age;
        
        System.out.println("Enter Person details: Name, age, and city");
        name = sc.nextLine();
        age = sc.nextInt();
        sc.nextLine();
        city = sc.nextLine();
        
        p1.setName(name);
        p1.setAge(age);
        p1.setCity(city);
        System.out.println("Person Details: Name: " + p1.getName() + "\tAge: " + p1.getAge() + "\tCity: " + p1.getCity());

        System.out.println("Enter Person details: Name, age, and city");
        name = sc.nextLine();
        age = sc.nextInt();
        sc.nextLine(); 
        city = sc.nextLine();
        p1 = new Person(name, age, city); 
        System.out.println("Person Details: Name: " + p1.getName() + "\tAge: " + p1.getAge() + "\tCity: " + p1.getCity());
        
        sc.close();
    }
}