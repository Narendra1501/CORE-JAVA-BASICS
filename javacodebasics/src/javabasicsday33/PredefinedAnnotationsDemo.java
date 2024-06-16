package javabasicsday33;

import java.util.ArrayList; 
import java.util.List;

public class PredefinedAnnotationsDemo {
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        
        @SuppressWarnings("rawtypes")
        List al = new ArrayList(); // USING RAW TYPE TO ALLOW MIXED TYPE ELEMENTS
        Student s2 = new Student(102, "Rashmi", "ECE"); // CREATING A STUDENT OBJECT
        al.add(10); // ADDING AN INTEGER
        al.add(22.22f); // ADDING A FLOAT
        al.add(new Student(101, "Gayatri", "CS")); // ADDING A STUDENT OBJECT
        al.add("SKSJIT"); // ADDING A STRING
        al.add(s2); // ADDING ANOTHER STUDENT OBJECT
    }
}






