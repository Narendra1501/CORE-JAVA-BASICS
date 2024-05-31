package javabasicsday9;

public class MyClass {
     
	private int section;
	private static int srNo;
	
	static
	{
		System.out.println("---------within static Block--------");
		srNo=1000;
	}
	MyClass()
	{
		System.out.println("-----------within Default constructor---------");
		srNo++;
		section++;
	}
	@Override
	public String toString() {
		return "Myclass [section=" + section + "]";
	}
    static void display()
    {
    	System.out.println("serial No."+srNo);
    }
}
