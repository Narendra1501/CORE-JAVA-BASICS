package javabasicsday1;

import java.util.Scanner;

public class studentdemo {

	public static void main(String[] args) {
		int sid;
		String sname;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the sid and sname:");
		sid=s.nextInt();
		sname=s.nextLine();
		
		System.out.println("sid:"+sid+"and sname:"+sname);
		
		}

}
