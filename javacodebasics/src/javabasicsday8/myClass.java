package javabasicsday8;

public class myClass {

	private static myClass obj=new myClass();
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	private myClass() {
		System.out.println("MyClass object created");
	}
	
	public static myClass getobject()
	{
		return obj;
	}
	@Override
	public String toString() {
		return "myClass [id=" + id + "]";
	}
	
	

	

}
