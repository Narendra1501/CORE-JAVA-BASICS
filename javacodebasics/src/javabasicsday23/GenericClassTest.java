package javabasicsday23;

public class GenericClassTest {
    public static void main(String[] args) {
        GenericClass<String> stringobj = new GenericClass<>();
        stringobj.set("Hello");
        System.out.println(stringobj.Tget());
        
        GenericClass<Integer> integerobj = new GenericClass<>();
        integerobj.set(10);
        System.out.println(integerobj.Tget());
        
        GenericClass<Person> PersonObj = new GenericClass<>();
        PersonObj.set(new Person("Ajay", "Chennai"));
        System.out.println(PersonObj.Tget());
    }
}