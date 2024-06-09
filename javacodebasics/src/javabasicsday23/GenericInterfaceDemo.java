package javabasicsday23;

public class GenericInterfaceDemo {
	
	public static void main(String[] args) {
        Float arr[] = { 3.22f, 6.8f, 222.8f, 88.9f, 6.0f };
        MinMaxImpl<Float> objOne = new MinMaxImpl<>(arr);

        System.out.println("Minimum value is :" + objOne.min());
        System.out.println("Maximum value is :" + objOne.max());

        String arrOne[] = { "NAREN", "MINION", "SHANTHU", "JOOSHA", "JONASS" };
        MinMaxImpl<String> objTwo = new MinMaxImpl<>(arrOne);

        System.out.println("Minimum value is : " + objTwo.min());
        System.out.println("Maximum value is : " + objTwo.max());

        Person p[] = { new Person("PATRICIA", "MUMBAI"), new Person("FATHO", "PUNE"), new Person("DHEVESH", "DEHLI") };
        MinMaxImpl<Person> objThree = new MinMaxImpl<>(p);

        System.out.println("Minimum value is : " + objThree.min());
        System.out.println("Maximum value is : " + objThree.max());
    }
}