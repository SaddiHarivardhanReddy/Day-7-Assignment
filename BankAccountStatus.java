package com.codegnan.operatorexamples;
import java.util.Scanner;

public class BankAccountStatus {

	public static void main(String[] args) {
		System.out.println("Enter account balance");
		Scanner s=new Scanner(System.in);
		double balance=s.nextDouble();
		String accountStatus=(balance>=1000)?"Good Standing":(balance>=500 && balance<999)?"Low Balance":"Account Overdrawn";
		System.out.println("Bank Account Status: "+accountStatus);
		s.close();
	}
}
