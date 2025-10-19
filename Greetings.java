package com.codegnan.operatorexamples;

import java.util.Scanner;

public class Greetings {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter time in 24 hour format(0-23)");
		int time=s.nextInt();
		String greetings=(time>=5 && time<=12)?"Good Morning":(time>12 && time<=17)?"Good Afternoon":(time>17 && time<=22)?"Good Evening":"Good Night";
		System.out.println(greetings);
		s.close();
	}

}

