package com.codegnan.operatorexamples;

import java.util.Scanner;

public class AgeGroup {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter age");
		int age=s.nextInt();
		String result=(age<=12)?"Child":(age>12 && age<=19)?"Teenager":(age>19 && age<=64)?"Adult":"Senior";
		System.out.println(result);
		s.close();
	}
}
