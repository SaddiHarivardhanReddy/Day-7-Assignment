package com.codegnan.operatorexamples;

import java.util.Scanner;

public class temperatureClassification {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter temperature");
		int temperature=s.nextInt();
		String result=(temperature>30)?"Hot":(temperature>=15 && temperature<=30)?"Moderate":"Cold";
		System.out.println(result);
		s.close();
	}

}