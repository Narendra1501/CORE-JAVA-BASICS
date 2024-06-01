package javabasicsday12;

public class HierarchicalInDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		System.out.println("--------------person Details-------");
        System.out.println(p1);
        
        Person p;
        p = new Person ("Dhruv","munbai");
        if (p instanceof Person)
        	System.out.println("Person Details"+ p);
        
        Employee E;
        E = new Employee("Nikhil","mumbai",101,67000,"sales");
        if (E instanceof Employee)
        	System.out.println("Employee Details"+ E);
        
        Student S;  
        S = new Student ("sarwesh",88);
        if (S instanceof Student)
        	System.out.println("Student Details"+S);
        
        
        
        
        
        	
	}

}
