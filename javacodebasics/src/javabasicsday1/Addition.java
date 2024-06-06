package javabasicsday1;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		int a,b,c;
		Scanner f=new Scanner(System.in);
		System.out.println("enter the value");
		a=f.nextInt();
		b=f.nextInt();
		c=a+b;
		System.out.println("addition of a="+a+"and b="+b+"is:"+c);
	}

}
