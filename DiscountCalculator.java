package com.codegnan.operatorexamples;

import java.util.Scanner;

public class DiscountCalculator {

	public static void main(String[] args) {
		System.out.println("enter total amount");
		Scanner s=new Scanner(System.in);
		int totalAmount=s.nextInt();
		//double discount;
		double discount=(totalAmount>=1000)?totalAmount*0.2:(totalAmount>=500 && totalAmount<1000)?totalAmount*0.1:0.0;
		double finalAmount=totalAmount-discount;
		System.out.println("Discount"+discount);
		System.out.println("Final amount to be paid is: "+finalAmount);
		s.close();
	}

}
