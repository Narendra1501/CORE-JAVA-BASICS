package javabasicsday9;

class FinalClass{
	void show() {
		System.out.println("Final class connot be inherited");
	}
}

class FinalchildClass extends FinalClass{
}

public class FinalClassdemo {

	public static void main(String[] args) {
		
		FinalClass f1 = new FinalClass();
		f1.show();

	}

}
