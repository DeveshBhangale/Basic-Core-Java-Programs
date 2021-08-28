package com.BasicJavaPrograms;

import java.util.Scanner;

public class LeapYear {
	public static boolean checkNumber(int x) {		
		if(Integer.toString(x).length() == 4)
			return true;
		else
			return false;
	}
	
	
	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter a 4 Digit Number");
			while(!sc.hasNextInt()) {
				System.out.println("Entered Input is not a number");
				sc.next();
			}
			year = sc.nextInt();
			
		}while(!checkNumber(year));
		sc.close();
		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println(year + " is a leap year");
	    else
	         System.out.println(year + " is not a leap year");
	}
	
}
