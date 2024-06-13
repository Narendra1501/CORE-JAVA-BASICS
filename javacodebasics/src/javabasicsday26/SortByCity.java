package javabasicsday26;

import java.util.Comparator;

public class SortByCity implements Comparator<Person> {

	public int compare(Person p1, Person p2) {
		return p1.getCity().compareTo(p2.getCity());
	}
}

