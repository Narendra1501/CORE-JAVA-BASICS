package javabasicsday29;

public class LambdawithoutParameter {

public static void main(String[] args) {
		
		IStatement s = () -> {return "Hello World!!";};
		System.out.println(s.show());


	}

}
