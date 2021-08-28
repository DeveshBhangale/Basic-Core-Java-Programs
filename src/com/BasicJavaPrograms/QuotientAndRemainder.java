package com.BasicJavaPrograms;

import java.util.Scanner;

public class QuotientAndRemainder {
	public static boolean checkNumber(int a,int b) {		
		if(a>0 && b>0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter two numbers greater than 0");
			while(!sc.hasNextInt()) {
				System.out.println("Entered Input is not a number");
				sc.next();
			}
			a = sc.nextInt();
			b = sc.nextInt();
		}while(!checkNumber(a,b));
		sc.close();

	    System.out.println("Quotient = " + a/b);
	    System.out.println("Remainder = " + a%b);
	  }
}
