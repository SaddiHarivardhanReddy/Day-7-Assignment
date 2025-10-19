package com.codegnan.operatorexamples;

import java.util.Scanner;

public class incomeTaxCalculator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Salary");
		long salary=s.nextLong();
		double incomeTax=(salary<=300000)?salary*0.05:(salary>300000 && salary<=1000000)?salary*0.1:salary*0.15;
		double bonus = (salary > 2000000) ? incomeTax * 0.01 : 0;
		incomeTax += bonus;
		if (bonus > 0)
   		 System.out.println("Bonus is: " + bonus);
		salary-=incomeTax;
		System.out.println("Income tax is: "+incomeTax);
		System.out.println("Salary after tax and bonus deduction: "+salary);
		s.close();
		
	}

}


