package javabasicsday23;

public class GenericConstructors {

	private double v;
	
	public <T extends Number>GenericConstructors()
	{
		Number t = null;
		v=t.doubleValue();
	}
	
	void show()
	{
		System.out.println("value of v in double type is:"+v);
	}



}
