package javabasicsday23;

public class GenericMethod {
	
	public <E> void displayArrayElements(E[] elements) {
		for (E element : elements) {
			System.out.println("element is: " + element);
		}
	}
}


