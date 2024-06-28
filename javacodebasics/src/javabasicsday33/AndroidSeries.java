package javabasicsday33;

@SmartTV(os = "android", height = 40, width = 50)
@SmartPhone()
public class AndroidSeries {
	String model;
	int screenSize;

	public AndroidSeries(String model, int screenSize) 
	{
		this.model = model;
		this.screenSize = screenSize;
	}
}


