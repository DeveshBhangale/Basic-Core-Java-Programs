package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class DaysOfWeek {
	public static boolean check(int day, int month, int year) {
		if(day>0 && day<32 && month>0 && month<13 && Integer.toString(year).length() == 4) {
			return true;
			}
		else
			return false;
	}

	public static void main(String[] args) {
		int day,month,year;
		String[] arr = {"Sunday","Monday","Tuesday","Wednesday", "Thursday","Friday","Saturday"};
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter Date");
			while(!sc.hasNextInt()) {
				System.out.println("Entered Input is not a number");
				sc.next();
			}
			day = sc.nextInt();
			System.out.println("Enter Month");
			month = sc.nextInt();
			System.out.println("Enter Year");
			year = sc.nextInt();
		}while(!check(day,month,year));
		sc.close();
		
		int y0 = year - (14 - month)/12;
		int x = y0 + y0/4 - y0/100 + y0/400;
		int m0 = month + 12*((14 - month)/12) - 2;
		int d0 = (day + x + 31*m0/12) %7;
	
		System.out.println("Day is "+ arr[d0]);
	}

}
