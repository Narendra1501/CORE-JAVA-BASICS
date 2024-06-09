package javabasicsday23;

public  class Person implements Comparable<Person>{
	
	private String name;
    private String city;
    
    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city;
    }

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

